import java.util.ArrayList;


public class Tags {
	public ArrayList<Filme> listaFilme; //Uma tag pode ter v�rios filmes
	public String tagNome;
	
	public Tags(String nome, Filme f){
		this.setTagNome(nome);
		this.setFilme(f);
	}

	public boolean setFilme(Filme f) {//Adicionar Filme na Lista de Filme
		//1 - Ver se o filme existe
		boolean exist = false;
		ArrayList<Filme> filmes = (ArrayList<Filme>) CadastroFilme.lista.clone();
		if(filmes.isEmpty()) //Se a lista ta vazia quer dizer q o Filme n�o existe
			return false;
		else{ //Sen�o estiver vazia, percorre a lista para ver se ele existe
			for(int i = 0; i < filmes.size(); i++){
				if(filmes.get(i).equals(f)) 
					exist = true; //Se encontrar marca que existe
			}
		}
		//2 - Ver se o filme j� est� na tag
		boolean existeNaTag = false;
		if(exist){ //Se o Filme existe
			if(listaFilme.isEmpty()){  //Se a Lista estiver vazia quer dizer que a Tag n�o possui
				listaFilme.add(f);     //um filme, ent�o adiciona ele na lista e retorna true;
				return true;
			}else{ //Lista n�o ta vazia
				for(int i = 0; i < listaFilme.size(); i++){//Percorre para saber ele j� est� add
					if(listaFilme.get(i).equals(f)){
						existeNaTag = true; //Ta na Tag
					}
				}
			}
		}
		//3 - Se 1 for true e 2 for falso Adiciona Filme na Tag
		if(!existeNaTag && exist){ //Se n�o estiver na Tag e ele existir, add ele na Tag
			listaFilme.add(f);
			return true;
		}else{
			return false;
		}
	}
	
	public ArrayList<Filme> getFilmes(){
		return listaFilme;
	}

	private void setTagNome(String nome) {
		this.tagNome = nome;
		
	}
	
	public String getNome() {
		return this.tagNome;
	}
	
	
	public String toString(){
		String msg = "";
		msg += "Nome da Tag: " + this.getNome() + "\n";
		if(listaFilme.isEmpty()){
			msg += "Filmes: nenhum filme";
		}else{
			msg += "Filmes: ";
			for(int i = 0; i < listaFilme.size(); i++){
				msg += " " + listaFilme.get(i).getTitulo();
			}
		}
		return msg;
	}

	
}
