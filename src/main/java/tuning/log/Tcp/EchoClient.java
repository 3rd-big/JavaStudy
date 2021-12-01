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
// EventLoopGroup 에서 새로운 객체를 생성할 때 NioEventLoopGroup 객체를 생성
        EventLoopGroup clientGroup = new NioEventLoopGroup();

        try {
            Bootstrap b = new Bootstrap();
            b.group(clientGroup) // EventLoopGroup 설정( 서버랑 다르게 1개만 사용 - 연결된 채널이 하나만 존재)
                    .channel(NioSocketChannel.class) // 채널의 종류 설정(NIO 소켓 채널로 설정)
                    .handler(new ChannelInitializer<SocketChannel>() {

                        // 채널 파이프라인 설정에 일반 소켓 채널 클래스인 SocketChannel 설정
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
