/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myrepolocation;

/**
 *
 * @author sonia_ndonga
 */
public class Book {
    
    String name;
    String author;
    int year;
    String type;
    
    
     public Book() {
        name = "HTML & CSS";
        author = "Jon Duckett";
        year = 2011;
        type = "Computing";
        
    }
    

    public Book(String name, String author, int year, String type) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.type = type;
    }
     
    
    public void search(String publisher) {
        System.out.println("The " + name + " " + author + " is published at " + publisher);   
    }
    
    public void drive(double publisher) {
        System.out.printf(String.format("The %s written by %s is located at %f shop ", name, author, publisher));
    }
}
