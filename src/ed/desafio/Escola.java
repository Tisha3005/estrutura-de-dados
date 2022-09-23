package ed.desafio;

public class Escola {

    private Lista alunos;

    public Escola(Lista alunos) {
        this.alunos = alunos;
    }

    public String ListarAlunos() {
        return alunos.exibeLista();
    }
}