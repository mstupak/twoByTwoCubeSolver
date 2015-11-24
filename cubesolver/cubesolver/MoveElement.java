/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubesolver.cubesolver;

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
    
    public MoveElement from()
    {
        return from;
    }
    
    public MoveElement to()
    {
        return to;
    }
}
