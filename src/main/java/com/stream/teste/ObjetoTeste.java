package com.stream.teste;

public class ObjetoTeste implements Stream {

	char[] stringArray = {};

	int position = 0;

	/**
	 * Contrutor para popular o array de characteres
	 * 
	 * @param array - {@link String} com os caracteres a serem verificados
	 */
	public ObjetoTeste(String array) {
		if(array != null) {
			stringArray = array.toCharArray();
		}
	}

	/*
	 * (non-Javadoc)
	 * @see com.stream.teste.Stream#getNext()
	 */
	@Override
	public char getNext() {
		if(hasNext()) {
			return stringArray[position++];
		}

		return 0;
	}

	/*
	 * (non-Javadoc)
	 * @see com.stream.teste.Stream#hasNext()
	 */
	@Override
	public boolean hasNext() {
		return stringArray.length != position;
	}
}