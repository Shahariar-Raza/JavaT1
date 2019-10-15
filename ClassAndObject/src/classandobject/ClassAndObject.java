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
public class ClassAndObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Student mark = new Student(); // mark is called object/instance
            mark.setId(001);
            mark.setName("Mark");
            mark.setAge(20);
        System.out.println(mark.getName() + " is "+ mark.getAge() + " Years old");
        
        Cube cube = new Cube();
        System.out.println(cube.getCubeVolume());
        
        Cube cube1 = new Cube(30,30,30);
        System.out.println(cube1.getCubeVolume());
    }
    
    
    
}





