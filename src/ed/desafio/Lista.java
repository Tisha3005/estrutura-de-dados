package ed.desafio;

public class Lista {
	
	private Referencia inicio;

//criado uma classe static q estah dentro da classe Lista	
	private static class Referencia {
		public Referencia proximoElemento;
		public Object primeiroElemento;

//construtor da referencia       
		public Referencia(Object elemento) {
			this.primeiroElemento = elemento;
			this.proximoElemento = null;
		}
	}
// construtor da lista
	public Lista() {
		inicio = null;
	}

//Metodo adiciona Aluno no comeco da lista
	public void adicionaNoComeco(Object elemento) {
		Referencia novaReferencia = new Referencia(elemento);
		novaReferencia.proximoElemento = inicio; // novoNo -> inicio antigo
		inicio = novaReferencia; // inicio -> novoNo
	}
	public boolean procurar(Object elemento) {
		for (Referencia tempReferencia = inicio; tempReferencia != null; tempReferencia = tempReferencia.proximoElemento)
			if (inicio == tempReferencia.primeiroElemento)
				return true;
		return false;
	}
	public String exibeLista() {
		String str = "Lista: ";
		for (Referencia tempReferencia = inicio; tempReferencia != null; tempReferencia = tempReferencia.proximoElemento)
			str += " " + tempReferencia.primeiroElemento;
		return str + "\n";
	}
}