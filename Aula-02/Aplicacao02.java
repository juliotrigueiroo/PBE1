package novoProjeto;

import java.util.Scanner;

public class Aplicacao02 {

	public static void main(String[] args) {
  Scanner sc = new Scanner(system.in);
		
		Livro livro01 = new livro("Alice no Pais","Julio Cesar");
   Livro livro02 = new Livro("Quarto de despeijo","Pedro Francisco");
   
   System.out.println("Livros disponiveis");
   System.out.print("01.");
   livro01.status();
   System.out.print("02.");
   livro02.status();
	
	System.out.println("Qual livro você quer alugar?:");
	int escolha = sc.nextint();
	}

}
