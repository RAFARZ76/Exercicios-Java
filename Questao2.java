//2) Criar um programa que calcule a m�dia de 2 notas e mostrar essa m�dia na tela.

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		String num1 = leitor.next();
		
		float num1Convetido = Float.parseFloat(num1);
		
		System.out.println("Digite o segundo n�mero: ");
		String num2 = leitor.next();
		
		float num2Convertido = Float.parseFloat(num2);
		
		float resultado = (num1Convetido + num2Convertido) / 2;
		
		System.out.println("A m�dia �: " + resultado);
		
		leitor.close();
	}

}
