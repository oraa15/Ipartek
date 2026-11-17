@SuppressWarnings("deprecation")
void main() {
	IO.println("Hola");

	IO.println("""
			Hola
				que
			tal
			""");

	double d1 = 0.1;
	double d2 = 0.2;

	double suma = d1 + d2;

	IO.println(suma);

	BigDecimal bd1 = new BigDecimal("0.1");
	BigDecimal bd2 = new BigDecimal("0.2");

	IO.println(bd1.compareTo(bd2));

	IO.println(bd1);
	IO.println(bd2);

	BigDecimal bdSuma = bd1.add(bd2);

	IO.println(bdSuma);

	String s1 = new String("Prueba");
	String s2 = new String("Prueba");

	IO.println(s1);
	IO.println(s2);

	IO.println(s1 == s2); // Comparación de punteros
	IO.println(s1.equals(s2)); // Comparación de contenidos

	s2 = "Ztra";

	IO.println(s1.compareTo(s2));

	Date d = new Date();

	IO.println(d);

	Date date2 = new Date(2026 - 1900, 11 - 1, 17);

	IO.println(date2.getYear() + 1900);

	GregorianCalendar gc = new GregorianCalendar();

	IO.println(gc.get(Calendar.YEAR));
	IO.println(gc.get(Calendar.MONTH) + 1);
	IO.println(gc.get(Calendar.DATE));

	GregorianCalendar gc2 = new GregorianCalendar(2026, 11 - 1, 17);

	IO.println(gc2.get(Calendar.YEAR));
	IO.println(gc2.get(Calendar.MONTH) + 1);
	IO.println(gc2.get(Calendar.DATE));

	LocalDateTime ldt = LocalDateTime.now();

	IO.println(ldt);

	LocalDate ld2 = LocalDate.of(2026, 11, 17);

	IO.println(ld2);

	LocalDate ld3 = LocalDate.of(2026, 1, 31);

	IO.println(ld3.plusMonths(1));

	LocalDate nacimiento = LocalDate.of(2000, 11, 18);

	IO.println(Period.between(nacimiento, LocalDate.now()).getYears());
}
