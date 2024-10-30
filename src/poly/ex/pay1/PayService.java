package poly.ex.pay1;

public class PayService {
    public void processPay(String option, int amount) {
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        Pay pay = PayStore.findPay(option); //카카오 객체 또는 네이버 객체가 만들어짐
        boolean result = pay.pay(amount); //객체.pay하면 불린 타입 결과가 저장
        if (result) {
            System.out.println("결제가 성공했습니다.");
        }else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}
