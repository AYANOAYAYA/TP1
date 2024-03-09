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
	int a, b, pgcd, pgcd;

	System.out.println("Entrez le premier entier : ");
	a = in.nextInt();

	System.out.println("Entrez le deuxième entier : ");
	b = in.nextInt();

	while (b != 0) {
		temp = b;
		b = a % b;
		a = temp;
	}

	pgcd = Math.abs(a);
	System.out.println("Le PGCD de " + a + " et " + b + " est : " + pgcd);
    }
}