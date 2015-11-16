import java.util.ArrayList;

public class Filme {

	private String titulo;
	private int ano;
	private String genero;
	private double mediaIndicador;
	private ArrayList<String> listaTag;
	private ArrayList<Avaliacao> listaAvaliacoes;

	public Filme(String titulo, int ano, String genero) {
		this.titulo = titulo;
		this.ano = ano;
		this.genero = genero;
		this.listaTag = new ArrayList<>();
		this.listaAvaliacoes = new ArrayList<>();
	}
	
	public boolean setAvaliacao(Avaliacao a){
		if(listaAvaliacoes.add(a))
			return true;
		return false;
	}
	
	public ArrayList<Avaliacao> getAvaliacoes(){
		return listaAvaliacoes;
	}
	
	public int getTotalAvaliacoes(){
		return listaAvaliacoes.size();
	}
	
	public boolean setTags(ArrayList<String> t){
		boolean ok = false;
		for(int i = 0; i < t.size(); i++){
			if(listaTag.add(t.get(i)))
				ok = true;
		}
		return ok;
	}
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void setMediaIndicador(ArrayList<Avaliacao> l){
		double ocorrencias = 0;
		int notasAvaliacoes = 0;
		for(int i = 0; i < l.size(); i++){
			if(l.get(i).getFilme().getTitulo().equals(this.titulo)){
				ocorrencias++;
				notasAvaliacoes += l.get(i).getNota();
			}
		}
		this.mediaIndicador = notasAvaliacoes/ocorrencias;
		
	}
	public String toString() {
		String msg = "";
		msg = "Filme: " + this.getTitulo() + "\nAno: " + this.getAno()
				+ "\nGênero: " + this.getGenero();
		return msg;
	}
}
