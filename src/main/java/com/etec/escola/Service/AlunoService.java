package com.etec.escola.Service;

import com.etec.escola.Interface.AlunoRepository;
import com.etec.escola.Models.Aluno;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    private final AlunoRepository Rep;


    public AlunoService(AlunoRepository rep) {
        Rep = rep;
    }

    public List<Aluno> buscarAlunos() {
        return Rep.findAll();
    }

    public Aluno salvarAluno(Aluno aluno) {
        return Rep.save(aluno);
    }
    public Aluno buscarAlunoId(Long id) {
        return Rep.findById(id).orElse(null);
    }

    public void deletarAluno (Long id){
        Rep.deleteById(id);
    }
}
