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
public class Move implements Iterable<List>{
    /* should probably be extending List here or something...*/
    List<MoveElement> elementList;
    
    public Iterator{
        return elementList.Iterator();
    }
    
    public Move()
    {
        elementList = new Vector();
    }
    
    public add(Spot from, Spot to)
    {
        elementList.add( new MoveElement(from, to) );
    }
}
