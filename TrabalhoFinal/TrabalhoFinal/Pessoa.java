
/**
 * Escreva a descrição da classe Pessoa aqui.
 * 
 * @author (Aron Moreira Antunes) 
 * @version (30/10/2015)
 */
public class Pessoa
{
    private String nome;
	private String email;
	private char sexo;
	private byte idade;
	
	public Pessoa(String nome, String email, char sexo, byte idade) {
		this.nome = nome;
		this.email = email;
		this.sexo = sexo;
		this.idade = idade;		
	}

	public String getNome() {return nome;}
	public String getEmail() {return email;}
	public char getSexo() {return sexo;}
	public byte getIdade() {return idade;}
	
	public void setNome(String nome) {this.nome = nome;}
	public void setEmail(String email) {this.email = email;}
	public void setSexo(char sexo) {this.sexo = sexo;}
	public void setIdade(byte idade) {this.idade = idade;}
	
	public String toString () {
		return (" \nNome: " + nome + "\nEmail: " + email + "\nSexo: " + sexo + " \nIdade: " + idade);
	}
   
    
}
