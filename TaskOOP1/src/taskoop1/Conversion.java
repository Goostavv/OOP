/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskoop1;

/**
 *
 * @author Gustav
 */
public class Conversion {
   float degree;

    public Conversion(float degree) {
        this.degree = degree;
    }
    
    float convertReamur(){
        return (4 * degree)/5;
    }
    
    float convertFahrenheit(){
        return (9 * degree)/5 + 32;
    }
    
    double convertKelvin(){
        return degree + 273.15;
    }
    
    String conditionWater(){
        String condition = "Normal";
        if(degree<=0){
            condition = "Frozen";
        }else if(degree>=0 && degree<=15){
            condition = "cold";
        }else if(degree>=100){
            condition = "Boiling";
        }
        
        return condition;
    }
} 
