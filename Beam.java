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
public class Beam extends Rectangle implements Volume {

    double height;

    public Beam(double height, double length, double width) {
        super(length, width);
        this.height = height;
    }
    public void cuboidOut(){
        System.out.println("Cuboid Volume       : " + volume());
        System.out.println("Cuboid Surface Area : " + surface());
    }

    @Override
    public double surface() {
        return 2*(super.area()+super.area(super.GetLength(), height)+super.area(super.GetWidth(), height));
    }

    @Override
    public double volume() {
        return super.area() * height;
    }

    
}
