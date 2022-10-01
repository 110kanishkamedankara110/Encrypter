/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pixbin.encript;

/**
 *
 * @author Kanishka
 */
public final class Decriptor extends Engine {

    private char decriptR1(char c) {
        int index = 0;
        int deval = 0;
        for (int i = 0; i < alp.size(); i++) {
            if (alp.get(i).equals(c)) {
                index = i;

                break;
            }

        }
        for (int j = 0; j < alp.size(); j++) {
            if (rot1.get(j).equals(index)) {
                deval = j;

                break;
            }

        }
        char decSt = alp.get(deval).toString().toCharArray()[0];

        return decSt;

    }

    private char decriptR2(char c) {
        int index = 0;
        int deval = 0;
        for (int i = 0; i < alp.size(); i++) {
            if (alp.get(i).equals(c)) {
                index = i;

                break;
            }

        }
        for (int j = 0; j < alp.size(); j++) {
            if (rot2.get(j).equals(index)) {
                deval = j;

                break;
            }

        }
        char decSt = alp.get(deval).toString().toCharArray()[0];

        return decSt;

    }

    private char decriptR3(char c) {
        int index = 0;
        int deval = 0;
        for (int i = 0; i < alp.size(); i++) {
            if (alp.get(i).equals(c)) {
                index = i;

                break;
            }

        }
        for (int j = 0; j < alp.size(); j++) {
            if (rot3.get(j).equals(index)) {
                deval = j;

                break;
            }

        }
        char decSt = alp.get(deval).toString().toCharArray()[0];

        return decSt;

    }

    public String decriptString(String value) {

        StringBuffer sb = new StringBuffer();
        rot1 = new Rot1().getRot1();
        rot2 = new Rot2().getRot2();
        rot3 = new Rot3().getRot3();
        char c[] = value.toCharArray();

        for (char ch : c) {

            sb.append(decriptR1(decriptR2(decriptR3(ch))));
            rotateR1();

        }
        reset();

        return sb.toString();
    }
}
