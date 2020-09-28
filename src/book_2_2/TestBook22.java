/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book_2_2;

/**
 *
 * @author GIANG
 */
public class TestBook22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Author[] authors1 = new Author[2];
        authors1[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors1[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        Book testBook = new Book("Java Book",authors1,19.99,99);
        System.out.println(testBook);
        
    }

}
