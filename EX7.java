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
	float a, b, c, delta, x1, x2;

	System.out.println("Entrer la valeur de a :");
	a = in.nextFloat();

	System.out.println("Entrer la valeur de b :");
	b = in.nextFloat();

	System.out.println("Entrer la valeur de c :");
	c = in.nextFloat();

	delta = Math.pow(b, 2) - 4 * a * c;

	if(delta = 0){
		x1 = -b / (2 * a);
		System.out.println("La solution de ce systeme est : " + x1);
	}

	else if(delta >= 0){
		x1 = (-b + Math.sqrt(delta) / (2 * a);
		x2 = (-b - Math.sqrt(delta) / (2 * a);
		System.out.println("Les solutions de ce systeme sont x1 = " + x1 + " , x2 = " + x2);
	}

	else{
		x1 = -b / (2 * a);
		x2 = Math.sqrt(Math.abs(delta)) / (2 * a);
		System.out.println("Les solutions de ce systeme sont x1 = " + x1 + " + i" + x2 + " , x2 = " + x1 + " - i" + x2);
	}
    }
}