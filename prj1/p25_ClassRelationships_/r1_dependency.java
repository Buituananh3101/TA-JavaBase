package prj1.p25_ClassRelationships_;

// Đặc điểm: Class A dùng Class B như một tham số trong hàm hoặc biến cục bộ. 
// Không lưu trữ B lâu dài.

public class r1_dependency {
    // Class công cụ
    static class Tool {
        void start() {
            System.out.println("Tool is running...");
        }
    }

    static class  Mechanic {
        // Mechanic "phụ thuộc" vào Tool ở đây.
        // Tool chỉ được dùng trong hàm repair, không phải là thuộc tính của Mechanic.
        public void repair(Tool tool) {
            tool.start();
            System.out.println("Repairing car...");
        }
    }
    public static void main(String[] args) {
        Mechanic a = new Mechanic();
        Tool tool = new Tool();
        a.repair(tool);
    }
}
