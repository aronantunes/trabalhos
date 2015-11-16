import java.util.ArrayList;
public class CadastroPessoa {
 
	public static ArrayList<Pessoa> lista;
	
	public CadastroPessoa() {
		lista = new ArrayList<>();
	}
	public int getTamanho(){
		return lista.size();
	}
	public boolean add(Pessoa p){
		return lista.add(p);		
		
	}
	
	public Pessoa getPessoaComMaisAvaliacoes() {
		ArrayList<Pessoa> l = new ArrayList<>();
		if(lista.isEmpty()){
			System.out.println("Não existe avaliações");
		}else{
			if(lista.size() == 1){
				return lista.get(0);
			}
			boolean troca = true;
			Pessoa p = null;
			
			l = lista;
			while (troca) {
				troca = false;
				for (int i = 0; i < l.size() - 1; i++) {
					if (l.get(i).getTotalAvalicoes() < l.get(i + 1).getTotalAvalicoes()) {
						p = l.get(i);
						l.set(i, l.get(i + 1));
						l.set(i + 1, p);
						troca = true;
					}
				}
			}
		}	
		return l.get(0);
	}
	
	public Pessoa getPessoa(String nome){
		if(lista.isEmpty())
			return null;
		for(int i = 0; i < lista.size(); i++){
			if(lista.get(i).getNome().equals(nome))
				return lista.get(i);
		}
		return null;
	}
   
}
