package static1;

public class DataCountMain3 {

    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count+" + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count+" + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count+" + Data3.count);

        Data3 data4 = new Data3("D");
        System.out.println(data4.count);
        //Data3.count와 차이 없음 둘다 정적 변수에 접근
        //하지만 추천 x
        System.out.println(Data3.count);
    }
}
