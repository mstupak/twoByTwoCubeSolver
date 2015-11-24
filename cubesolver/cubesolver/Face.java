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
     * OR
     *
     * +--+--+
     * |UL|UR|
     * +--+--+
     * |DL|DR|
     * +--+--+
     *
    */
    
    Color tiles[];
    
    public Face()
    {
        tiles = new Color[4];
    }
    
    public Face( Face f )
    {
        tiles = new Color[4];
        
        for( int i=0; i<4; i++ )
        {
            tiles[i] = f.tiles[i];
        }
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
        
        s =  "+===+\n";
        s += "#" + tiles[FacePos.UL] + "|" + tiles[FacePos.UR] + "#\n";
        s += "+-+-+\n";
        s += "#" + tiles[FacePos.DL] + "|" + tiles[FacePos.DR] + "#\n";
        s += "+===+";
        
        return s;
    }
}
