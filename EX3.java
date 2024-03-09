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
        System.out.println("Entrer deux entriers : ");
	Scanner in =new Scanner(System.in);
	int a = in.nextInt();
	int b = in.nextInt();
	int t = a;
	a = b;
	b = t;
	System.out.println("La valeur de a :" + a + " La valeur de b :" + b );

    }
}