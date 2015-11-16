import java.io.ObjectInputStream.GetField;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class App {
	
	private static Scanner teclado = new Scanner(System.in);
	private static CadastroPessoa cadastroP = new CadastroPessoa();
	private static CadastroFilme cadastroF = new CadastroFilme();
	private static CadastroTag cadastroT = new CadastroTag();
	private static CadastroAvaliacao cadastroA = new CadastroAvaliacao();
	
	public static void main(String[] args){
		//Avaliacao(Pessoa p, Filme f, int n, ArrayList<Tags> t, Date data)
		//Tag(String nome, Filme f)
		//Pessoa(String nome, String email, char sexo, byte idade)
		//Filme(String titulo, int ano, String genero)
		
		Filme f = new Filme("R",2015,"Comedia");
		cadastroF.add(f);
		
		Tags t = new Tags("divertido",f);
		Tags t1 = new Tags("f",f);
		cadastroT.add(t);
		cadastroT.add(t1);
		
		Integer idade = 19;
		byte i = idade.byteValue();
		Pessoa p = new Pessoa("Rafa", "asdas", 'M', i);
		cadastroP.add(p);
		
		ArrayList<Tags> tss = new ArrayList<>();
		tss.add(t);
		tss.add(t1);
		
		Date d = new Date();
		Avaliacao a = new Avaliacao(p,f,2,tss,d);
		if(cadastroA.add(a))
		f.setAvaliacao(a);
		f.setTags(tss);
		p.setAvaliacao(a);
		
		menu();
	}

	public static void menu() {
		
		int op;
		do{
			System.out.println("1 - Cadastro Pessoa");
			System.out.println("2 - Cadastro Filme");
			System.out.println("3 - Cadastro Avaliacao");
			System.out.println("4 - Filme com melhor Avalia��o");
			System.out.println("5 - Filmes com determinad Tag");
			System.out.println("6 - Filmes com determinada Tag e G�nero");
			System.out.println("7 - Pessoa que mais avaliou Filme;");
			System.out.println("8 - Ocorr�ncias da Tag");
			System.out.println("0 - Sair");
			op = teclado.nextInt();
			
			switch(op){
				case 1:
					cadastroDePessoa();
					break;
				case 2:
					cadastroDeFilme();
					break;
				case 3:
					cadastroDeAvaliacao();
					break;
				case 4:
					getFilmeMelhorAvaliacao();
					break;
				case 5:
					getFilmesPorTag();
					break;
				case 6:
					getFilmesByTagEGenero();
					break;
				case 7:
					getPessoaQueMaisAvaliou();
					break;
				case 8:
					getOcorrenciaPorTag();
			}
		}while(op!=0);
	}
	
	public static void getOcorrenciaPorTag() {
		System.out.println("Informe a Tag:");
		String tag = teclado.next();
		System.out.println(cadastroT.getOcorrenciasTag(tag));
		
	}

	public static void cadastroDePessoa(){
		
		System.out.println("Informe o Nome: ");
		String nome = teclado.next();
		System.out.println("Informe a Idade: ");
		Integer idade = teclado.nextInt();
		System.out.println("Informe o Email: ");
		String email = teclado.next();
		System.out.println("Informe o Sexo(M/F): ");
		String sexo = teclado.next();
		char[] s = sexo.toCharArray();
		char sex = s[0];
		byte idadeP = idade.byteValue();
		
		if(cadastroP.add(new Pessoa(nome, email, sex, idadeP)))
			System.out.println("Cadastro efetuado com sucesso");
	}
	
	public static void cadastroDeFilme(){
		System.out.println("Informe o Titulo: ");
		String titulo = teclado.next();
		System.out.println("Informe a ano: ");
		int ano = teclado.nextInt();
		System.out.println("Informe o G�nero: ");
		String genero = teclado.next();
		if(cadastroF.add(new Filme(titulo,ano,genero)));
			System.out.println("Cadastro efetuado com sucesso");
	}
	
	public static void cadastroDeAvaliacao(){
		//Avaliacao(Pessoa p, Filme f, int n, ArrayList<Tags> t, Date data)
		//Tag(String nome, Filme f)
		//Pessoa(String nome, String email, char sexo, byte idade)
		//Filme(String titulo, int ano, String genero)
		
		System.out.println("Informe o seu nome: ");
		String nome = teclado.next();
		Pessoa p = cadastroP.getPessoa(nome);
		
		System.out.println("Informe o titulo do Filme: ");
		String tituloFilme = teclado.next();
		Filme f = cadastroF.getFilmeTitulo(tituloFilme);
		
		System.out.println("Informe as tags: (5 tags por vez)");
		String text = "";
	
		ArrayList<Tags> t = new ArrayList<>();
		
		for(int i = 0; i < 5; i++){	
			text = teclado.next();
			if(t.add(new Tags(text,f)))
				System.out.println("Cadastrado");
		}
		
		System.out.println("Informe a nota: ");
		int nota = teclado.nextInt();
		
		Date data = new Date();
		Avaliacao a = new Avaliacao(p,f,nota,t,data);
		if(cadastroA.add(a))
			System.out.println("Cadastrado com sucesso");
		f.setAvaliacao(a);
		f.setTags(t);
		p.setAvaliacao(a);
	}
	
	public static void getFilmeMelhorAvaliacao(){
		System.out.println("Maior Avalicao: "+cadastroF.getFilmeMaisAvalicoes());
	}
	
	public static void getFilmesPorTag(){
		System.out.println("Informe a Tag: ");
		String tag = teclado.next();
		ArrayList<Filme> f = cadastroT.getFilmesPorTag(tag);
		if(f.isEmpty()){
			System.out.println("Lista Vazia");
		}else{
			for(int i = 0; i < f.size(); i++){
				System.out.println(f.get(i).getTitulo());
			}
		}
		
	}
	
	public static void getFilmesByTagEGenero(){
		System.out.println("Informe a Tag: ");
		String tag = teclado.next();
		System.out.println("Informe o Genero: ");
		String genero = teclado.next();
		ArrayList<Filme> f = cadastroF.getFilmeByGeneroETag(genero, tag);
		if(f.isEmpty()){
			System.out.println("N�o encontrado");
		}else{
			for(int i = 0; i < f.size(); i++){
				System.out.println(f.get(i).getTitulo());
			}
		}
	}
	
	public static void getPessoaQueMaisAvaliou(){
		Pessoa p = cadastroP.getPessoaComMaisAvaliacoes();
		System.out.println(p.toString());
	}
}
