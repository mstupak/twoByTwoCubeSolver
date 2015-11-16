/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubesolver.cubesolver;

import cubesolver.*;

/**
 * The CubeSolver class implements an application that
 simply prints "Hello World!" to standard output.
 */
public class CubeSolver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TwoByTwoCube c = new TwoByTwoCube();
        
        System.out.println(c);
        
        Face f = new Face(Color.WHITE, Color.BLUE, Color.ORANGE, Color.GREEN);
        
        System.out.println(f);
        
    }
    
}
