/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* Records automated moves related to a turn */

package cubesolver.cubesolver;

import cubesolver.cubesolver.Spot;

/**
 *
 * @author stupak
 */
public class MoveElement {
    Spot from;
    Spot to;
    
    public MoveElement(Spot from, Spot to)
    {
        this.from = from;
        this.to = to;
    }
    
    public Spot from( )
    {
        return from;
    }
    
    public Spot to( )
    {
        return to;
    }
}
