package task7_strings;

import java.util.ArrayList;

public class StringContainer {
	private String[] myStringArray;
	public ArrayList<Integer> countlistOfUniqueSymbols;

	public StringContainer() {
		countlistOfUniqueSymbols = new ArrayList<Integer>();
	}

	public StringContainer(int sizeOfArray) {
		this();
		myStringArray = new String[sizeOfArray];
	}

	private int getCountOfUniqueSymbols(String elementOfStringArray) {
		int countOfuniqueSymbols = 0;
		boolean isUnique;
		for (int i = 0; i < elementOfStringArray.length(); i++) {
			isUnique = true;
			for (int j = 0; j < elementOfStringArray.length(); j++) {
				if (i != j && elementOfStringArray.charAt(i) == elementOfStringArray.charAt(j)) {
					isUnique = false;
					break;
				}

			}
			if (isUnique) {
				countOfuniqueSymbols++;
			}
		}
		System.out.println("unique chars: " + countOfuniqueSymbols);
		return countOfuniqueSymbols;
	}

	public void fillCountlistOfUniqueSymbols() {
		for (String elementOfArray : myStringArray) {
			this.countlistOfUniqueSymbols.add(this.getCountOfUniqueSymbols(elementOfArray));
		}
		System.out.println(countlistOfUniqueSymbols.size());
	}

	private int getMinimalQuantityOfUniqueSymbols() {
		int minimalCount = this.getCommonLengthOfUniqueSymbols();
		for (int elementOfList : this.countlistOfUniqueSymbols) {
			if (elementOfList > 0) {
				if (elementOfList < minimalCount) {
					minimalCount = elementOfList;
				}
			}
		} System.out.println("min count "+ minimalCount);
		return minimalCount;
	}

	public int findIndexOfFirstStringWithMinimalCountOfUniqueSymbols() {
		int minimalQuantity = this.getMinimalQuantityOfUniqueSymbols();
		for (int i = 0; i < this.countlistOfUniqueSymbols.size(); i++) {
			if (countlistOfUniqueSymbols.get(i) == minimalQuantity) {
				return i;
			}
		}
		return 0;
	}
	
	public int findIndexOfFirstStringUniqueSymbols() {
		int minimalQuantity = this.getMinimalQuantityOfUniqueSymbols();
		for (int i = 0; i < this.countlistOfUniqueSymbols.size(); i++) {
			if (countlistOfUniqueSymbols.get(i) == minimalQuantity) {
				return i;
			}
		}
		return 0;
	}

	public void printList() {
		for (int temp : countlistOfUniqueSymbols) {
			System.out.println(temp);
		}
	}

	public int getCommonLengthOfUniqueSymbols() {
		int commonLength = 0;
		for (int elementOfList : countlistOfUniqueSymbols) {
			commonLength += elementOfList;
		}
		return commonLength;
	}

	public void setElementOfStringArray(int index, String value) {
		myStringArray[index] = value;
	}
	
	public void setArrayWithUniqueChars(int index, String value) {
		myStringArray[index] = value;
	}

	public int getLengthOfArray() {
		return myStringArray.length;
	}

	public String getElementOfStringArray(int index) {
		return myStringArray[index];
	}

}
