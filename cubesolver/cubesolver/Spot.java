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
public class Spot {
    FaceName f;
    int pos;
    
    public Spot(FaceName f, int pos)
    {
        this.f = f;
        this.pos = pos;
    }
    
    public FaceName facename()
    {
        return f;
    }
    
    public int pos()
    {
        return this.pos;
    }
}
