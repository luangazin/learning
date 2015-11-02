/**
 * 
 */
package br.edu.gazin.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * @author developer
 *
 */
public class Lambda {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");

		palavras.sort((String s1, String s2) -> Integer.compare(s1.length(), s2.length()));

		palavras.forEach(palavra -> System.out.println(palavra));
	}
}
