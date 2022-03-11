/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taksoop2;

/**
 *
 * @author Gustav
 */
public class Rectangle implements Circumference {
 double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public double area(double x, double y){
        return x * y;
    }
    
    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double circumference() {
        return 2 * (length * width);
    }
    
    public void rectangleOut(){
        System.out.println("Rectangle Area          : " + area());
        System.out.println("Rectangle Circumference : " + circumference());
    }

    public double GetLength() {
        return length;
    }

    public double GetWidth() {
        return width;
    }


}
