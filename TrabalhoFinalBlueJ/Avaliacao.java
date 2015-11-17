import java.util.ArrayList;
import java.util.Date;


public class Avaliacao {
	 private Pessoa pessoa;
	 private Filme filme;
	 private int indicador;
	 private Date dataHora;
	 private ArrayList<String> tags;
 
 
 
	public Avaliacao(Pessoa p, Filme f, int n, ArrayList<String> t, Date data, ArrayList<Filme> listaFilme,
			ArrayList<Pessoa> listaPessoa) {
		tags = new ArrayList<>();
		this.setPessoa(p, listaPessoa);
		this.setNota(n);
		this.setFilme(f, listaFilme);
		this.setTags(t);
		this.setDataHora(data);
		
	}
	
	public void setDataHora(Date data) {
		this.dataHora = data;
		
	}
	
	public Date getDataHora(){
		return dataHora;
	}

	public void setPessoa(Pessoa p, ArrayList<Pessoa> listaPessoas){
		if(listaPessoas.isEmpty()){
			System.out.println("Pessoa não cadastrada");
		}else{
			if(listaPessoas.contains(p)){
				this.pessoa = p;
			}else{
				System.out.println("Pessoa não existe");
			}
		}
	}
	
	public Pessoa getPessoa(){
		return pessoa;
	}
	
	public void setFilme(Filme f, ArrayList<Filme> listaFilme){
		if(listaFilme.contains(f)){
			this.filme = f;
		}
	}
	
	public Filme getFilme(){
		return filme;
	}
		
	public boolean setNota(int n){
		if(n <= 0 || n > 5){
			return false;
		}else{
			this.indicador = n;
			return true;
		}
	}
	
	public int getNota(){
		return indicador;
	}
	
	public void setTags(ArrayList<String> t){
		this.tags = t;
	}
	
	public ArrayList<String> getTags(){
		return tags;
	}
	
	public String toString(){
		String msg = "";
		Pessoa p = this.getPessoa();
		Filme f = this.getFilme();
		int nota = this.getNota();
		ArrayList<String> t = this.getTags();
		String notaS = "";
		switch(nota){
			case 1:
				notaS = "Detestei";
				break;
			case 2:
				notaS = "Não gostei";
				break;
			case 3:
				notaS = "Gostei";
				break;
			case 4:
				notaS = "Gostei Muito";
				break;
			case 5:
				notaS = "Adorei";
				break;
		}
		
		msg += "Nome do Avaliador: " + p.getNome();
		msg += "\nFilme: " + f.getTitulo();
		msg += "\nNota: " + notaS + "(" + nota + ")\n";
		msg += "Tags: ";
		for(int i = 0; i < t.size(); i++){
			msg += t.get(i) + " ";
		}
		
		return msg;
	}
	

}
