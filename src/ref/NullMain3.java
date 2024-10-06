package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count=" + bigData.count); //숫자니까 0
        System.out.println("bigData.data=" + bigData.data); //참조형이니까 null

        //Null
        System.out.println("bigData.data.value=" + bigData.data.value); //bigData.data가 null값이니까 이를 참조할 수 없음

        /*
         bigData.data.value
        x001.data.value //bigData는 x001 참조값을 가진다.
        null.value //x001.data는 null 값을 가진다.
        NullPointerException //null 값에 .(dot)을 찍으면 예외가 발생한다.
         */
    }
}
