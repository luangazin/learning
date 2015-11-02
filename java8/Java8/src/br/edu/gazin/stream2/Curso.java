/**
 * 
 */
package br.edu.gazin.stream2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author developer
 *
 */
class Curso {
	private String nome;
	private int alunos;

	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}

	@Override
	public String toString() {
		return this.nome+" - "+alunos;
	}

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		
		Double average = cursos.stream()
		   .mapToInt(Curso::getAlunos).average().getAsDouble();
		
		Stream<Curso> stream = cursos.stream()
				   .filter(c -> c.getAlunos() > 50);
		
		stream.collect(Collectors.toList());
		
	}
}