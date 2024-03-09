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
        Scanner in = new Scanner(System.in);
	float a, b, x;

	System.out.println("Entrer la valeur de a :");
	a = in.nextFloat();

	System.out.println("Entrer la valeur de b :");
	b = in.nextFloat();

	x = (-b) / a;
	System.out.println("La solution de ce systeme est : " + x);
    }
}