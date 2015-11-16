import java.util.ArrayList;


public class Tags {
	public ArrayList<Filme> listaFilme; //Uma tag pode ter v�rios filmes
	public String tagNome;
	
	public Tags(String nome, Filme f){
		listaFilme = new ArrayList<>();
		this.setTagNome(nome);
		this.setFilme(f);
		
	}

	public boolean setFilme(Filme f) {//Adicionar Filme na Lista de Filme
		//1 - Ver se o filme existe
		ArrayList<Filme> filmes = new ArrayList<>();
		filmes = CadastroFilme.lista;
		if(filmes.contains(f)){
			
			if(listaFilme.isEmpty()){  //Se a Lista estiver vazia quer dizer que a Tag n�o possui
				listaFilme.add(f);     //um filme, ent�o adiciona ele na lista e retorna true;
				return true;
			}else{ //Lista n�o ta vazia
				if(listaFilme.contains(f)){
					return false;
				}else{
					listaFilme.add(f);
					return true;
				}
			}
		}
		return false;
	}
	
	public ArrayList<Filme> getFilmes(){
		return listaFilme;
	}
	
	public int getTotalFilmes(){
		return listaFilme.size();
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
