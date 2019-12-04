
public class PessoaModel {
	private  String nome;
	private  String  CPF ;
	private String curso;
	private  int matricula;
	
	
	
	//Constructor
	public PessoaModel(String nome, String cPF, String curso, int matricula) {
		this.nome = nome;
		this.CPF = cPF;
		this.curso = curso;
		this.matricula = matricula;
	}
	public PessoaModel() {
		// Para setar os dados do objeto "aluno" do tipo PessoaModel
		}
	//Getters & Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}	
}
