package com.stream.teste;

public interface Stream {

	/**
	 * metodo responsavel por recuperar o proximo character do array
	 * 
	 * @return {@link char} o proximo character do array
	 */
	public char getNext();

	/**
	 * Metodo responsavel por saber se existe um proximo char no array
	 * 
	 * @return	<b>true</b> - caso possua mais items no aray<br>
	 *			<b>false</b> - caso não tenha mais nenhum item no array
	 */
	public boolean hasNext();
}
