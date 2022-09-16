package ed.desafio;

public class Nota {

	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	private String resultado;
	private double media;

	// contrutor
	public Nota(double nota1, double nota2, double nota3, double nota4) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.nota4 = nota4;

		calculaMedia(nota1, nota2, nota3, nota4);
	}

	private void calculaMedia(double nota1, double nota2, double nota3, double nota4) {
		media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 7.5) {
			resultado = "Aprovado";
		} else {
			resultado = "Reprovado";

		}
	}

	@Override
	public String toString() {
		return " " + resultado + " -> Media: " + media;
	}
}