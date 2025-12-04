package Application;

import entities.Order;
import entities.enums.OrderStatus;

import java.time.LocalDate;
import java.util.Date;

public class Application {
    public static void main(String[] args) {
        Order order = new Order(1080, LocalDate.now(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);

        OrderStatus o1 = OrderStatus.DELIVERED;
        OrderStatus o2 = OrderStatus.valueOf("DELIVERED");

        System.out.println("Enum 01 = " + o1);
        System.out.println("Enum 02 = " + o2);
    }
}
