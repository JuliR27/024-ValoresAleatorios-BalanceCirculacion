/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author CicloM
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {

        int balance = RND.nextInt();
        System.out.printf("Balance de Circulacion....: %d%n", balance);
    }

}
