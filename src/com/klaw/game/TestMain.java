/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.klaw.game;

import com.klaw.game.BinaryEcuation.Operator;
import com.klaw.game.Match.Dificulty;

/**
 *
 * @author LAB-315
 */
public class TestMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Match match = new Match(Operator.MULT, Dificulty.HARD);
        match.initMatch(5);
        
        while(match.hasNext()){
            MultEcuation ecuation = (MultEcuation) match.next();
            System.out.println(ecuation);
        }
        
    }
    
}
