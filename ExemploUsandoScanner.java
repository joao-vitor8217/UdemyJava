package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.print("Agora digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		System.out.print("Agora fale sua idade: ");
		int idade = entrada.nextInt();
		System.out.println("Seu nome é: " + nome);
		System.out.println("Seu sobrenome é: " + sobrenome);
		System.out.println("Sua idade é de: " + idade + " anos");

		entrada.close();
		
	}

}
