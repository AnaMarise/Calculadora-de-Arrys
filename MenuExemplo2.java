package lp;

import lplib.Entrada;

public class MenuExemplo2 {

	public static void main(String[] args) {
		// Laço de repetição para funcionamento
		boolean continua = true;
		while (continua) {
			// Apresentar menu (lista de opções)
			mostraMenuPrincipal();
			// Leitura opção selecionada
			int opcao = Entrada.inteiroNaFaixa(
					"Digite sua opção", 0, 2);
			// Executo a opção selecionada
			continua = executaOpcao(opcao);
		}
		System.out.println("Tchau!");
	}

	private static void mostraMenuPrincipal() {
		System.out.println("\nMenu Principal");
		System.out.println("==============");
		// Apresentar menu (lista de opções)
		System.out.println("1. Oi");
		System.out.println("2. Segunda Opção");
		System.out.println("0. Encerrar");
		System.out.println("==============");
	}

	private static boolean executaOpcao(int opcao) {
		// Executo a opção selecionada
		if (opcao == 1) {
			// Executo opção 1. Oi
			executaOpcao1();
		} else if (opcao == 2) {
			// Executo opção 2. Segunda Opção
			executaOpcao2();
		} else if (opcao == 0) {
			// Executo opção 0. Encerrar
			return false;
		} else {
			System.out.println("Erro! Opção Invalida!");
		}
		return true;
	}

	private static void executaOpcao1() {
		System.out.println("Oi!");
	}

	private static void executaOpcao2() {
		System.out.println("Sei lá...");
	}

}
