package hello.core.singleton;

public class StatefullService {

   // private int price; // 상태를 유지하는 필드

    public int order(String name, int price) {
        System.out.println("name = " + name + ", price = " + price);
        //this.price = price;
        return price;
    }

    public int getPrice() {
        //return price;
        return 0;
    }

}
