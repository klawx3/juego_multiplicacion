/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.klaw.game;

import com.klaw.game.BinaryEcuation.Operator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author LAB-315
 */
public class Match implements Iterator<BinaryEcuation> {
    private final List<BinaryEcuation> ecuations;
    private boolean inGame;
    private Operator operation;
    private Dificulty dificulty;
    private Iterator ecuationsIterator;
    
    public enum Dificulty {
        EASY, MEDIUM, HARD, EXTREME, SUPER_HUMAN
    }

    public Match(Operator operation,Dificulty dificulty){
        inGame = false;
        ecuations = new ArrayList<>();
        this.dificulty = dificulty;
    }

    public void initMatch(int ecuations_length) {
        for (int i = 0; i < ecuations_length; i++) {
            BinaryEcuation ecuation = null;
            switch(operation){
                case DIV:
                    ecuation = getMultEcuation();
                    break;
                case MULT:
                    
                break;
                
                case SUB:
                    
                    break;
                case SUM:
                    
                    break;
                    
            }
            ecuations.add(ecuation);
        }
        ecuationsIterator = ecuations.iterator();
        inGame = true;
    }
    
    private MultEcuation getMultEcuation() {
        int min, max;
        switch (dificulty) {
            case EASY:
                min = 1;
                max = 5;
                break;
            case MEDIUM:
                min = 1;
                max = 5;
                break;
            case HARD:
                min = 1;
                max = 10;
                break;
            case EXTREME:
                min = 6;
                max = 12;
                break;
            case SUPER_HUMAN:
                min = 12;
                max = 30;
                break;
            default:
                min = 1;
                max = 10;
        }
        return new MultEcuation(min,max,min,max);
    }

   
    @Override
    public boolean hasNext() {
        return ecuationsIterator.hasNext();
    }

    @Override
    public BinaryEcuation next() {
        return (BinaryEcuation) ecuationsIterator.next();
    }


    
}
