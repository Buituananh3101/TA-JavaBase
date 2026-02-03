package prj1.p25_ClassRelationships_;

import java.util.ArrayList;

// Đặc điểm: Class A giữ một tham chiếu (biến) tới Class B. Hai bên tồn tại độc lập.

public class r2_association {


    class Company {
        private String name;
        public Company(String name) { this.name = name; }
    }

    class Employee {
        private String name;
        private Company company; // Association 1-1: Employee biết mình làm cho Company nào
        private ArrayList<Company> companies; // Association 1-N Employee biết mình làm cho Companys nào

        public Employee(String name, Company company) {
            this.name = name;
            this.company = company;
        }
    }

    public static void main(String[] args) {
        
    }
}
