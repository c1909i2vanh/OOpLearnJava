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
public class RecTangle {

    private MyPoint topLeft;
    private MyPoint bottomRight;
    private MyPoint topRight;
    private MyPoint bottomLeft;

   

    public RecTangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
        this.bottomLeft = new MyPoint(this.topLeft.getX(), this.bottomRight.getY());
        this.topRight = new MyPoint(this.bottomRight.getX(), this.topLeft.getY());
    }

    public RecTangle(int x, int y, int x1, int y1) {
        this.topLeft = new MyPoint(x, y);
        this.topRight = new MyPoint(x1, y);
        this.bottomRight = new MyPoint(x1, y1);
        this.bottomLeft = new MyPoint(x, y1);

    }

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    public MyPoint getTopRight() {
        return new MyPoint(this.bottomRight.getX(), this.topLeft.getY());
    }

  
    public MyPoint getBottomLeft() {
      return new MyPoint(this.topLeft.getX(),this.bottomRight.getY());
    }
   public double getPerimeter(){
       return (topLeft.distance(topRight)+topRight.distance(bottomRight))*2;
   }
   public double getArea(){
       return topLeft.distance(topRight)*topRight.distance(bottomRight);
   }

    @Override
    public String toString() {
        return "RecTangle[" + "topLeft=" + topLeft + ", bottomRight=" + bottomRight + ", topRight=" + topRight + ", bottomLeft=" + bottomLeft + ""
                + "\n area= "+this.getArea() +" ,Perimeter= "+this.getPerimeter()+"]";
    }
    

   

}
