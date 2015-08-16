package com.stream.teste;

/**
 * Classe implementando a interface {@link Stream} 
 * contem a implementa��o dos metodos getNext e hasNext
 * 
 * utiliza um int para saber a posi��o do ponteiro e recuperar o proximo char
 * caso n�o possua um proximo retorna false
 * 
 * dada a posi��o do inteiro recupera o proximo char, caso n�o encontre retorna o 0
 * 
 * @author Leonardo
 *
 */
public class ObjetoTeste implements Stream {

	// array do objeto
	char[] stringArray = {};

	// posicao utilizada para recuperar o proximo char
	int position = 0;

	/**
	 * Contrutor para popular o array de characteres
	 * caso envie null para o construtor ele gera um array em branco
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