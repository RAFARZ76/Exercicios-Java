//5) Criar um programa que leia 2 n�meros inteiros, efetuar as 4 opera��es matem�ticas e mostrar os resultados.
import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		int num1 = leitor.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		int num2 = leitor.nextInt();
		
		int op1 = num1 + num2;
		System.out.println(op1);
		int op2 = num1 -num2;
		System.out.println(op2);
		int op3 = num1 * num2;
		System.out.println(op3);
		int op4 = num1 / num2;
		System.out.println(op4);

		leitor.close();
	}

}
