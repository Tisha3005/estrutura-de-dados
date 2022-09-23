package ed.desafio;

public class Lista<E> {

    private Referencia<E> inicio;

    private static class Referencia<E> {
        public Referencia<E> proximoElemento;
        public E elemento;

        public Referencia(E elemento) {
            this.elemento = elemento;
            this.proximoElemento = null;
        }
    }

    public Lista() {
        inicio = null;
    }

    public void adicionaNoComeco(E elemento) {
        Referencia<E> novaReferencia = new Referencia<E>(elemento);
        novaReferencia.proximoElemento = inicio;
        inicio = novaReferencia;
    }

    public String exibeLista() {
        String str = "Lista Alunos (com suas notas, a média e se o aluno está aprovado (média >= 7)): ";
        for (Referencia<E> tempReferencia = inicio; tempReferencia != null; tempReferencia = tempReferencia.proximoElemento)
            str += " " + tempReferencia.elemento;
        return str + "\n";
    }

    public String exibeAlunosAprovados() {
        String str = "Alunos Aprovados: ";
        for (Referencia<E> tempReferencia = inicio; tempReferencia != null; tempReferencia = tempReferencia.proximoElemento)

            if (((Aluno) tempReferencia.elemento).getNotas().getResultado().equals("Aprovado")) {
                str += " " + tempReferencia.elemento;
            }
        return str + "\n";
    }
}