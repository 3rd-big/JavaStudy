package tuning.log.Tcp;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

public class EchoClient implements Runnable{

//    private static String HOST = "192.168.1.179";
//    private static int PORT = 17290;

    private String HOST;
    private int PORT;
    public EchoClient(String host, int port) {
        this.HOST = host;
        this.PORT = port;
    }

    @Override
    public void run(){

//    public static void main(String[] args) {
// EventLoopGroup ���� ���ο� ��ü�� ������ �� NioEventLoopGroup ��ü�� ����
        EventLoopGroup clientGroup = new NioEventLoopGroup();

        try {
            Bootstrap b = new Bootstrap();
            b.group(clientGroup) // EventLoopGroup ����( ������ �ٸ��� 1���� ��� - ����� ä���� �ϳ��� ����)
                    .channel(NioSocketChannel.class) // ä���� ���� ����(NIO ���� ä�η� ����)
                    .handler(new ChannelInitializer<SocketChannel>() {

                        // ä�� ���������� ������ �Ϲ� ���� ä�� Ŭ������ SocketChannel ����
                        @Override
                        protected void initChannel(SocketChannel ch) throws Exception {
                            ChannelPipeline p = ch.pipeline();
                            p.addLast(new EchoClientHandler());
                        }
                    });

            ChannelFuture f = b.connect(HOST, PORT).sync();

            f.channel().closeFuture().sync();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            clientGroup.shutdownGracefully();
        }
    }
}
