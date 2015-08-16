package stream;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.stream.teste.FindChar;
import com.stream.teste.ObjetoTeste;

public class StreamTest {

	/**
	 * Testes unit�rios sobre algumas possibilidades de verifica��o do codigo
	 */
	@Test
	public void testFirstCharacter() {
		assertEquals('a', FindChar.firstChar(new ObjetoTeste("�lkjhgfdsa�lkjhgfdswqertyuytrew")));
		assertEquals('b', FindChar.firstChar(new ObjetoTeste("qwertyuiopqwertyuiopbqwertyuiop")));
		assertEquals('c', FindChar.firstChar(new ObjetoTeste("mnbvcxzasdfghjklasdfghjklmnbvxz")));
		assertEquals('d', FindChar.firstChar(new ObjetoTeste("poiuyyuiodppoiuytrewqqwertyuiop")));
		assertEquals('e', FindChar.firstChar(new ObjetoTeste("poiuytrewqqwrtyuioplkjnmkjhggfd")));
		assertEquals('f', FindChar.firstChar(new ObjetoTeste("qazqazplmplmkojihukojihuppfqwer")));
		assertEquals('g', FindChar.firstChar(new ObjetoTeste("lkjhgfdsaasdfhjklmnmnbvcbvcxzxz")));
		assertEquals('h', FindChar.firstChar(new ObjetoTeste("hqqwertyuiopqwertyuiopqwertyuio")));
		assertEquals('A', FindChar.firstChar(new ObjetoTeste("sdfghjklAsdfghjklasdfghjklpoipo")));
		assertEquals('5', FindChar.firstChar(new ObjetoTeste("asdfghjkl56987asdfghjkl98746123")));
	}

	/**
	 * Teste quando o array passado n�o possui character unico
	 * quando n�o achar retorna @ 
	 */
	@Test
	public void testFirstCharacterError() {
		assertEquals('@', FindChar.firstChar(new ObjetoTeste("000aaaaaaaaaaaabbbbbbbbbbbccccc")));
	}

	/**
	 * Teste quando o array passado for null
	 * retorna @ 
	 */
	@Test
	public void testFirstCharacterErrorNull() {
		assertEquals('@', FindChar.firstChar(new ObjetoTeste(null)));
	}

	/**
	 * Teste quando o array passado for null
	 * retorna @ 
	 */
	@Test
	public void testFirstCharacterErrorEmpty() {
		assertEquals('@', FindChar.firstChar(new ObjetoTeste("")));
	}
}
