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
		//Avaliacao(Pessoa p, Filme f, int n, ArrayList<String> t, Date data, ArrayList<Filme> listaFilme, ArrayList<Pessoa> listaPessoa)
		//Tag(String nome, Filme f)
		//Pessoa(String nome, String email, char sexo, byte idade)
		//Filme(String titulo, int ano, String genero)
		
		Filme f = new Filme("Vigadores",2015,"Ação");
		cadastroF.add(f);
		Filme f1 = new Filme("Vingadores: Era de Ultron",2015,"Ação");
		cadastroF.add(f1);
		
		
		Integer idade = 19;
		byte i = idade.byteValue();
		Pessoa p = new Pessoa("Rafael", "asdas", 'M', i);
		cadastroP.add(p);
		Integer idade1 = 19;
		byte i1 = idade1.byteValue();
		Pessoa p1 = new Pessoa("Aron", "asdas", 'M', i);
		cadastroP.add(p1);
		Integer idade2 = 19;
		byte i2 = idade2.byteValue();
		Pessoa p2 = new Pessoa("Felipe", "asdas", 'M', i);
		cadastroP.add(p2);
		
		
		ArrayList<String> StringTags = new ArrayList<>();
		StringTags.add("divertido");
		StringTags.add("engraçado");
		Date d = new Date();
		
		Avaliacao a = new Avaliacao(p,f,5,StringTags,d,cadastroF.getLista(), cadastroP.lista);
		Avaliacao a1 = new Avaliacao(p1,f,5,StringTags,d,cadastroF.getLista(), cadastroP.lista);
		Avaliacao a2 = new Avaliacao(p1,f1,5,StringTags,d,cadastroF.getLista(), cadastroP.lista);
		Avaliacao a3 = new Avaliacao(p1,f1,5,StringTags,d,cadastroF.getLista(),cadastroP.lista);
		Avaliacao a4 = new Avaliacao(p2,f1,5,StringTags,d,cadastroF.getLista(),cadastroP.lista);
		cadastroA.add(a);
		cadastroA.add(a1);
		cadastroA.add(a2);
		cadastroA.add(a3);
		cadastroA.add(a4);
		
		//Funcionou getOcorrênciasTag
		//System.out.println(cadastroA.getOcorrênciasTag("divertido"));
		
		//FuncionouPessoaQueMaisAvaliou
		//System.out.println(cadastroA.getPessoaQueMaisAvaliou());
		
		//Funcionou mediaIndicador
		//cadastroA.calculaMediaIndicadorFilme();
		//System.out.println(f1.toString());
		
		//Funcionou getFilmeMaisAvaliado
		//System.out.println(cadastroA.getFilmeMaisAvaliado());
		
		//Funcinou getFilmeByTagAndGenero
//		ArrayList<Filme> listaFilmeTagGenero = cadastroA.getFilmeByTagAndGenero("divertido", "Ação");
//		if(listaFilmeTagGenero.isEmpty())
//			System.out.println("Nenhum filme com essa tag");
//		else{
//			for(int j = 0; j < listaFilmeTagGenero.size(); j++){
//				System.out.println(listaFilmeTagGenero.get(j).getTitulo());
//			}
//		}
		
		//Funcionou getFIlmeByTag
//		ArrayList<Filme> listaFilmeTag = cadastroA.getFilmeByTag("divertido");
//		if(listaFilmeTag.isEmpty())
//			System.out.println("Nenhum filme com essa tag");
//		else{
//			for(int j = 0; j < listaFilmeTag.size(); j++){
//				System.out.println(listaFilmeTag.get(j).getTitulo());
//			}
//		}
		//getFilmesPorTag();
		menu();
	}

	public static void menu() {
		
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
		//Funcionou getOcorrênciasTag
		System.out.println(cadastroA.getOcorrênciasTag(tag));
		
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
		System.out.println("Informe o Gênero: ");
		String genero = teclado.next();
		if(cadastroF.add(new Filme(titulo,ano,genero)));
			System.out.println("Cadastro efetuado com sucesso");
	}
	
	public static void cadastroDeAvaliacao(){
		//Avaliacao(Pessoa p, Filme f, int n, ArrayList<String> t, Date data, ArrayList<Filme> listaFilme, ArrayList<Pessoa> listaPessoa)
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
	
		ArrayList<String> t = new ArrayList<>();
		
		for(int i = 0; i < 2; i++){	
			text = teclado.next();
			if(t.add(text))
				System.out.println("Cadastrado");
		}
		
		System.out.println("Informe a nota: ");
		int nota = teclado.nextInt();
		
		Date data = new Date();
		Avaliacao a = new Avaliacao(p,f,nota,t,data, cadastroF.getLista(),cadastroP.lista);
		if(cadastroA.add(a))
			System.out.println("Cadastrado com sucesso");

	}
	
	public static void getFilmeMelhorAvaliacao(){
		//Funcionou getFilmeMaisAvaliado
		System.out.println(cadastroA.getFilmeMaisAvaliado());
	}
	
	public static void getFilmesPorTag(){
		System.out.println("Informe a Tag: ");
		String tag = teclado.next();
		//Funcionou getFIlmeByTag
		ArrayList<Filme> listaFilmeTag = cadastroA.getFilmeByTag(tag);
		if(listaFilmeTag.isEmpty())
			System.out.println("Nenhum filme com essa tag");
		else{
			for(int j = 0; j < listaFilmeTag.size(); j++){
				System.out.println(listaFilmeTag.get(j).getTitulo());
			}
		}
		
	}
	
	public static void getFilmesByTagEGenero(){
		System.out.println("Informe a Tag: ");
		String tag = teclado.next();
		System.out.println("Informe o Genero: ");
		String genero = teclado.next();
		//Funcinou getFilmeByTagAndGenero
		ArrayList<Filme> listaFilmeTagGenero = cadastroA.getFilmeByTagAndGenero(tag, genero);
		if(listaFilmeTagGenero.isEmpty())
			System.out.println("Nenhum filme com essa tag");
		else{
			for(int j = 0; j < listaFilmeTagGenero.size(); j++){
				System.out.println(listaFilmeTagGenero.get(j).getTitulo());
			}
		}
	}
	
	public static void getPessoaQueMaisAvaliou(){
		//FuncionouPessoaQueMaisAvaliou
		System.out.println(cadastroA.getPessoaQueMaisAvaliou());
	}
	
	
}
