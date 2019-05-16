package com.br.temperatura;
import java.util.Scanner;
public class ConvercaoCparaF {

	public static void main(String[] args) {
		double c = 0;
		double f = 0;
		
		Scanner s = new Scanner(System.in);
		
		
		
		System.out.println("Digite valor em celsius a ser convertido para Fahrenheit: ");
		c = s.nextDouble();
		
		f = (9 * c + 160 )/ 5;

		System.out.println("Sua temperatura em Celsius: " + c + "°");
		System.out.println("Sua temperatura em Fahrenheit: " + f + "°");
		
	}

}
