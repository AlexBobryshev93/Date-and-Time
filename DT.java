import java.time.*;

class DT {
	public static void main(String[] args) {
		LocalDate d = LocalDate.of(2015, 5, 24);
		LocalTime t = LocalTime.of(13, 5, 24, 5); //hours, minutes, seconds, nanos
		LocalDateTime dt = LocalDateTime.of(d, t);
		LocalDateTime dt0 = LocalDateTime.now();
		Period per = Period.ofYears(2);
		
		System.out.println();
		System.out.println("There is a date: " + d + ". And a time: " + t);
		System.out.println("Today is " + dt0);
		System.out.println("Once again. Today is " + dt0.getDayOfWeek() + ", the " + dt0.getDayOfYear() + "st of " + dt0.getMonth() + " " + dt0.getYear());
		System.out.println("One week before was " + dt0.minusWeeks(1));
		System.out.println("Three months later will be " + dt0.plusMonths(3));
		System.out.println("Two years later will be " + dt0.plus(per));
	}
}