package stream;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.stream.teste.FindChar;
import com.stream.teste.ObjetoTeste;

public class StreamTest {

	@Test
	public void testFirstCharacter() {
		assertEquals('a', FindChar.firstChar(new ObjetoTeste("çlkjhgfdsaçlkjhgfdswqertyuytrew")));
		assertEquals('b', FindChar.firstChar(new ObjetoTeste("qwertyuiopqwertyuiopbqwertyuiop")));
		assertEquals('c', FindChar.firstChar(new ObjetoTeste("mnbvcxzasdfghjklasdfghjklmnbvxz")));
		assertEquals('d', FindChar.firstChar(new ObjetoTeste("poiuyyuiodppoiuytrewqqwertyuiop")));
		assertEquals('e', FindChar.firstChar(new ObjetoTeste("poiuytrewqqwrtyuioplkjnmkjhggfd")));
		assertEquals('f', FindChar.firstChar(new ObjetoTeste("qazqazplmplmkojihukojihuppfqwer")));
		assertEquals('g', FindChar.firstChar(new ObjetoTeste("lkjhgfdsaasdfhjklmnmnbvcbvcxzxz")));
		assertEquals('h', FindChar.firstChar(new ObjetoTeste("hqqwertyuiopqwertyuiopqwertyuio")));
	}
}
