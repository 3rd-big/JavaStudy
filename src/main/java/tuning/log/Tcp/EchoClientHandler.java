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

//        System.out.println("길이 : " + stringBuilder.length());
        System.out.println("EchoClientHandler 전송내용 [" + stringBuilder.toString() + "]");

        ByteBuf messageBuffer = Unpooled.buffer();
        messageBuffer.writeBytes(stringBuilder.toString().getBytes("EUC-KR"));

        ctx.writeAndFlush(messageBuffer);
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        // 서버로부터 수신 된 데이터가 저장 된 msg 객체에서 문자열 데이터 추출
        String readMessage = ((ByteBuf) msg).toString(Charset.forName("EUC-KR"));

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("EchoClientHandler 수신내용 [");
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
