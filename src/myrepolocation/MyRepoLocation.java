/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myrepolocation;

/**
 *
 * @author sonia_ndonga
 */
public class MyRepoLocation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Hello World");
        System.out.println("Hello Class");
        
        Book book1 = new Book("HTML & CSS", "Jon Duckett", 2011 , "Computing");
        book1.search("John Wiley & Sons Inc");
        
        Book book2 = new Book("Atomic Habits", "James Clear", 2018 , "Self-help");
        book2.search("‎Random House Business Books");
        
    }  
}
