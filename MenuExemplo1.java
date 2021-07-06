package lp;

import lplib.Entrada;

public class MenuExemplo1 {

	public static void main(String[] args) {
		// Laço de repetição para funcionamento
		while (true) {
			// Apresentar menu (lista de opções)
			System.out.println("1. Oi");
			System.out.println("2. Segunda Opção");
			System.out.println("0. Encerrar");
			// Leitura opção selecionada
			int opcao = Entrada.inteiroNaFaixa(
					"Digite sua opção", 0, 2);
			// Executo a opção selecionada
			if (opcao == 1) {
				// Executo opção 1. Oi
				System.out.println("Oi!");
			} else if (opcao == 2) {
				// Executo opção 2. Segunda Opção
				System.out.println("Sei lá...");
			} else if (opcao == 0) {
				// Executo opção 0. Encerrar
				break;
			} else {
				System.out.println("Erro! Opção Invalida!");
			}
		}
		System.out.println("Tchau!");
	}

}
