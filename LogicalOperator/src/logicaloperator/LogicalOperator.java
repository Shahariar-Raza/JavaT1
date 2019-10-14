/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaloperator;

/**
 *
 * @author Shaha
 */
public class LogicalOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int subject1 = 20;
         int subject2 = 60;
         // && -> AND     || -> OR
        if ((subject1 >= 35) && (subject2 >= 35)){
        System.out.println("The Condition is true");
        } 
        else {
        System.out.println("The condition is false");
        }
        if ((subject1 >= 35) || (subject2 >= 35)){
        System.out.println("The Condition is true");
        } 
        else {
        System.out.println("The condition is false");
        }
    }
    
}
