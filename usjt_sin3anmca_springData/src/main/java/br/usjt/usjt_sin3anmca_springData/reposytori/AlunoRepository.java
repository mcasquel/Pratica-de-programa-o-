package br.usjt.usjt_sin3anmca_springData.reposytori;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import br.usjt.usjt_sin3anmca_springData.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{
	
	public Aluno findByEmail (String email);
	public Aluno getByEmail (String email);
	public int countByEmail (String email);
	
	@Transactional
	public long deleteByFone (String fone);
	public List <Aluno> queryByNome (String nome);
}
 