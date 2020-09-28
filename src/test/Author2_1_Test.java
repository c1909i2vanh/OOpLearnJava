/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import core.Author;
import core.Book;

/**
 *
 * @author GIANG
 */
public class Author2_1_Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Author au1 = new Author("AbC", "abc@gmail.com",'m');
        System.out.println(au1.toString());// Author toString()
        au1.setEmail("XYZ@gmail.com");
        System.out.println(au1.toString());
        Book bk1 = new Book("Java", au1, 29,99);
        System.out.println(bk1);
        System.out.println("Author's name is: "+bk1.getAuthor().getName());
        
        //Use an another instance of Author to construct a Book instance
        Book anotherBook = new Book("more Java", new Author("Paul", "paul@somewhere.com", 'm'), 29.95 );
        System.out.println(anotherBook);
        System.out.println(anotherBook.getAuthor().getEmail());
    }
    
}
