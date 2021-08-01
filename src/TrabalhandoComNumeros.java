import java.util.Scanner;

public class TrabalhandoComNumeros {

	
	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		int valor1;
		int valor2;
		int soma;
		int subtracao;
		double divisao;
		System.out.println("TESTE PROGRAMA Calculadora");
		System.out.println("Informe o valor1: ");
		valor1 = leitor.nextInt();
		System.out.println("Informe o valor2: ");
		valor2 = leitor.nextInt();
		soma = valor1 + valor2;
		System.out.println("valor da soma: " +soma);
		subtracao = valor1 - valor2;
		System.out.println("valor da subtracao: " +subtracao);
		divisao = valor1 / (double)valor2;
		System.out.println("valor da subtracao: " +divisao);
		leitor.close();
	}

}
