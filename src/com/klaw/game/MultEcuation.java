/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.klaw.game;

import java.util.Random;

/**
 *
 * @author LAB-315
 */
public class MultEcuation extends EcuationPointSystem implements BinaryEcuation  {

    private int left_o;
    private int right_o;
    private Operator operator;
    private int result;

    public MultEcuation(int l_min_value, int l_max_value,
            int r_min_value, int r_max_value) {
        super();
        initElements(l_min_value, l_max_value, r_min_value, r_max_value);
    }

    private void initElements(int l_min_value, int l_max_value,
            int r_min_value, int r_max_value) {
        Random random = new Random();
        left_o = random.nextInt(l_max_value - l_min_value) + l_min_value;
        right_o = random.nextInt(r_max_value - r_min_value) + r_min_value;
        operator = Operator.MULT;
        result = left_o * right_o;
    }

    @Override
    public int getLeftOperand() {
        return left_o;
    }

    @Override
    public int getRightOperand() {
        return right_o;
    }

    @Override
    public Operator getOperator() {
        return operator;
    }

    @Override
    public int getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "MultEcuation{" + "left_o=" + left_o + ", right_o=" + right_o + ", operator=" + operator + ", result=" + result + '}';
    }
}
