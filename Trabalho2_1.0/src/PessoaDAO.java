import java.util.HashSet;
import java.util.Set;



public class PessoaDAO {
		
	Set<PessoaModel> pessoas = new HashSet<PessoaModel>();//Criada a coleção 
	
	public void addpessoas(PessoaModel people) {
		pessoas.add(people);
	}
	
	public void add(PessoaModel aluno) { //Add Aluno
		pessoas.add(aluno);	
	}
	
	public void romove(PessoaModel aluno) { //Remover Aluno
		pessoas.remove(aluno);
	}
	
	public int listTam() {
		return pessoas.size();
		
	}
}
