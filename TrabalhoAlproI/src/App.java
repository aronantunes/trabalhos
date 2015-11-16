import java.util.Scanner;


public class App {
	public static void main(String[] args){
		menu();
	}

	private static void menu() {
		Scanner teclado = new Scanner(System.in);
		int op;
		do{
			System.out.println("1 - Cadastro Pessoa");
			System.out.println("2 - Cadastro Filme");
			System.out.println("3 - Cadastro Avaliacao");
			System.out.println("4 - Filme com melhor Avaliação");
			System.out.println("5 - Filmes com determinad Tag");
			System.out.println("6 - Filmes com determinada Tag e Gênero");
			System.out.println("7 - Pessoa que mais avaliou Filme;");
			System.out.println("8 - Ocorrências da Tag");
			System.out.println("0 - Sair");
			op = teclado.nextInt();
			
			switch(op){
				case 1: 
			}
		}while(op!=0);
	}
}
