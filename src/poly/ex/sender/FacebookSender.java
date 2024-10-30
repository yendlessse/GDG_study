package poly.ex.sender;

public class FacebookSender implements Sender {

    @Override
    public void sendMessage(String s) {
        System.out.print("페이스북에 발송합니다: " + s);
        System.out.println();
    }
}
