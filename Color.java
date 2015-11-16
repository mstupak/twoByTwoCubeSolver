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
public enum Color
{
    WHITE, RED, BLUE, ORANGE, GREEN, YELLOW;
    
    public String toString() 
    {
        switch(this) 
        {
            case WHITE: return "W";
            case RED: return "R";
            case BLUE: return "B";
            case ORANGE: return "O";
            case GREEN: return "G";
            case YELLOW: return "Y";
            default: throw new IllegalArgumentException();
        }
    }
}