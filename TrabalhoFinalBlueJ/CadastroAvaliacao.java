import java.util.ArrayList;

public class CadastroAvaliacao {

	public static ArrayList<Avaliacao> lista;

	public CadastroAvaliacao() {
		lista = new ArrayList<>();
	}

	public boolean add(Avaliacao a) {
		if(lista.isEmpty()){
			lista.add(a);
			return true;
		}else{
			if (lista.contains(a)) {
				return false;
			}else{
				lista.add(a);
				return true;
			}
		}
		
		
	}
	
	public void calculaMediaIndicadorFilme(){
		
		
		if(lista.isEmpty()){
			
		}else{
			ArrayList<Avaliacao> listaA = new ArrayList<>();
			listaA = getLista();
			for(int i = 0; i < listaA.size(); i++){
				double media = 0;
				int contadorDeAvaliacoes = 1;
				int nota = 0;
				for(int j = 0; j < listaA.size(); j++){
					if(j == i)
						continue;
					if(listaA.get(i).getFilme().equals(listaA.get(j).getFilme())){
						contadorDeAvaliacoes++;
						nota += lista.get(j).getNota(); 
					}
				}
				media = (listaA.get(i).getNota() + nota)/contadorDeAvaliacoes;
				lista.get(i).getFilme().setMediaIndicador(media);
			}
			
			
		}

	}
	
	public static ArrayList<Avaliacao> getLista(){
		return lista;
	}
	
	public static ArrayList<Filme> getFilmeByTag(String tag){
		ArrayList<Filme> listaF = new ArrayList<>();
		if(lista.isEmpty()){
			System.out.println("Nenhum filme com essa tag");
		}else{
			for(int i = 0; i < lista.size(); i++){
				ArrayList<String> listaT = lista.get(i).getTags();
				if(listaT.contains(tag)){
					listaF.add(lista.get(i).getFilme());
				}
			}
			
			for(int i = 0; i < listaF.size(); i++){
				for(int j = 0; j < listaF.size(); j++){
					if(j == 1)
						continue;
					if(listaF.get(i).equals(listaF.get(j))){
						listaF.remove(j);
					}
				}
			}
		}
		return listaF;
	}
	
	public static ArrayList<Filme> getFilmeByTagAndGenero(String tag, String genero){
		ArrayList<Filme> listaF = new ArrayList<>();
		if(lista.isEmpty()){
			System.out.println("Nenhum filme com essa tag e esse genero");
		}else{
			for(int i = 0; i <lista.size(); i++){
				ArrayList<String> listaT = lista.get(i).getTags();
				if(listaT.contains(tag) && lista.get(i).getFilme().getGenero().equals(genero)){
					listaF.add(lista.get(i).getFilme());
				}
			}
			for(int i = 0; i < listaF.size(); i++){
				for(int j = 0; j < listaF.size(); j++){
					if(j == 1)
						continue;
					if(listaF.get(i).equals(listaF.get(j))){
						listaF.remove(j);
					}
				}
			}
		}
		
		return listaF;
	}
	
	public static String getFilmeMaisAvaliado(){
		Filme filmeMaisAvaliado = null;
		int contadorMaior = 0;
		int contadorMenor = 0;
		ArrayList<Avaliacao> listaA = new ArrayList<>();
		
		listaA = getLista();
		if(lista.isEmpty()){
			System.out.println("Nenhum filme foi avaliado");
			return null;
		}else{
			for(int i = 0; i < listaA.size(); i++){
				contadorMenor = 0;
				contadorMenor++;
				for(int j = 0; j < listaA.size(); j++){
					if(j == i)
						continue;
					if(listaA.get(i).getFilme().equals(listaA.get(j).getFilme())){
						contadorMenor++;
					}
				}
				if(contadorMenor > contadorMaior){
					contadorMaior = contadorMenor;
					filmeMaisAvaliado = listaA.get(i).getFilme();
				}
			}
		}
		String msg = filmeMaisAvaliado.toString() + "\nAvaliações :" + contadorMaior;
		return msg;
	}
	
	public static String getPessoaQueMaisAvaliou(){
		Pessoa pessoaQueMaisAvaliou = null;
		int contadorMaior = 0;
		int contadorMenor = 0;
		ArrayList<Avaliacao> listaA = new ArrayList<>();
		
		listaA = getLista();
		if(lista.isEmpty()){
			System.out.println("Nenhum filme foi avaliado");
			return null;
		}else{
			for(int i = 0; i < listaA.size(); i++){
				contadorMenor = 0;
				contadorMenor++;
				for(int j = 0; j < listaA.size(); j++){
					if(j == i)
						continue;
					if(listaA.get(i).getPessoa().equals(listaA.get(j).getPessoa())){
						contadorMenor++;
					}
				}
				if(contadorMenor > contadorMaior){
					contadorMaior = contadorMenor;
					pessoaQueMaisAvaliou = listaA.get(i).getPessoa();
				}
			}
		}
		String msg = pessoaQueMaisAvaliou.toString() + "\nAvaliações :" + contadorMaior;
		return msg;
	}
	
	public static int getOcorrênciasTag(String tag){
		int contadorMaior = 0;
		int contadorMenor = 0;
		ArrayList<Avaliacao> listaA = new ArrayList<>();
		listaA = getLista();
		if(lista.isEmpty()){
			System.out.println("Nenhuma tag foi encontrada");
			return 0;
		}else{
			for(int i = 0; i < listaA.size(); i++){
				ArrayList<String> l = listaA.get(i).getTags();
				if(l.contains(tag))
					contadorMaior++;
			}
		}
		
		return contadorMaior;
	}
}
