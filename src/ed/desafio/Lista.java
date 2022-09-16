package ed.desafio;

public class Lista {
	
	private Referencia inicio;

//criado uma classe static q estah dentro da classe Lista	
	private static class Referencia {
		public Referencia proximoAluno;
		public Aluno primeiroAluno;

//construtor da referencia       
		public Referencia(Aluno aluno) {
			this.primeiroAluno = aluno;
			this.proximoAluno = null;
		}
	}
// construtor da lista
	public Lista() {
		inicio = null;
	}
//Metodo adiciona Aluno no comeco da lista
	public void adicionaNoComeco(Aluno aluno) {
		Referencia novaReferencia = new Referencia(aluno);
		novaReferencia.proximoAluno = inicio; // novoNo -> inicio antigo
		inicio = novaReferencia; // inicio -> novoNo
	}
	/*public boolean procurar(Aluno aluno) {
		for (Referencia tempReferencia = inicio; tempReferencia != null; tempReferencia = tempReferencia.proximoAluno)
			if (aluno == tempReferencia.primeiroAluno)
				return true;
		return false;
	}*/
	public String exibeLista() {
		String str = "Lista de Alunos: ";
		for (Referencia tempReferencia = inicio; tempReferencia != null; tempReferencia = tempReferencia.proximoAluno)
			str += " " + tempReferencia.primeiroAluno;
		return str + "\n";
	}
}