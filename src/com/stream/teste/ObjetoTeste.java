package com.stream.teste;

public class ObjetoTeste implements Stream {

	char[] stringArray;

	int position = 0;

	public ObjetoTeste(String array) {
		stringArray = array.toCharArray();
	}

	@Override
	public char getNext() {
		if(hasNext()) {
			return stringArray[position++];
		}

		return 0;
	}

	@Override
	public boolean hasNext() {
		return stringArray.length != position;
	}
}