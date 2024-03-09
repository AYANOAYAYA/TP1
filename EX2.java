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
        System.out.println("Entez le rayon du cercle : ");
	Scanner in = new Scanner(System.in);
	float r = in.nextFloat();
	System.out.println("la surface est : "+ Math.PI*pow(r,2));
    }
}