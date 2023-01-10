import static java.util.Comparator.comparing;

import java.util.ArrayList;
import java.util.List;

public class Exercicios2 {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");

		
		// palavras.sort((s1, s2) -> {
		// return Integer.compare(s1.length(), s2.length());
		// });
		
		// palavras.sort(Comparator.comparing(s -> s.length()));
		
		//palavras.sort(Comparator.comparing(String::length));
		palavras.sort(comparing(String::length));
		palavras.sort(String.CASE_INSENSITIVE_ORDER);
		
		
		
		System.out.println(palavras);
		palavras.forEach(s -> System.out.println(s));
		palavras.forEach(System.out::println);
	}

}
