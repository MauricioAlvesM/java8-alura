import static java.util.Comparator.comparing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Curso2 {

	private String nome;
	private int alunos;

	public Curso2(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}
}

public class Exercicios3 {
	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("JS", 150));
		cursos.add(new Curso("C", 55));

		cursos.sort(comparing(Curso::getAlunos));
		
		
		
		//Utilizando a API de Stream, crie um filtro para 
		//todos os cursos que tenham mais de 50 alunos.
		
		cursos.stream()	
		.filter(c -> c.getAlunos() > 50)
		.forEach(c -> System.out.println(c.getNome()));
		
		System.out.println("______________________");
		
		Stream<String> nomes = cursos.stream()
		.map(Curso::getNome);
		
		nomes.forEach(System.out::println);
		
		System.out.println("______________________");
		
		cursos.stream()
		   .filter(c -> c.getAlunos() > 50)
		   .map(c -> c.getAlunos())
		   .forEach(System.out::println);
		
		System.out.println("______________________");

	}

}