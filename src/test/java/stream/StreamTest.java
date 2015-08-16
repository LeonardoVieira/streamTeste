package stream;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.stream.teste.FindChar;
import com.stream.teste.ObjetoTeste;

/**
 * Testes unit�rios sobre a implementa��o realizada.
 * efetua testes para sucesso (quando achar um character unico dentro do array)
 * efetua teste para quando o objeto enviado para verifica��o for null ou branco ("")
 * efetua testes em que n�o encontra um char unico 
 * 
 * @author Leonardo
 *
 */
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
		assertEquals('@', FindChar.firstChar(new ObjetoTeste("abcdefabcdefabcdefabcdefabcdefa")));
		assertEquals('@', FindChar.firstChar(new ObjetoTeste("fghijklmfghijklmfghijklmfghijkl")));
		assertEquals('@', FindChar.firstChar(new ObjetoTeste("1234567890123456789012345678901")));
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
