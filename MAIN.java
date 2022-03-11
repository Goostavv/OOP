/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taksoop2;

import java.util.Scanner;

/**
 *
 * @author Gustav
 */
public class MAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int loop = 1, choice = 0;
        long inputa, inputb, inputc;

        while(loop==1){
            Scanner input = new Scanner(System.in);
            System.out.println("==========================");
            System.out.println("Main Menu");
            System.out.println("==========================");
            System.out.println("1. Calculate Beam");
            System.out.println("2. Calculate Cylinder");
            System.out.print("Input : ");
            
            try{
                choice = input.nextInt();
            }catch(Exception e){
                System.out.println("cannot find the input");
            }
            
            switch(choice){
                case 1:
                    try{
                        System.out.print("Input the Height : ");
                        inputa = input.nextLong();
                        System.out.print("Input the Length : ");
                        inputb = input.nextLong();
                        System.out.print("Input the Width  : ");
                        inputc = input.nextLong();
                        
                        Beam output = new Beam(inputa, inputb, inputc);
                        output.rectangleOut();
                        output.cuboidOut();
                    }catch(Exception e){
                        System.out.println("Input Error");
                    }
                    break;
                case 2:
                    try{
                        System.out.print("Input the Height : ");
                        inputa = input.nextLong();
                        System.out.print("Input the Radius : ");
                        inputb = input.nextLong();
                        
                        Cylinder out = new Cylinder(inputa, inputb);
                        out.Outputlinkaran();
                        out.Outputtabung();
                    }catch(Exception e){
                        System.out.println("Input Error");
                    }
                    break;
                
                default:
                    break;
            }
            System.out.print("Calculate Again ? (Yes: 1 || No: 0)");

            try{
                loop = input.nextInt();
            }catch(Exception e){
                System.out.println("cannot find the input");
            }
        }   
    }
}