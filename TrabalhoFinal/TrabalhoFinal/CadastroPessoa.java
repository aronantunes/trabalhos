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
    
    
    
    
    
    
     public ArrayList<Pessoa> pesquisarPorNome(String nome){
        ArrayList<Pessoa> pessoasEncontradas = new ArrayList<>();        
        for(Pessoa p : lista){
            if(p.getNome().toUpperCase().contains(nome.toUpperCase())){
               pessoasEncontradas.add(p);
            }
        }  
        return pessoasEncontradas;
    }
    
    
    public Pessoa pesquisar(String rg){
        for(int i = 0; i<lista.size(); i++){
            if(lista.get(i).getRg().equals(rg)){
               return lista.get(i); 
            }
        }  
        return null;
    }
    
    public boolean remover(String rg){
        Pessoa p = pesquisar(rg);
        if(p == null){
            return false;
        } else {
            return lista.remove(p);
        }        
    }
    
    public boolean atualizar(String rg, String nome, int idade){
        Pessoa p = pesquisar(rg);
        if(p == null){
            return false;
        } else {
            p.setNome(nome);
            p.setIdade(idade);
            return true;
        }
    }
    
    public void imprimeLista(){
        for(Pessoa p : lista){
            System.out.println(p.toString());
        }
    }
}

