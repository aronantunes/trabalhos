import java.util.ArrayList;
public class CadastroFilme {
	
	private ArrayList<Filme> lista;
	
	public CadastroFilme() {
		lista = new ArrayList<>();
	}
	public int getTamanho(){
		return lista.size();
	}
	public boolean adicionar(Filme f){
		return lista.add(f);		
		
	}
    public boolean adicionar(String titulo,int ano,String genero,double mediaindicador){
		return lista.add(new Filme(titulo,ano,genero,mediaindicador));
		
	}

}
