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
public class Face {
    
    /*
     * A face is an array with four entries that represents the face as follows
     *
     * +-+-+
     * |0|1|
     * +-+-+
     * |2|3|
     * +-+-+
     *
    */
    
    Color tiles[];
    
    public Face()
    {
        tiles = new Color[4];
    }
    
    public Face(Color zero, Color one, Color two, Color three)
    {
        tiles = new Color[4];
        tiles[0]=zero;
        tiles[1]=one;
        tiles[2]=two;
        tiles[3]=three;
    }
    
    public void set(int tile, Color color)
    {
        tiles[tile] = color;
    }
    
    public Color get(int tile)
    {
        return tiles[tile];
    }
    
    public String toString()
    {
        String s;
        
        s = "+-+-+\n";
        s += "|" + tiles[0] + "|" + tiles[1] + "|\n";
        s += "+-+-+\n";
        s += "|" + tiles[2] + "|" + tiles[3] + "|\n";
        s += "+-+-+\n";
        
        return s;
    }
}
