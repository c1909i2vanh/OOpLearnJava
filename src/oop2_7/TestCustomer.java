/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2_7;

/**
 *
 * @author Admin
 */
public class TestCustomer {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Customer person1 = new Customer(1, "Robert", 15);
        
        System.out.println(person1.toString());
                
        Invoice member1 = new Invoice(1, person1, 1000);
        System.out.println("Ten khach hang "+member1.getCustomerName());;
        System.out.println("So tien trong tai khoan "+member1.getAmount());
        System.out.println("So tien sau khi tru phi "+member1.getAmountAfterDiscount());
    }
    
}
