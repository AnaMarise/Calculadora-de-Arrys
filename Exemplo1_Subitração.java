package lp;


import java.util.Arrays;

import lplib.Entrada;


public class Exemplo1_Subitração {
	
	public static void main(String[] args) {
		// Qual o tamanho dos arrays?
		int TAM = Entrada.inteiro("Tamanho dos arrays");
		// Criar os arrays A, B, C
		double M[] = new double[TAM];
		double S[] = new double[TAM];
		double N[] = new double[TAM];
		// Ler os arrays M e S
		lerArray(M);
		lerArray(S);
		// Subitrair os arrays M e S
		subtrairArrays1(N, M, S);
		// Exibir arrays M, S, N
		System.out.println("M:\n" + Arrays.toString(M));
		System.out.println("S:\n" + Arrays.toString(S));
		System.out.println("N:\n" + Arrays.toString(N));
	}


	private static void subtrairArrays1(double[] n, double[] m, double[] s) {
		System.out.println("Subitraçãos dos Arrays");
		for (int i = 0; i < n.length; i++) {
			n[i] = m[i] - s[i];
		}
	}

	private static void lerArray(double[] m) {
		System.out.println("Leitura de Array");
		for (int i = 0; i < m.length; i++) {
			m[i] = Entrada.real("Valor real[" + i + "]");
		}
	}

}



