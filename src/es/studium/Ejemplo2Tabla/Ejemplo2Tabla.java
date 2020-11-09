package es.studium.Ejemplo2Tabla;

import java.util.Scanner;

public class Ejemplo2Tabla
{

	public static void main(String[] args)
	{
		final int TAM = 10;
		int tabla[] = new int [TAM];
		int i;
		Scanner teclado = new Scanner(System.in);
		
		
		for (i=0; i<TAM; i++) {
			
			System.out.println("Dame el valor de tabla ["+i+"]");
			tabla[i] = teclado.nextInt();
			
				}
			teclado.close();
		
		for (i=0; i<TAM; i++) {
			
			System.out.println(tabla[i]);

	}
}

}
