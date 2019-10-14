/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passingparameterandreturnthevalue;

/**
 *
 * @author Shaha
 */
public class PassingparameterAndReturnThevalue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          sayHello("Johan");
          sayHello("Tom");
          sayHello("Rom");
          Add(20,19);
          Addition();
    }
    
    public static void sayHello(String name){
       System.out.println("Hello " + name);
    }
    public static void Add(int a, int b){
         System.out.println(a+b);
    }
    
    public static int Addition(){
      int a=10;
      int b= 30;
      int result =a+b;
      System.out.println(result);
      return(result);
              
      
    }
    
}
