package br.com.maratonajava.javacore.associacao.test;

import br.com.maratonajava.javacore.associacao.classes.Aluno;
import br.com.maratonajava.javacore.associacao.classes.Local;
import br.com.maratonajava.javacore.associacao.classes.Professor;
import br.com.maratonajava.javacore.associacao.classes.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Thiago 1", 22);
        Aluno aluno2 = new Aluno("Thiago 2", 22);

        Seminario seminario = new Seminario("Seminario 1");
        Professor professor = new Professor("Yoda", "Usar a forca para programar");
        Local local = new Local("Rua das araras", "mato");

        aluno1.setSeminario(seminario);
        aluno2.setSeminario(seminario);

        seminario.setProfessor(professor);
        seminario.setLocal(local);
        seminario.setAlunos(new Aluno[]{aluno1, aluno2});

        professor.setSeminarios(new Seminario[]{ seminario });

        seminario.print();
        aluno1.print();
        aluno2.print();
        professor.print();
        local.print();

    }
}
