/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubesolver.cubesolver;

import cubesolver.*;

/**
 *
 * @author Mike
 */
public class TwoByTwoCube {
    
    Face faces[];
    
    public TwoByTwoCube()
    {
        faces = new Face[6];
        for(int i=0; i<6; i++)
        {
            faces[i] = new Face();
        }
    }
    
    public TwoByTwoCube( TwoByTwoCube c)
    {
        faces = new Face[6];
        for(int i=0; i<6; i++)
        {
            faces[i] = new Face(c.faces[i]);
        }
    }
    
    public void set(FaceName f, Color zero, Color one, Color two, Color three)
    {
        
        faces[f.ordinal()].set(FacePos.UL, zero);
        faces[f.ordinal()].set(FacePos.UR, one);
        faces[f.ordinal()].set(FacePos.DL, two);
        faces[f.ordinal()].set(FacePos.DR, three);
    }
    
    public void turn(MoveMap mm, FaceName f, Turn t)
    {
        Move ml = mm(f,t);
        MoveElement me;
        
        while()
    }
    
    private String zipFaces(String leftStr[], String midStr[], String rightStr[])
    {
        String s = "";
        
        for( int i=0; i<4; i++)
        {
            s += leftStr[i].substring(0, 4) + midStr[i] + rightStr[i].substring(1, 5) + "\n";
        }
        return s;
    }
    
    public String toString()
    {
        String nullTile = "";
        nullTile += "+===+\n";
        nullTile += "     \n";
        nullTile += "     \n";
        nullTile += "     \n";
        nullTile += "     ";
        
        String s;
        
        s = zipFaces(
            nullTile.split("\n", 5), 
            faces[FaceName.U.ordinal()].toString().split("\n", 5), 
            nullTile.split("\n", 5)
        );
        
        s += zipFaces(
            faces[FaceName.L.ordinal()].toString().split("\n", 5),
            faces[FaceName.F.ordinal()].toString().split("\n", 5), 
            faces[FaceName.R.ordinal()].toString().split("\n", 5)
        );
 
        s += zipFaces(
            nullTile.split("\n", 5), 
            faces[FaceName.D.ordinal()].toString().split("\n", 5), 
            nullTile.split("\n", 5)
        );
        
        s += zipFaces(
            nullTile.split("\n", 5), 
            faces[FaceName.B.ordinal()].toString().split("\n", 5), 
            nullTile.split("\n", 5)
        );
        
        s += "+===+===+===+\n";
        
        return s;
    }
}
