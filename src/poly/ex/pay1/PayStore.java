package poly.ex.pay1;

public class PayStore {
    //결제수단 추가시 변경되는 부분
    public static Pay findPay(String option) {
        if (option.equals("kakao")){
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else {
            return new DefaultPay();
        }
    }
}
