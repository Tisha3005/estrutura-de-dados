package ed.desafio;

import java.util.UUID;

public class Aluno {

    private final UUID id;
    private final String nome;
    private final Nota notas;

    public Aluno(String nome, Nota notas) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.notas = notas;
    }

    public Nota getNotas() {
        return notas;
    }

    @Override
    public String toString() {
        return "\n" +
                "\n ID: " + id +
                "\n Nome: " + nome + notas;
    }
}