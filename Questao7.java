//7) Criar um programa que leia um valor em Real e a cota��o do d�lar, e converta esse valor em d�lares.

import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o valor em reais: ");
		String text1 = leitor.nextLine();
		
		float real = Float.parseFloat(text1);
		
		System.out.println("Qual a cota��o do d�lar? ");
		String text2 = leitor.nextLine();
		
		float dolar = Float.parseFloat(text2);
		
		float cotacao = real / dolar;
		
		System.out.println("Voc� tem: $" + cotacao);

		leitor.close();
	}

}
