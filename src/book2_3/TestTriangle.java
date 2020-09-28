/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book2_3;

/**
 *
 * @author GIANG
 */
public class TestTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(2, 2);
        MyPoint p3 = new MyPoint(3, 3);
        MyTriangle  myTr1= new MyTriangle(p1, p2, p3);
        System.out.println(myTr1.getType());
        System.out.println(p1.distance(p2));
        System.out.println(myTr1.getPerimeter());
        System.out.println(myTr1.toString());
    }

}
