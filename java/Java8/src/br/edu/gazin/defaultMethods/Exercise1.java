package br.edu.gazin.defaultMethods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author developer
 *
 */
public class Exercise1 {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");

		palavras.sort(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if (s1.length() > s2.length())
					return -1;
				if (s1.length() < s2.length())
					return 1;
				return 0;
			}
		});

		palavras.forEach(new Consumer<String>() {
			@Override
			public void accept(String word) {
				System.out.println(word);
			}
		});
	}
}
