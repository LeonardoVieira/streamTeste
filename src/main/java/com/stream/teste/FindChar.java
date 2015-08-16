package com.stream.teste;

import java.util.LinkedHashSet;

/**
 * Classe de implementação da verificação dos characteres
 * possui apenas o metodo de verificar se no array possui 
 * characteres unicos ou não
 * 
 * @author Leonardo
 *
 */
public class FindChar {

	/**
	 * Metodo responsavel pela verificação dos characteres do objeto
	 * 
	 * @param input - objeto contendo os dados a serem verificados
	 * 
	 * @return - 	{@link Character} primeiro caracter que não se repete em todo array
	 *				{@link Character} @ caso não ache o character no array
	 */
	public static char firstChar(Stream input) {
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		LinkedHashSet<Character> setRemoved = new LinkedHashSet<Character>();

		while(input.hasNext()) {
			char c = input.getNext();

			if(!setRemoved.contains(c)) {
				if(!set.add(c)) {
					set.remove(c);
					setRemoved.add(c);
				}
			}
		}

		Object[] array = set.toArray();

		return (array.length > 0 ? (Character) array[0] : '@');
	}
}
