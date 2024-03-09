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
	int n, fact=1, i;

	do{
	System.out.println("Entrer un entier :");
	n = in.nextFloat();
	}while(n < 0);

	if(n == 0 || n == 1)
		System.out.println(n + "! = " + fact);
	else{
		for(i = n; i >= 2; i--)
			fact *= n;
		System.out.println(n + "! = " + fact);
	}
   }
}