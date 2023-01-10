import java.util.ArrayList;
import java.util.List;

public class ExerciciosLambda {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");

		// Reescreva o forEach que fizemos
		// no capítulo anterior utilizando
		// a nova sintaxe do lambda.

//		palavras.forEach(new Consumer<String>() {
//			public void accept(String palavra) {
//				System.out.println(palavra);
//			}
//		});

		palavras.forEach(palavra -> System.out.println(palavra));

		// Transforme esse Comparator em uma expressão lambda.

//		palavras.sort(new Comparator<String>() {
//		    @Override
//		    public int compare(String s1, String s2) {
//		        if(s1.length() < s2.length()) 
//		            return -1;
//		        if(s1.length() > s2.length()) 
//		            return 1;
//		        return 0;
//		    }
//		});

		palavras.sort((s1, s2) -> s1.length() - s2.length());

//		Considere o seguinte código que executa um Runnable em uma Thread:
//		new Thread(new Runnable() {
//
//		    @Override
//		    public void run() {
//		        System.out.println("Executando um Runnable");
//		    }
//
//		}).start();
//      Como podemos escrevê-lo usando uma expressão lambda?		

		new Thread(() -> System.out.println("Executando um Runnable")).start();

	}

}
