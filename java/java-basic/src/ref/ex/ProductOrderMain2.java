package ref.ex;


public class ProductOrderMain2 {

    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);

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




