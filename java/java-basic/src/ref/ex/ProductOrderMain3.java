package ref.ex;


import java.util.Scanner;

public class ProductOrderMain3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("입력할 주문의 개수를 입력하세요: ");
        int n = sc.nextInt();
        sc.nextLine();

        ProductOrder[] orders = new ProductOrder[n];
        for (int i = 0; i < n; i++) {
            System.out.println((i+1)  + "번째 주문 정보를 입력하세요.");

            System.out.println("상품명 = ");
            String productName = sc.nextLine();

            System.out.println("가격 = ");
            int price = sc.nextInt();
            sc.nextLine();

            System.out.println("수량 = ");
            int quantity = sc.nextInt();
            sc.nextLine();

            orders[i] = createOrder(productName, price, quantity);
        }

        printOrder(orders);

        int totalAmount = getTotalAmount(orders);
        System.out.println("totalAmount = " + totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrder(ProductOrder[] order) {
        for (ProductOrder order1 : order) {
            System.out.println("상품명: " + order1.productName + ", 가격: " + order1.price + ", 수량: " + order1.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] order) {
        int totalAmount = 0;
        for (ProductOrder order1 : order) {
            totalAmount += order1.quantity * order1.price;
        }
        return totalAmount;
    }
}




