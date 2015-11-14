import java.util.ArrayList;
public class CadastroPessoa {
 
	private ArrayList<Pessoa> lista;
	
	public CadastroPessoa() {
		lista = new ArrayList<>();
	}
	public int getTamanho(){
		return lista.size();
	}
	public boolean adicionar(Pessoa p){
		return lista.add(p);		
		
	}
    public boolean adicionar(String nome,String email,char sexo,byte idade){
		return lista.add(new Pessoa(nome,email,sexo,idade));
		
    	
    }
}
