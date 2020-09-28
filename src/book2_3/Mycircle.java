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
public class Mycircle {

    private MyPoint center;
    private int radius;

    public Mycircle() {
        this.center = new MyPoint(0, 0);
        this.radius = 1;
    }

    public Mycircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Mycircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCenterX() {
        return center.getX();
    }

    public void setCenterX(int x) {
        this.center.setX(x);
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterY(int y) {
        this.center.setY(y);
    }

    public int[] getCenterXY() {
        return new int[]{this.getCenterX(), this.getCenterY()};
    }

    public void setCenterXY(int x, int y) {
        this.center.setX(x);
        this.center.setY(y);
    }

    @Override
    public String toString() {
        return "Mycircle{" + "center=" + center + ", radius=" + radius + '}';
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getCircumference() {
        return Math.PI * this.radius * 2;
    }
    public double distance(Mycircle another){
        return this.center.distance(another.center);
    }
}
