package br.com.maratonajava.javacore.associacao.classes;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;
    private Professor professor;

    public Seminario() {
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public void print() {
        System.out.println("\n---------------- SEMINARIO -------------------");
        System.out.println("Titulo: " + this.titulo);

        if(this.professor != null)
            System.out.println("Professor: " + this.professor.getNome());
        else
            System.out.println("Nenhum professor cadastrado para esse seminario");

        if(this.local != null)
            System.out.println("Local: " + this.local.getRua() + ", Bairro: " + this.local.getBairro());
        else
            System.out.println("Nenhum local cadastrado para esse seminario");

        if(this.alunos != null && this.alunos.length > 0) {
            System.out.print("Alunos: ");
            for (Aluno aluno : this.alunos) {
                System.out.print(aluno.getNome() + ", ");
            }
        } else {
            System.out.println("Nenhum aluno cadastrado para esse seminario");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
