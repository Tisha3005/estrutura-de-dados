package ed.desafio;

public class ListaTeste {

    public static void main(String[] args) {

        Aluno thais = new Aluno("Thaís", new Nota(4.9, 5.9, 6.7, 8.0));
        Aluno felipe = new Aluno("Felipe", new Nota(1.9, 6.9, 4.7, 9.0));
        Aluno gilvan = new Aluno("Gilvan", new Nota(3.9, 4.9, 5.7, 2.0));
        Aluno jadson = new Aluno("Jadson", new Nota(8.9, 9.9, 7.7, 7.0));

        Lista<Aluno> listaAluno = new Lista<Aluno>();
        listaAluno.adicionaNoComeco(thais);
        listaAluno.adicionaNoComeco(felipe);
        listaAluno.adicionaNoComeco(gilvan);
        listaAluno.adicionaNoComeco(jadson);

        System.out.println(listaAluno.exibeAlunosAprovados());
        System.out.println(listaAluno.exibeLista());
    }
}