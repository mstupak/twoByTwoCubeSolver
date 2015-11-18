/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubesolver.cubesolver;

import cubesolver.*;
import cubesolver.cubesolver.Spot;

/**
 * The CubeSolver class implements an application that
 simply prints "Hello World!" to standard output.
 */
public class CubeSolver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Spot s = new Spot(FaceName.U, 2);
        System.out.println( s.facename() );
        System.out.println( s.pos() );
        */
        
        MoveMap mm = new MoveMap();
        Move ml;
        
        TwoByTwoCube c = new TwoByTwoCube();
        c.set(FaceName.U, Color.W, Color.W, Color.W, Color.W);
        c.set(FaceName.D, Color.Y, Color.Y, Color.Y, Color.Y);
        c.set(FaceName.F, Color.R, Color.R, Color.R, Color.R);
        c.set(FaceName.R, Color.B, Color.B, Color.B, Color.B);
        c.set(FaceName.L, Color.G, Color.G, Color.G, Color.G);
        c.set(FaceName.B, Color.O, Color.O, Color.O, Color.O);
        System.out.println(c);

        c2 = c.turn( FaceName.F, Turn.CW );
        System.out.println(c2);

        
        /* Test Face Class
        Face f = new Face(Color.W, Color.B, Color.O, Color.G);
        System.out.println(f);
        
        Face f2 = new Face();
        f2.set(FacePos.UL, Color.W);
        f2.set(FacePos.UR, Color.B);
        f2.set(FacePose.DL, Color.O);
        f2.set(FacePos.DR, Color.G);
        System.out.println(f2);
        
        for(int i = 0; i<4; i++)
        {
            System.out.println(f2.get(i));
            System.out.println("----");
        }
        */
    }
    
}
