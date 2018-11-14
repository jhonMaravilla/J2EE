package com.prog32758;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class intelligent {
	nonIntelligent cool;
	public int pieceCount = 1;
	public final int size = 8;
	public final int xMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
	public final int yMove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
	public final int[][] finalMatrix = new int[size][size];
	public HashMap<Integer, Integer> possibleMove = new HashMap<Integer, Integer>();
	public ArrayList<Integer> getMin = new ArrayList<>();

	public void writeToFile(String path) {
		try {
			// Identifying the file
			File file = new File(path + "JhonMaravillaHeuristicsMethod.txt");


			// Check if the file exists
			if (!file.exists()) {
				// If the file does not exist, create it.
				file.createNewFile();
			}

			// Open the file to write
			FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
			BufferedWriter bw = new BufferedWriter(fw);

			// Write into the file
			bw.write("The knight was able to successfully touch " + pieceCount);
			bw.newLine();
			bw.newLine();
			for (int x = 0; x < 8; x++) {
				for (int y = 0; y < 8; y++) {
					bw.write(finalMatrix[x][y] + "\t");
				}
				bw.newLine();
				bw.newLine();
				bw.newLine();
			}

			// Close
			bw.close();

		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public void deleteFile(String path) {
		File file = new File(path + "JhonMaravillaHeuristicsMethod.txt");
		file.delete();
	}

	public int getMax() {
		getMin.clear();
		int minKey = 0;
		Random rand = new Random();

		if (!possibleMove.isEmpty()) {
			int min = Collections.min(possibleMove.values());
			for (int key : possibleMove.keySet()) {
				int value = possibleMove.get(key);
				if (value == min) {
					getMin.add(key);
					minKey = key;
				}

			}
			int randValue = getMin.get(rand.nextInt(getMin.size()));
			return randValue;
		} else {
			return -1;
		}
	}

	public boolean isValid(int x, int y) {
		if (x < 0 || x >= 8) {
			return false;
		}
		if (y < 0 || y >= 8) {
			return false;
		}
		if (finalMatrix[x][y] != 0) {
			return false;
		}
		if (pieceCount > 64) {
			return false;
		}

		return true;
	}

	public boolean isValid2(int x, int y) {
		if (x < 0 || x >= 8) {
			return false;
		}
		if (y < 0 || y >= 8) {
			return false;
		}
		if (pieceCount > 64) {
			return false;
		}
		return true;
	}

	public boolean playTour(int x, int y) {
		finalMatrix[x][y] = pieceCount;
		int xMove2, yMove2;
		possibleMove.clear();
		addValid(x, y);
		int value = getMax();

		if (!possibleMove.isEmpty() && value != -1) {
			xMove2 = x + xMove[value];
			yMove2 = y + yMove[value];
			finalMatrix[xMove2][yMove2] = pieceCount;
			pieceCount++;
			playTour(xMove2, yMove2);
		}
		
		return false;
		
		}				

	public void addValid(int x, int y) {
		int xMove2, yMove2, xMove3, yMove3;
		int counter = 0;
		for (int n = 0; n < size; n++) {
			xMove2 = x + xMove[n];
			yMove2 = y + yMove[n];
			if (isValid(xMove2, yMove2)) {
				for (int m = 0; m < size; m++) {
					xMove3 = xMove2 + xMove[m];
					yMove3 = yMove2 + yMove[m];
					if (isValid2(xMove3, yMove3)) {
						counter++;
					}
				}
				if (counter != 0) {
					possibleMove.put(n, counter);
					counter = 0;
					xMove2 = x;
					yMove2 = y;
				} else {
					xMove2 = x;
					yMove2 = y;
				}

			} else {
				xMove2 = x;
				yMove2 = y;
			}
		}
		
	}

	public void printMatrix(int sol[][]) {
		for (int x = 0; x < 8; x++) {
			for (int y = 0; y < 8; y++) {
				System.out.print(sol[x][y] + "\t");
			}
			System.out.println("");
		}
	}

	public void clearMatrix() {
		for (int x = 0; x < 8; x++) {
			for (int y = 0; y < 8; y++) {
				finalMatrix[x][y] = 0;
			}
		}
		pieceCount = 1;
	}

}
