package lp;

import lplib.Entrada;

public class MenuExemplo2 {

	public static void main(String[] args) {
		// La�o de repeti��o para funcionamento
		boolean continua = true;
		while (continua) {
			// Apresentar menu (lista de op��es)
			mostraMenuPrincipal();
			// Leitura op��o selecionada
			int opcao = Entrada.inteiroNaFaixa(
					"Digite sua op��o", 0, 2);
			// Executo a op��o selecionada
			continua = executaOpcao(opcao);
		}
		System.out.println("Tchau!");
	}

	private static void mostraMenuPrincipal() {
		System.out.println("\nMenu Principal");
		System.out.println("==============");
		// Apresentar menu (lista de op��es)
		System.out.println("1. Oi");
		System.out.println("2. Segunda Op��o");
		System.out.println("0. Encerrar");
		System.out.println("==============");
	}

	private static boolean executaOpcao(int opcao) {
		// Executo a op��o selecionada
		if (opcao == 1) {
			// Executo op��o 1. Oi
			executaOpcao1();
		} else if (opcao == 2) {
			// Executo op��o 2. Segunda Op��o
			executaOpcao2();
		} else if (opcao == 0) {
			// Executo op��o 0. Encerrar
			return false;
		} else {
			System.out.println("Erro! Op��o Invalida!");
		}
		return true;
	}

	private static void executaOpcao1() {
		System.out.println("Oi!");
	}

	private static void executaOpcao2() {
		System.out.println("Sei l�...");
	}

}
