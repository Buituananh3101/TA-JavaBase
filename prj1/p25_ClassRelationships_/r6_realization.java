package prj1.p25_ClassRelationships_;

// Đặc điểm: Dùng từ khóa implements với interface. Class cam kết thực hiện hành động.

public class r6_realization {

    // Interface định nghĩa "khả năng"
    interface Flyable {
        void fly(); // Chỉ nói là "biết bay", chưa biết bay thế nào
    }

    // Bird "hiện thực hóa" hành động bay
    class Bird implements Flyable {
        @Override
        public void fly() {
            System.out.println("Bird is flapping wings to fly");
        }
    }

    // Plane "hiện thực hóa" hành động bay theo cách khác
    class Plane implements Flyable {
        @Override
        public void fly() {
            System.out.println("Plane starts engine to fly");
        }
    }

}
