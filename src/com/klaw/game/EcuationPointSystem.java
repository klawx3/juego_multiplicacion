/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.klaw.game;

/**
 *
 * @author LAB-315
 */
public class EcuationPointSystem {
    
    private long startTime;
    private long endTime;

    public void startResolving(){
        startTime = System.currentTimeMillis();
    }
    
    public void endResolving(){
        endTime = System.currentTimeMillis();
    }
    
    public long getDiffMillis(){
        return endTime - startTime;
    }

}
