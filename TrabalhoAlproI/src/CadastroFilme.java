import java.util.ArrayList;
public class CadastroFilme {
	
	public static ArrayList<Filme> lista;
	
	
	public CadastroFilme() {
		lista = new ArrayList<Filme>();
	}
	
	public boolean add(Filme f){
		if(lista.isEmpty()){
			lista.add(f);
			return true;
		}else{
			if(lista.contains(f))
				return false;
			else{
				lista.add(f);
				return true;
			}
		}
	}
	
	public int getTamanho(){
		return lista.size();
	}
	
	public static ArrayList<Filme> getLista(){
		return lista;
	}
	
	public Filme getFilmeTitulo(String titulo){
		for(int i = 0; i < lista.size(); i++){
			if(lista.get(i).getTitulo().equals(titulo))
				return lista.get(i);
		}
		return null;
	}
	
	public ArrayList<Filme> getFilmeGenero(String genero){
		ArrayList<Filme> listaGenero = new ArrayList<>();
		for(int i = 0; i< lista.size(); i++){
			if(lista.get(i).getGenero().equals(genero)){
				listaGenero.add(lista.get(i));
			}
		}
		
		return listaGenero;
	}
	
	public ArrayList<Filme> getFilmeAno(int ano){
		ArrayList<Filme> listaAno = new ArrayList<>();
		for(int i = 0; i < lista.size(); i++){
			if(lista.get(i).getAno() == ano)
				listaAno.add(lista.get(i));
		}
		
		return listaAno;
	}
	
	public Filme getFilmeMaisAvalicoes(){
		ArrayList<Filme> f = new ArrayList<>();
		f = (ArrayList<Filme>) lista.clone();
		
		//Bubblesort
		boolean troca = true;
		Filme filme = null;
		while(troca){
			troca = false;
			for(int i = 0; i < f.size() - 1; i++){
				if(f.get(i).getTotalAvaliacoes() < f.get(i + 1).getTotalAvaliacoes())
					filme = f.get(i);
					f.set(i, f.get(i+1));
					f.set(i+1, filme);
					troca = true;
			}
		}
		
		return f.get(0);
	}
	
	public ArrayList<Filme> getFilmeByGeneroETag(String genero, String tag){
		ArrayList<Filme> filmeByGeneroETag = new ArrayList<>();
		ArrayList<String> tags;
		if(lista.isEmpty()){
			return null;
		}else{
			for(int i = 0; i < lista.size(); i++){
				tags = lista.get(i).getTagsNome();
				if(lista.get(i).getGenero().equals(genero) && tags.contains(tag)){
					filmeByGeneroETag.add(lista.get(i));
				}
			}
		}
		return filmeByGeneroETag;
	}
	
	
}
