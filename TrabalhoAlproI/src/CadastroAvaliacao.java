import java.util.ArrayList;

public class CadastroAvaliacao {

	public static ArrayList<Avaliacao> lista;

	public CadastroAvaliacao() {
		lista = new ArrayList<>();
	}

	public boolean add(Avaliacao a) {
		if (!lista.contains(a)) {
			lista.add(a);
		}
		return false;
	}

	

}
