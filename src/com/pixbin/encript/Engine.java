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
public class Engine {
    protected final ArrayList alp = new Alp().getAlp();

    protected ArrayList rot1;
    protected ArrayList rot2;
    protected ArrayList rot3;

    protected int rotationsR1 = 0;
    protected int rotationsR2 = 0;
    protected int rotationsR3 = 0;

    public Engine() {
        rot1 = new Rot1().getRot1();
        rot2 = new Rot2().getRot2();
        rot3 = new Rot3().getRot3();
    }

    

   

    

    

    protected void rotateR1() {
        Engine enen = new Engine();
        ArrayList al = new ArrayList();
        for (int i = 0; i < alp.size(); i++) {

            int no = 0;
            if (Integer.parseInt(rot1.get(i).toString()) ==rot1.size()-1) {
                no = 0;

            } else {
                no = Integer.parseInt(rot1.get(i).toString()) + 1;
            }
            al.add(no);

        }
        if (rotationsR1 == rot1.size()-1) {
            rotateR2();
            rotationsR1 = 0;
        } else {
            rotationsR1++;
        }

        rot1.clear();
        rot1 = al;

    }

    private void rotateR2() {
        ArrayList al = new ArrayList();
        for (int i = 0; i < alp.size(); i++) {

            int no = 0;
            if (Integer.parseInt(rot2.get(i).toString()) == rot1.size()-1) {
                no = 0;

            } else {
                no = Integer.parseInt(rot2.get(i).toString()) + 1;
            }
            al.add(no);

        }
        if (rotationsR2 == rot1.size()-1) {
            rotateR3();
            rotationsR2 = 0;
            rotationsR1 = 0;
        } else {
            rotationsR2++;
        }
        rot2.clear();
        rot2 = al;

    }

    public void reset(){
        rotationsR1=0;
        rotationsR2=0;
        rotationsR3=0;
        
        rot1 = new Rot1().getRot1();
        rot2 = new Rot2().getRot2();
        rot3 = new Rot3().getRot3();
    }
    
    
    private void rotateR3() {
        ArrayList al = new ArrayList();
        for (int i = 0; i < alp.size(); i++) {

            int no = 0;
            if (Integer.parseInt(rot3.get(i).toString()) == rot1.size()-1) {
                no = 0;

            } else {
                no = Integer.parseInt(rot3.get(i).toString()) + 1;
            }
            al.add(no);

        }
        if (rotationsR3 == rot1.size()-1) {

            rotationsR3 = 0;
            rotationsR2 = 0;
            rotationsR1 = 0;
        } else {
            rotationsR3++;
        }
        rot3.clear();
        rot3 = al;

    }
}
