import java.util.HashSet;
import java.util.Set;

public class PessoaDAO {
	
Set<PessoaModel> pessoas = new HashSet<PessoaModel>();
	
	
	public void add(PessoaModel aluno) {
		pessoas.add(aluno);	
	}
	
	public void romove(PessoaModel aluno) {
		pessoas.remove(aluno);
	}	

}
