/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubesolver.cubesolver;

import cubesolver.cubesolver.Move;
import cubesolver.cubesolver.Turn;
/**
 *
 * @author stupak
 */
public class MoveMap {
    Move[][] moveArray = new Move[6][3];
    
    public MoveMap()
    {
        Move m;
        
        // F, CW
        m = new Move();
        m.add( new Spot(FaceName.F, FacePos.UL), new Spot(FaceName.F, FacePos.UR) );
        m.add( new Spot(FaceName.F, FacePos.UR), new Spot(FaceName.F, FacePos.DR) );
        m.add( new Spot(FaceName.F, FacePos.DR), new Spot(FaceName.F, FacePos.DL) );
        m.add( new Spot(FaceName.F, FacePos.DL), new Spot(FaceName.F, FacePos.UL) );
        
        m.add( new Spot(FaceName.U, FacePos.DL), new Spot(FaceName.R, FacePos.UL) );
        m.add( new Spot(FaceName.U, FacePos.DR), new Spot(FaceName.R, FacePos.DL) );
        
        m.add( new Spot(FaceName.R, FacePos.UL), new Spot(FaceName.D, FacePos.UR) );
        m.add( new Spot(FaceName.R, FacePos.DL), new Spot(FaceName.D, FacePos.UL) );
        
        m.add( new Spot(FaceName.D, FacePos.UL), new Spot(FaceName.L, FacePos.UR) );
        m.add( new Spot(FaceName.D, FacePos.UL), new Spot(FaceName.L, FacePos.LR) );
        
        m.add( new Spot(FaceName.L, FacePos.UL), new Spot(FaceName.U, FacePos.DR) );
        m.add( new Spot(FaceName.L, FacePos.DR), new Spot(FaceName.U, FacePos.UL) );
        
        moveArray.add( FaceName.F, Turn.CW, m );
    }
    
    public void add(FaceName f, Turn t, Move m)
    {
        move[f.ordinal()][t.ordinal()] = m;
    }
    
    public Move getMoveList(FaceName f, Turn t)
    {
        return moveArray[f][t];
    }
}
