/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchstatement;

import java.util.Scanner;

/**
 *
 * @author Shaha
 */
public class SwitchStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("The score is : ");
        int score = scan.nextInt();
        switch(score){
            case 90 :
                System.out.println("Very Good");
                break;
            case 60 :
                System.out.println("Good");
                break;
            case 40 :
                System.out.println("ok");
                break;
            default :
                System.out.println("The Grade is not define");
        
        }        
      
    }
    
}
