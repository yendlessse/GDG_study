package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount = 0;

    public void addItem(Item item) {
        if (itemCount < 10){
            items[itemCount] = item;
            itemCount++;
        } else {
            System.out.println("장바구니가 가득 찼습니다.");
        }
    }

    public void displayItems(){
        int total_price = 0;
        System.out.println("장바구니 상품 출력");
        for (int i = 0 ; i < itemCount; i++) {
            System.out.print("상품명:" + items[i].getName());
            System.out.println(", 합계:" + (items[i].getPrice() * items[i].getQuantity()));
            total_price += items[i].getPrice() * items[i].getQuantity();
        }
        System.out.println("전체 가격 합:" + total_price);
    }
}
