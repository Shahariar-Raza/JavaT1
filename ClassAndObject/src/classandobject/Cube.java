/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classandobject;

/**
 *
 * @author Shaha
 */
public class Cube {
    int length;
    int bredth;
    int height;
    
    public int getCubeVolume(){
       return (length * bredth * height);
    }
    
    Cube() {
        length = 10;
        bredth = 20;
        height = 30;
        
    }
        
    Cube( int l, int b, int h) {
        length = l;
        bredth = b;
        height = h;
        
    }
}






