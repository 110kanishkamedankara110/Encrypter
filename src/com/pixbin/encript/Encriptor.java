/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pixbin.encript;

import java.util.ArrayList;

/**
 *
 * @author Kanishka
 */
public final class Encriptor extends Engine {

    private char encriptR1(char c) {

        int index = 0;

        for (int i = 0; i < alp.size(); i++) {
            if (alp.get(i).equals(c)) {
                index = i;

                break;
            }

        }

        int enNo = Integer.parseInt(rot1.get(index).toString());
        char ecC = alp.get(enNo).toString().toCharArray()[0];

        return ecC;

    }

    private char encriptR2(char c) {

        int index = 0;

        for (int i = 0; i < alp.size(); i++) {
            if (alp.get(i).equals(c)) {
                index = i;

                break;
            }

        }

        int enNo = Integer.parseInt(rot2.get(index).toString());
        char ecC = alp.get(enNo).toString().toCharArray()[0];

        return ecC;

    }

    private char encriptR3(char c) {

        int index = 0;

        for (int i = 0; i < alp.size(); i++) {
            if (alp.get(i).equals(c)) {
                index = i;

                break;
            }

        }

        int enNo = Integer.parseInt(rot3.get(index).toString());
        char ecC = alp.get(enNo).toString().toCharArray()[0];

        return ecC;

    }

    public String encriptString(String value) {
        StringBuffer sb = new StringBuffer();
        rot1 = new Rot1().getRot1();;
        rot2 = new Rot2().getRot2();;
        rot3 = new Rot3().getRot3();;
        char c[] = value.toCharArray();

        for (char ch : c) {

            sb.append(encriptR3(encriptR2(encriptR1(ch))));
            rotateR1();

        }
        return sb.toString();
    }

}
