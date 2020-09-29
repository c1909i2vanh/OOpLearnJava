/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2_8;

/**
 *
 * @author Admin
 */
public class TestCustomner2_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Customer person1 = new Customer(1, "Anderson",'m');
        System.out.println(person1.toString());
        Account member1 = new Account(10, person1, 200000);
        
        System.out.println("Thong tin tai khoan: ");
        System.out.println(member1.toString());
        System.out.println("So tien truoc khi rut "+member1.getBalance());
        System.out.println("Tru 500000 trong tk ");
        member1.withdraw(500000);
        System.out.println("Cong them 1000000");
        member1.deposit(1000000);
        System.out.println("Thong tin tk sau khi cong tien");
        System.out.println(member1.toString());
        
    }
    
}
