/**
 * 
 */
package br.edu.gazin.methodReference;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author developer
 *
 */
public class MethodReference {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");

		palavras.sort(String.CASE_INSENSITIVE_ORDER);
		
		palavras.forEach(System.out::println);
	}
}
