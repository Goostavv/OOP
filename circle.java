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
public class circle implements Circumference{
    private double radius, phi = 3.14;

    public circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double area() {
        return phi * radius * radius;
    }

    @Override
    public double circumference() {
        return 2 * phi * radius;
    }

    public double CircleRadius() {
        return radius;
    }

    public double GetPhi() {
        return phi;
    }
    
    public void Outputlinkaran(){
        System.out.println("Circle Area          : " + area());
        System.out.println("Circle Circumference : " + circumference());
    }
    
}
