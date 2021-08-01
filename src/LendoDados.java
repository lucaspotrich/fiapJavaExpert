import java.util.Scanner;
public class LendoDados {

	public static void main(String[] args) {
		  String nome;
		  System.out.println("Indique o seu nome: ");
		  Scanner leitor = new Scanner(System.in);	
		  nome = leitor.next();
		  System.out.println("Ola " + nome + " ! Seja bem vindo ao programa 001");
		  leitor.close();
	}

}
