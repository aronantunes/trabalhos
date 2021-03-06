import java.util.ArrayList;

public class Filme {

	private String titulo;
	private int ano;
	private String genero;
	private double mediaIndicador;

//	private ArrayList<Tags> listaTag;
//	private ArrayList<Avaliacao> listaAvaliacoes;

	public Filme(String titulo, int ano, String genero) {
//		this.listaTag = new ArrayList<>();
//		this.listaAvaliacoes = new ArrayList<>();
		this.titulo = titulo;
		this.ano = ano;
		this.genero = genero;
	
	}
	
	
//	public boolean setAvaliacao(Avaliacao a) {
//		if (listaAvaliacoes.add(a))
//			return true;
//		return false;
//	}

//	public ArrayList<Avaliacao> getAvaliacoes() {
//		return listaAvaliacoes;
//	}
//
//	public int getTotalAvaliacoes() {
//		return listaAvaliacoes.size();
//	}

//	public boolean setTags(ArrayList<Tags> t){
//		if(listaTag.isEmpty()){
//			for(int i = 0; i < t.size(); i++){
//				listaTag.add(t.get(i));
//			}
//			return true;
//		}else{
//			for(int j = 0; j < t.size(); j++){
//				if(!listaTag.contains(t.get(j))){
//					listaTag.add(t.get(j));
//				}
//			}
//			return true;
//		}
//	}
//
//	public ArrayList<Tags> getTags() {
//		return listaTag;
//	}
//	
//	public ArrayList<String> getTagsNome(){
//		if(listaTag.isEmpty()){
//			return null;
//		}else{
//			ArrayList<String> tagsNome = new ArrayList<>();
//			for(int i = 0; i < listaTag.size(); i++){
//				tagsNome.add(listaTag.get(i).getNome());
//			}
//			return tagsNome;
//		}
//		
//	}

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

	public void setMediaIndicador(double media) {
		this.mediaIndicador = media;
	}
	
	public double getMediaIndicador(){
		return mediaIndicador;
	}

	public String toString() {
		String msg = "";
		msg = "Filme: " + this.getTitulo() + "\nAno: " + this.getAno()
				+ "\nG�nero: " + this.getGenero()
				+ "\nNota: " + mediaIndicador;
		return msg;
	}
}
