package lp;

import lplib.Entrada;

public class MenuExemplo3 {
	//private static final int valor = 0;
	// Vari�veis "globais" neste programa
	private static double visor = 0;

	public static void main(String[] args) {
		// La�o de repeti��o para funcionamento
		boolean continua = true;
		while (continua) {
			// Apresentar menu (lista de op��es)
			mostraMenuPrincipal();
			// Leitura op��o selecionada
			int opcao = Entrada.inteiroNaFaixa(
					"Digite sua op��o", 0, 9);
			// Executo a op��o selecionada
			continua = executaOpcao(opcao);
		}
		System.out.println("Tchau!");
	}

	private static void mostraMenuPrincipal() {
		System.out.println("\nMenu Principal");
		System.out.println("==============");
		// Apresentar menu (lista de op��es)
		System.out.println("1. Somar");
		System.out.println("2. Subtrair");
		System.out.println("3. Dividir");
		System.out.println("4. muitiplicar");
		System.out.println("5. potencializa��o");
		System.out.println("9. Limpar Visor");
		System.out.println("0. Encerrar");
		System.out.println("==============");
		System.out.println("VISOR");
		System.out.println(visor);
		System.out.println("==============");
	}

	private static boolean executaOpcao(int opcao) {
		// Executo a op��o selecionada
		if (opcao == 1) {
			// Executo op��o 1
			executaOpcao1();
		} else if (opcao == 2) {
			// Executo op��o 2
			executaOpcao2();
		} else if (opcao == 3) {
			// Executo op��o 3
			executaOpcao3();
		} else if (opcao == 4) {
			// Executo op��o 4
			executaOpcao4();
		} else if (opcao == 5) {
			// Executo op��o 5
			executaOpcao5();
		} else if (opcao == 9) {
			// Executo op��o 9
			executaOpcao9();
		} else if (opcao == 0) {
			// Executo op��o 0. Encerrar
			return false;
		} else {
			System.out.println("Erro! Op��o Invalida!");
		}
		return true;
	}

	private static void executaOpcao1() {
		System.out.println("Somar");
		double valor = Entrada.real("Valor");
		visor += valor;
	}

	private static void executaOpcao2() {
		System.out.println("Subtrair");
		double valor = Entrada.real("Valor");
		visor -= valor;
	}
	private static void executaOpcao3() {
		System.out.println("Dividir");
		double valor = Entrada.real("Valor");
		if (valor != 0) {
			visor /= valor;
		}else {
			System.out.println("Erro! Divis�o por zero!");
		}
		
	}
	private static void executaOpcao4() {
		System.out.println("Mutiplicar");
		double valor = Entrada.real("Valor");
		visor *= valor;
	}
	private static void executaOpcao5() {
		System.out.println("Potenciar");
		double expoente = Entrada.real("Expoente");
		visor = Math.pow(visor, expoente);
	}
	private static void executaOpcao9() {
		System.out.println("Limpar visor");
		visor = 0;
	}

}
