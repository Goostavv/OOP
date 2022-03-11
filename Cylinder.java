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
public class Cylinder extends circle implements Volume{
    private double height;

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    @Override
    public double surface() {
        return  2*super.area()+2*super.GetPhi()*height*super.CircleRadius();
    }

    @Override
    public double volume() {
        return super.area() * height;
    } 
    
    public void Outputtabung(){
        System.out.println("Cylinder Volume       : " + volume());
        System.out.println("Cylinder Surface Area : " + surface());
    }

    
    
}
