package prj1.p25_ClassRelationships_;

// Đặc điểm: Dùng từ khóa extends. Quan hệ cha - con.

public class r5_inheritance {

    class Animal {
        public void eat() {
            System.out.println("Eating...");
        }
    }

    // Dog "kế thừa" Animal
    class Dog extends Animal {
        public void bark() {
            System.out.println("Gâu gâu!");
        }
    }

    // Dog d = new Dog();
    // d.eat(); // Dùng được hàm của cha
    // d.bark(); // Dùng hàm của chính mình
}
