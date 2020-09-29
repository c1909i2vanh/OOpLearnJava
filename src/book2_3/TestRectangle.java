/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book2_3;

/**
 *
 * @author Admin
 */
public class TestRectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyPoint p1 = new MyPoint(2, 5);
        MyPoint p2 = new MyPoint(5, 2);

        RecTangle rec1 = new RecTangle(p1 ,p2);
        System.out.println(rec1.toString());
        System.out.println("Chieu dai canh tren la");
        System.out.println(rec1.getTopLeft().distance(rec1.getTopRight()));
        System.out.println("Chieu cao canh ngang la");
        System.out.println(rec1.getTopRight().distance(rec1.getTopLeft()));
    }

}
