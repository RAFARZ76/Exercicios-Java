//6) Criar um programa que leia 2 n�meros reais, efetuar as 4 opera��es matem�ticas e mostrar os resultados.
import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite o primeiro n�mero: ");
		float num1 = leitor.nextFloat();
		
		System.out.println("Digite o segundo n�mero: ");
		float num2 = leitor.nextFloat();
		
		float op1 = num1 + num2;
		System.out.println(op1);
		float op2 = num1 -num2;
		System.out.println(op2);
		float op3 = num1 * num2;
		System.out.println(op3);
		float op4 = num1 / num2;
		System.out.println(op4);

		leitor.close();
	}

}
