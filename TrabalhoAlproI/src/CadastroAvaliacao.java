import java.util.ArrayList;


public class CadastroAvaliacao {

	public static ArrayList<Avaliacao> lista;
	
	public CadastroAvaliacao(){
		//lista = new ArrayList<>();
	}
	
	public boolean add(Avaliacao a){
		if(lista.add(a)){
			a.getPessoa().setAvaliacao(a);
			a.getFilme().setAvaliacao(a);
			if(a.getFilme().setTags(a.getTags()))
				return true;
		}
			
		return false;
	}
	
	
	
	

}