
public class Filme {
	private String titulo;
	private int ano;
	private String genero;
	private double mediaindicador;

	public Filme(String titulo,int ano,String genero,double mediaindicador) {
		this.titulo = titulo;
		this.ano = ano;
		this.genero = genero;
		this.mediaindicador = mediaindicador;
				
	}

	public String getTitulo() {return titulo;}
	public int getAno() {return ano;}
	public String getGenero() {return genero;}
	public double getMediaindicador() {return mediaindicador;}
	
	
	public void setTitulo(String titulo) {this.titulo = titulo;}
	public void setAno(int ano) {this.ano = ano;}
	public void setGenero(String genero) {this.genero = genero;}
	public void setMediaindicador(double mediaindicador) {this.mediaindicador = mediaindicador;}
	
	
}
