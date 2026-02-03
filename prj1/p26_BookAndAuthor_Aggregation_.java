package prj1;

import java.util.ArrayList;
import java.util.Scanner;

public class p26_BookAndAuthor_Aggregation_ {
    
    static class Author {
        String name, email;
        char gender;

        public Author(String name, String email, char gender) {
            this.name = name;
            this.email = email;
            this.gender = gender;
        }
        public String getName() {
            return name;
        }
        public String getEmail() {
            return email;
        }
        public char getGender() {
            return gender;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public void setGender(char gender) {
            this.gender = gender;
        }
        
        public String toString() {
            return "Author Information :" +"\n"+ 
                   name +"\n"+ 
                   email +"\n"+ 
                   gender +"\n"+ 
                   "--------------------";
        }
    }

    static class Book{
        String name;
        Author author;
        double price;
        int qty=0;
                                // aggregation
        public Book(String name, Author author, double price) {
            this.name = name;
            this.author = author;
            this.price = price;
        }
                                // aggregation
        public Book(String name, Author author, double price, int qty) {
            this.name = name;
            this.author = author;
            this.price = price;
            this.qty = qty;
        }

        public String getName() {
            return name;
        }
        public Author getAuthor() {
            return author;
        }
        public double getPrice() {
            return price;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setAuthor(Author author) {
            this.author = author;
        }
        public void setPrice(double price) {
            this.price = price;
        }
        public int getQty() {
            return qty;
        }
        public void setQty(int qty) {
            this.qty = qty;
        }
        
        public String toString(){
            return "Book Details :" +"\n"+ 
                    name +"\n"+ 
                    price +"\n"+ 
                    qty +"\n"+ 
                    author.toString();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        ArrayList<Book> b = new ArrayList<>();
        for(int i=0;i<n;i++){
            String l1 = sc.nextLine();
            double l2 = Double.parseDouble(sc.nextLine());
            int l3 = Integer.parseInt(sc.nextLine());
            String l4 = sc.nextLine();
            String l5 = sc.nextLine();
            char l6 = sc.nextLine().charAt(0);
            b.add(new Book(l1, new Author(l4, l5, l6), l2, l3));
        }

        for(Book x: b) System.out.println(x);

        sc.close();
    }
}

// 2
// Lap trinh Java
// 150.5
// 10
// Nguyen Van A
// anguyen@gmail.com
// M
// Clean Code
// 320.0
// 5
// Robert Martin
// unclebob@outlook.com
// M