import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);

		LocalDate aniversario = LocalDate.of(2023, Month.APRIL, 15);

		int anos = aniversario.getYear() - hoje.getYear();
		System.out.println(anos);

		Period periodo = Period.between(hoje, aniversario);

		LocalDate proximoAni = aniversario.plusYears(4);

		System.out.println(proximoAni);

		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		String valorFormatado = proximoAni.format(formatador);
		System.out.println(valorFormatado);

		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");

		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorComHoras));
		
		
	}

}
