package ed.desafio;

public class ListaTeste {

    public static void main(String[] args) {

        Aluno thais = new Aluno("Thais", new Nota(4.9, 5.9, 6.7, 8.0));
        Aluno felipe = new Aluno("Felipe", new Nota(1.9, 6.9, 4.7, 9.0));
        Aluno gilvan = new Aluno("Gilvan", new Nota(3.9, 4.9, 5.7, 2.0));
        Aluno jadson = new Aluno("Jadson", new Nota(8.9, 9.9, 7.7, 7.0));

        Lista listaAluno = new Lista();

        listaAluno.adicionaNoComeco(thais);
        listaAluno.adicionaNoComeco(felipe);
        listaAluno.adicionaNoComeco(gilvan);
        listaAluno.adicionaNoComeco(jadson);

        Escola escola = new Escola(listaAluno);

        Nota notaThais = new Nota(4.9, 5.9, 6.7, 8.0);
        Nota notaFelipe = new Nota(1.9, 6.9, 4.7, 9.0);
        Nota notaGilvan = new Nota (3.9, 4.9, 5.7, 2.0);
        Nota notaJadson = new Nota(8.9, 9.9, 7.7, 7.0);

        Lista listaNota = new Lista();
        listaNota.adicionaNoComeco(notaThais);
        listaNota.adicionaNoComeco(notaFelipe);
        listaNota.adicionaNoComeco(notaGilvan);
        listaNota.adicionaNoComeco(notaJadson);


                                                    Carro civic = new Carro("EZR7024", "sedan");
                                                    Carro fusca = new Carro("EZT2024", "HATCH");

                                                    Lista listaCarro = new Lista();
                                                    listaCarro.adicionaNoComeco(civic);
                                                    listaCarro.adicionaNoComeco(fusca);

                                                    System.out.println(listaCarro.exibeLista());
        System.out.println(escola.ListarAlunos());
        System.out.println(listaNota);
    }
}