package day4;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TimeDemo {

	public static void main(String[] args) {
		LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		LocalDateTime d2 = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period p = Period.ofDays(1).ofYears(2);
		
		Period p2 = Period.of(1, 2, 3);
		
		d = d.minus(p);
		d2 = d2.minus(p2);
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(f.format(d));
		System.out.println(f.format(d2));
	}

}
