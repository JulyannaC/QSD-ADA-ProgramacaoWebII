package tech.ada.queroserdev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tech.ada.queroserdev.domain.entities.Aluno;


import java.util.Optional;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer>  {
    Optional<Aluno> findByTurma(String turma);
    boolean existsByTurma(@Param("turma") String turma);

}





