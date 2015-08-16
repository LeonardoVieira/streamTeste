package com.stream.teste;

import java.util.LinkedHashSet;

public class FindChar {

	public static void main(String[] args) {
		System.out.println(firstChar(new ObjetoTeste("aAbBABacblkoijcuhyktgftrl")));
	}

	public static char firstChar(Stream input) {
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();

		while(input.hasNext()) {
			char c = input.getNext();

			if(!set.add(c)) {
				set.remove(c);
			}
		}

		Object[] array = set.toArray();
		return (char) array[0];
	}
}
