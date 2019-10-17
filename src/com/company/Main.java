package com.company;

public class Main {

	public static void main(String[] args) {
		double[] array = new double[args.length];
		for (int i = 0; i < args.length; i++) {
			array[i] = Double.parseDouble(args[i]);
			System.out.print(array[i] + " ");
			System.out.println();
		}
		int startIndex = 0;
		int endIndex = 3;
		printArray(subarray(array, startIndex, endIndex));
	}

	public static double[] subarray(double[] array, int startIndex, int endIndex) {
		double[] subarray = new double[endIndex - startIndex];
		for (int j = startIndex; j < endIndex; j++) {
			subarray[j - startIndex] = array[j];
		}
		return subarray;
	}

	public static void printArray(double[] array) {
		for (double x : array) {
			System.out.print(x + " ");
		}

	}
}

