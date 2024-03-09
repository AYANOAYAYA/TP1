/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author pro
 */

public class Mavenproject2 {

    public static void main(String[] args) {
        System.out.println("Entrer un reel :");
	Scanner in = new Scanner(System.in);
	float x = in.nextFloat();
	System.out.println("Entrer un int :");
	int n = in.nextInt();
	System.out.println("Le resultat:"+pow(x,n));
    }
}