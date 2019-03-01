package maxdifference;

import java.util.Scanner;

public class MaxDifferenceCalculator {

	/**
	 * Calcula a máxima diferença entre os elementos de um array.
	 *
	 * Devem ser consideradas apenas diferenças positivas e entre o elemento de
	 * maior índice e os de índices menores. Assim, dado {i, j | 0 <= i < j < n e
	 * a[i] < a[j]}, então max(a[j]-a[i]).
	 *
	 *
	 * @param a Array de inteiros positivos.
	 * @return Máxima diferença entre os elementos.
	 */
	public static int maxDifference(final int[] a) {
		int maxDiff = -1;
		if (a.length < 2)
			return maxDiff;
		int minNum = a[0];
		for (final int current : a) {
			if (current - minNum > maxDiff)
				maxDiff = current - minNum;
			if (current < minNum)
				minNum = current;
		}
		return maxDiff;
	}

	/**
	 * Cria um array a partir da entrada do usuário.
	 *
	 *
	 * @return Array de inteiros que o usuário inseriu.
	 */
	public static int[] getArray() {
		try (Scanner scanner = new Scanner(System.in)) {
			final int length = scanner.nextInt();
			final int[] array = new int[length];

			for (int i = 0; i < array.length; i++)
				array[i] = scanner.nextInt();
			return array;
		}
	}

	private MaxDifferenceCalculator() {
		throw new IllegalStateException("Utility class");
	}
}
