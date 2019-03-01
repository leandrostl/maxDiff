package app;

import maxdifference.MaxDifferenceCalculator;

public class Main {

	public static void main(final String[] args) {
		System.out.println("Por favor, insira a sequência de números do array começando pelo seu tamanho.");
		final int[] array = MaxDifferenceCalculator.getArray();
		System.out.println("A maior diferença é: " + MaxDifferenceCalculator.maxDifference(array));
	}
}
