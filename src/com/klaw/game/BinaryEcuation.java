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
//Clase declarada como publica para funcionar en la interfaz grafica
//
public interface BinaryEcuation {
 
    public enum Operator{
            SUM,SUB,MULT,DIV
    }
    
    public int getLeftOperand();
    public int getRightOperand();
    public Operator getOperator();
    public int getResult();
        
}
