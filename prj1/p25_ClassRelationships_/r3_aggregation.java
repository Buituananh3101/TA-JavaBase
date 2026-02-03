package prj1.p25_ClassRelationships_;

import java.util.ArrayList;
import java.util.List;

// Đặc điểm: "Has-a" lỏng lẻo. Đối tượng con được tạo ở bên ngoài và truyền vào. 
// Cha chết con vẫn sống ở đâu đó

public class r3_aggregation { // (Tụ hợp - Hình thoi rỗng)

//-----
    static class Student {
        private String name;
        public Student(String name) { this.name = name; }
    }

//-----
    static class Lecture {
        
        private List<Student> students; // Aggregation: Lecture chứa danh sách Student

        
        public Lecture(List<Student> students) { // Chú ý: List students được TRUYỀN từ NGOÀI vào
            this.students = students;
        }
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<Student> listSV = new ArrayList<>();
        listSV.add(new Student("An"));
        Lecture lopHoc = new Lecture(listSV);
        lopHoc = null; // Hủy lớp học, nhưng listSV và sinh viên "An" vẫn còn nguyên trong bộ nhớ.
    }



}
