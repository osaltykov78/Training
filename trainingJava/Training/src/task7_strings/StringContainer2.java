package task7_strings;

import java.util.ArrayList;

public class StringContainer2 {
	private String[] myStringArray;
	public ArrayList<Integer> countlistOfUniqueSymbols;
	public ArrayList<String> uniqueCharArray = new ArrayList<>();

	public StringContainer2() {
		countlistOfUniqueSymbols = new ArrayList<Integer>();
	}

	public StringContainer2(int sizeOfArray) {
		this();
		myStringArray = new String[sizeOfArray];
	}

	public String getCountOfUniqueSymbols() {
		int countOfuniqueSymbols = 0;
		boolean isUnique;
		for (String elementOfArray : myStringArray) {
			isUnique = false;
			for (int i = 0; i < elementOfArray.length() - 1; i++) {
				for (int j = i + 1; j < elementOfArray.length(); j++) {
					if (elementOfArray.charAt(i) == elementOfArray.charAt(j)) {

						isUnique = true;
						break;
					}

				}
				if (isUnique) {
					break;
				} else {
					uniqueCharArray.add(elementOfArray);
				}
			}
		}
		System.out.println("unique chars: " + uniqueCharArray);

		if (uniqueCharArray.size() > 0) {
			return uniqueCharArray.get(0);
		}

		return "0";
	}

	public void setElementOfStringArray(int index, String value) {
		myStringArray[index] = value;
	}

	public int getLengthOfArray() {
		return myStringArray.length;
	}

}
