package pruebas;

/*
*Primer Ejercicio 
*SQA
*Pruebas
*/

import java.util.Scanner;

public class Pruebas {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un numero par");
		int numeroPar = 1;
		
		while(numeroPar>0) 
		{
			numeroPar = scan.nextInt();
			if (numeroPar%2==0)
			{
				System.out.println("Su numero es " + numeroPar);
			}
			else
			{
				System.out.println("Su numero NO es par");
			}
			System.out.println("Ciclo terminado");
		}
		
		for (int i = 0; i <= 10; i++)
		{
			if(i==3)
				break;
			System.out.println("El numero i es: " + i);
		}
	}

}
