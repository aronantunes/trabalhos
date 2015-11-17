import java.util.ArrayList;

public class Pessoa {

	private String nome;
	private String email;
	private char sexo;
	private byte idade;
	private ArrayList<Avaliacao> listaAvaliacoes;

	public Pessoa(String nome, String email, char sexo, byte idade) {
		this.listaAvaliacoes = new ArrayList<>();
		this.nome = nome;
		this.email = email;
		this.sexo = sexo;
		this.idade = idade;
		

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public byte getIdade() {
		return idade;
	}

	public void setIdade(byte idade) {
		this.idade = idade;
	}
	
	public void setAvaliacao(Avaliacao a){
		listaAvaliacoes.add(a);
	}
	
	public int getTotalAvalicoes(){
		return listaAvaliacoes.size();
	}
	public String toString() {
		return (" \nNome: " + nome + "\nEmail: " + email + "\nSexo: " + sexo
				+ " \nIdade: " + idade);
	}

}