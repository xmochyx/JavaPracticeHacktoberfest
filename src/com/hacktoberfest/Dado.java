package com.hacktoberfest;
import java.io.*;
public class Dado {

	public static void main(String[] args) throws IOException{

		
		
		int aleatorio = (int )(Math.random() * 6 + 1);
		
	
		System.out.println("---------------------------"
				+ "\nEl n�mero lanzado en el dado es: "+aleatorio);
		
		
		
	}

}
