/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book2_3;

import java.util.Arrays;

/**
 *
 * @author GIANG
 */
public class TestMyCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mycircle c1 = new  Mycircle();
        System.out.println(c1);
        Mycircle c2 = new Mycircle(5, 5, 3);
        System.out.println(c2);
        
        c1.distance(c2);
        System.out.println(c1.distance(c2));
        System.out.println(c2.getCenter());
        System.out.println("c2 area ="+c2.getArea());
        System.out.println("c2 circumference = "+c2.getCircumference());
        Mycircle  c3 = new Mycircle();
        c3.setCenterXY(4, 6);
        int [] a =c3.getCenterXY();
        System.out.println(Arrays.toString(a));
    }
    
}
