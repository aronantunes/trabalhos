import java.util.ArrayList;

public class CadastroTag {

	public static ArrayList<Tags> listaTag;

	public CadastroTag() {
		listaTag = new ArrayList<>();
	}

	public boolean add(Tags t) { // Adiciona uma Tag na lista
		if (listaTag.isEmpty()) { // Verifica se está vazia
			listaTag.add(t); // Se estiver vazia adiciona
			return true;
		} else { // Senão vai percorrer ela para ver se encotra uma Tag igual na
					// Lista
			if (listaTag.contains(t)) {
				for (int i = 0; i < listaTag.size(); i++) {
					if (listaTag.get(i).getNome().equals(t.getNome())) {
						ArrayList<Filme> filmes = listaTag.get(i).getFilmes();
						ArrayList<Filme> tagF = t.getFilmes();
						for (int j = 0; j < tagF.size(); i++) {
							if (!filmes.contains(tagF.get(j))) {
								listaTag.get(i).setFilme(tagF.get(j));
							}
						}
						return true;
					}
				}
			}
			else {// Se não existe, Adiciona a tag
				listaTag.add(t);
				return true;
			}
		}
		return false;
	}
	
	public Tags getTag(Tags t){
		if(listaTag.contains(t)){
			for(int i = 0; i < listaTag.size();i++){
				if(listaTag.get(i).equals(t)){
					return listaTag.get(i);
				}
			}
		}
		return null;
	}
	
	public ArrayList<Filme> getFilmesPorTag(String tag){
		if(listaTag.isEmpty()){
			return null;
		}else{
			for(int i = 0; i < listaTag.size(); i++){
				if(listaTag.get(i).getNome().equals(tag)){
					return listaTag.get(i).getFilmes();
				}
			}
		}
		
		return null;
	}
	
	public int getOcorrenciasTag(String tag){
		if(listaTag.isEmpty()){
			return 0;
		}else{
			for(int i = 0; i < listaTag.size(); i++){
				if(listaTag.get(i).getNome().equals(tag)){
					return listaTag.get(i).getTotalFilmes();
				}
			}
		}
		
		return 0;
	}
}
