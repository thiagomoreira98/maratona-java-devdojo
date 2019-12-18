package br.com.maratonajava.javacore.associacao.classes;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor() {
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void print() {
        System.out.println("\n---------------- PROFESSOR -------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);

        if(this.seminarios != null && this.seminarios.length > 0) {
            System.out.print("Seminarios: ");
            for (Seminario seminario : this.seminarios) {
                System.out.print(seminario.getTitulo() + ", ");
            }
        } else {
            System.out.println("Nenhum seminario cadastrado para esse professor");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
