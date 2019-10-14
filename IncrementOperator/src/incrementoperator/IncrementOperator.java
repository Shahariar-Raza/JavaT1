/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incrementoperator;

/**
 *
 * @author Shaha
 */
public class IncrementOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 10;
        
        System.out.println(++x); //preincrementation
        System.out.println(x);
        
        int y = 10;
        
        System.out.println(y++); //postincrementation
        System.out.println(y);
        
        int z = 10;
        z *= 4;      // Assignment Operator
        System.out.println(z);
        
    }
    
}
