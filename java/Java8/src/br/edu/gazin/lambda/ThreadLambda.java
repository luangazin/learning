/**
 * 
 */
package br.edu.gazin.lambda;

/**
 * @author developer
 *
 */
public class ThreadLambda {
	public static void main(String[] args) {
		new Thread(() -> System.out.println("Executando um Runnable")).start();
	}
}
