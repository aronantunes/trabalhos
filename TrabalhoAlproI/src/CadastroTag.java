import java.util.ArrayList;


public class CadastroTag {
	
	public static ArrayList<Tags> listaTag;
	
	public CadastroTag(){
		listaTag = new ArrayList<>();
	}
	
	public boolean add(Tags t){ //Adiciona uma Tag na lista
		if(listaTag.isEmpty()){ //Verifica se est� vazia
			listaTag.add(t); //Se estiver vazia adiciona
			return true;
		}else{	//Sen�o vai percorrer ela para ver se encotra uma Tag igual na Lista
			boolean exist = false;
			for(int i = 0; i < listaTag.size(); i++){//Percorre Lista
				if(listaTag.get(i).equals(t)){ //Se existir marca exist com true
					exist = true;
				}
			}
			if(!exist){ //Se exist for false Adiciona na lista e retorna true;
				listaTag.add(t);
				return true;
			}else{//Se existe, pega todos os filmes da Tag e adiciona na Tag que j� est� add
				for(int i = 0; i < lista.size(); i++){
					
				}
			}
			
		}
		return false; //Retorna false se exist for true
	}
}
