/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forloop;

/**
 *
 * @author Shaha
 */
public class ForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int[] myarray = {13,25,34,45,50};
          
          for (int index=0; index<5; index++){
               System.out.println(myarray[index]);
          }
          System.out.println("------------------------------------");
          for(int element : myarray){
             System.out.println(element);
          }
    }
    
}
