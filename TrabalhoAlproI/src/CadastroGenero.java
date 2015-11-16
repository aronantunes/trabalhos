import java.util.ArrayList;


public class CadastroGenero {
	
	public static ArrayList<Genero> lista;
	
	public CadastroGenero(){
		lista = new ArrayList<>();
	}
	
	public ArrayList<Filme> getFilmeByGenero(Genero g){
		if(lista.isEmpty())
			return null;
		if(lista.contains(g)){
			for(int i = 0; i < lista.size(); i++){
				if(lista.get(i).equals(g)){
					return lista.get(i).getFilme();
				}
			}
		}
		return null;
	}
	
}
