package ed.desafio;

public class ListaTeste {

	public static void main(String[] args) {

		Aluno thais =  new Aluno("Thais",  new Nota(4.9, 5.9, 6.7, 8.0));
		Aluno felipe = new Aluno("Felipe", new Nota(1.9, 6.9, 4.7, 9.0));
		Aluno gilvan = new Aluno("Gilvan", new Nota(3.9, 4.9, 5.7, 2.0));
		Aluno jadson = new Aluno("Jadson", new Nota(8.9, 9.9, 7.7, 7.0));

		Lista lista = new Lista();

		lista.adicionaNoComeco(thais);
		lista.adicionaNoComeco(felipe);
		lista.adicionaNoComeco(gilvan);
		lista.adicionaNoComeco(jadson);

		Escola escola = new Escola(lista);
		System.out.println(escola.ListarAlunos());
	}
}