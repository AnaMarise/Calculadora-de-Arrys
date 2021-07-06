package lp;

import lplib.Entrada;

public class MenuExemplo1 {

	public static void main(String[] args) {
		// La�o de repeti��o para funcionamento
		while (true) {
			// Apresentar menu (lista de op��es)
			System.out.println("1. Oi");
			System.out.println("2. Segunda Op��o");
			System.out.println("0. Encerrar");
			// Leitura op��o selecionada
			int opcao = Entrada.inteiroNaFaixa(
					"Digite sua op��o", 0, 2);
			// Executo a op��o selecionada
			if (opcao == 1) {
				// Executo op��o 1. Oi
				System.out.println("Oi!");
			} else if (opcao == 2) {
				// Executo op��o 2. Segunda Op��o
				System.out.println("Sei l�...");
			} else if (opcao == 0) {
				// Executo op��o 0. Encerrar
				break;
			} else {
				System.out.println("Erro! Op��o Invalida!");
			}
		}
		System.out.println("Tchau!");
	}

}
