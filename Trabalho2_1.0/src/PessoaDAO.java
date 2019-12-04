import java.util.HashSet;
import java.util.Set;

public class PessoaDAO {
Set<PessoaModel> pessoas = new HashSet<PessoaModel>();//Criada a coleção 
	
	
	public void add(PessoaModel aluno) { //Adiciona aluno "Acho que é desnecessário"
		pessoas.add(aluno);	
	}
	
	public void romove(PessoaModel aluno) { //Remover aluno
		pessoas.remove(aluno);
	}	

}
