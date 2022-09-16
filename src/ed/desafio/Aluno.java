package ed.desafio;

import java.util.UUID;

public class Aluno {

    private UUID id;
    private String nome;
    private Nota notas;

    public Aluno(String nome, Nota notas) {
        super();
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "\n ID: " + id +
                " -> Nome: " + nome +
                " -> Status do Aluno:" + notas;
    }
}