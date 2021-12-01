package tuning.log.Tcp;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.nio.charset.Charset;

public class EchoClientHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TCPO01_S2S_TEST01");
        stringBuilder.insert(0, String.format("%04d", stringBuilder.length()));
//        stringBuilder.insert(0, "KCIMYDTOR");

//        System.out.println("���� : " + stringBuilder.length());
        System.out.println("EchoClientHandler ���۳��� [" + stringBuilder.toString() + "]");

        ByteBuf messageBuffer = Unpooled.buffer();
        messageBuffer.writeBytes(stringBuilder.toString().getBytes("EUC-KR"));

        ctx.writeAndFlush(messageBuffer);
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        // �����κ��� ���� �� �����Ͱ� ���� �� msg ��ü���� ���ڿ� ������ ����
        String readMessage = ((ByteBuf) msg).toString(Charset.forName("EUC-KR"));

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("EchoClientHandler ���ų��� [");
        stringBuilder.append(readMessage);
        stringBuilder.append("]");

        System.out.println(stringBuilder.toString());
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        ctx.close();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
