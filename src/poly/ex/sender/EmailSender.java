package poly.ex.sender;

public class EmailSender implements Sender {

    @Override
    public void sendMessage(String s) {
        System.out.print("메일을 발송합니다: " +s);
        System.out.println();
    }
}
