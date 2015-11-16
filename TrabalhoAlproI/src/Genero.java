import java.util.ArrayList;


public class Genero {
	private String genero;
	private ArrayList<Filme> listaFilme;
	
	public Genero(String nome){
		this.genero = genero;
		listaFilme = new ArrayList<>();
	}
	
	public void setGenero(String nome){
		this.genero = nome;
	}
	
	public String getGenero(){
		return this.genero;
	}
	
	public boolean setFilme(Filme f){
		if(listaFilme.isEmpty()){
			listaFilme.add(f);
			return true;
		}else{
			if(!listaFilme.contains(f)){
				listaFilme.add(f);
				return true;
			}else{
				return false;
			}
		}
	}
	
	public ArrayList<Filme> getFilme(){
		return this.listaFilme;
	}
}
