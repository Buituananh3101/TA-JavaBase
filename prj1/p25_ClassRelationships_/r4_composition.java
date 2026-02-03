package prj1.p25_ClassRelationships_;

import java.util.ArrayList;
import java.util.List;

// Đặc điểm: "Part-of" chặt chẽ. Đối tượng cha tạo ra đối tượng con bên trong nó. 
// Cha chết là con chết.

public class r4_composition { // (Cấu thành - Hình thoi đặc)

//-----
    static class OrderItem {
        private String product;
        public OrderItem(String product) { this.product = product; }
    }

//-----
    static class Order {
        private int orderId;
        private List<OrderItem> items; // Composition 1-N: OrderItem là một phần không thể tách rời

        public Order(int orderId) {
            this.orderId = orderId;
            this.items = new ArrayList<>(); // Chú ý: List items được TẠO mới BÊN TRONG Order
        }

        public void addItem(String product) {
            items.add(new OrderItem(product)); // OrderItem được sinh ra và quản lý hoàn toàn bởi Order
        }
    }
    public static void main(String[] args) {
        
    }
    // Nếu đối tượng Order bị hủy (Garbage Collection), danh sách items bên trong cũng bay màu theo.
}
