/**
 * 
 */
package br.edu.gazin.date;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * @author developer
 *
 */
public class Data {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		//Crie um LocalDate para representar o dia 25 de Janeiro de 2099.
		LocalDate localDate2 = LocalDate.of(2099, Month.JANUARY, 25);
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(formatador.format(localDate2));
		
		//Diferença entre duas datas
		Period period = Period.between(localDate, localDate2);
		System.out.println(period.getYears());
		System.out.println(period.getMonths());
		System.out.println(period.getDays());
	}
}
