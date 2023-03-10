import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdemString {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");

		// Comparator<String> comparador = new ComparadorPorTamanho();
		// Collections.sort(palavras, comparador);

		palavras.sort((s1, s2) -> {
			if (s1.length() < s2.length())
				return -1;

			if (s1.length() > s2.length())
				return 1;
			return 0;
		});

//		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

//		palavras.sort(Comparator.comparing(s -> s.length()));

		palavras.sort(Comparator.comparing(String::length));

// 		igual ao codigo de cima

//		Function<String, Integer> funcao = String::length;
//		Comparator<String> comparador = Comparator.comparing(funcao);
//		palavras.sort(comparador);

		System.out.println(palavras);

//		for (String p : palavras) {
//			System.out.println(p);
//		}

//		Consumer<String> consumidor = new Consumer<String>() {
//			@Override
//			public void accept(String s) {
//				System.out.println(s);
//			}
//
//		};

//		Consumer<String> impressor = s -> System.out.println(s);
//		palavras.forEach(impressor);  equivalente ao codigo debaixo

		palavras.forEach(System.out::println);

	}
}
