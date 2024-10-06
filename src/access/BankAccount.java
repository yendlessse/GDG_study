package access;

public class BankAccount {

    private int balance; //접근 제어 속성

    public BankAccount() {
        balance = 0;
    }

    //public 메서드: deposit
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        }else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    //public 메서드
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        }else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    //public 메서드
    public int getBalance() {
        return balance;
    }

    //private 메서드
    //입력금액을 검증하는 기능은 내부에서만 필요
    private boolean isAmountValid(int amount) {
        //금액이 0보다 커야함
        return amount >0;
    }
}
