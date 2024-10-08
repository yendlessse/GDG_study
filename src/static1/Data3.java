package static1;

public class Data3 {
    public String name;
    public static int count; //static
    //메서드 영역에서 관리 (힙영역에서 관리 x)

    public Data3(String name) {
        this.name = name;
        Data3.count ++;
    }
}
