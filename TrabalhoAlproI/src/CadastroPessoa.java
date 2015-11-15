import java.util.ArrayList;
public class CadastroPessoa {
 
	public static ArrayList<Pessoa> lista;
	
	public CadastroPessoa() {
		//lista = new ArrayList<>();
	}
	public int getTamanho(){
		return lista.size();
	}
	public boolean adicionar(Pessoa p){
		return lista.add(p);		
		
	}
   
}
