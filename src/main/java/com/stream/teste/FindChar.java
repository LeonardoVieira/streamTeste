package com.stream.teste;

import java.util.LinkedHashSet;

public class FindChar {

	/**
	 * Metodo responsavel pela verifica��o dos characteres do objeto
	 * 
	 * @param input - objeto contendo os dados a serem verificados
	 * 
	 * @return - {@link Character} primeiro caracter que n�o se repete em todo array
	 */
	public static char firstChar(Stream input) {
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();

		while(input.hasNext()) {
			char c = input.getNext();

			if(!set.add(c)) {
				set.remove(c);
			}
		}

		Object[] array = set.toArray();
		return (Character) array[0];
	}
}
