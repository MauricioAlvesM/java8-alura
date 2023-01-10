import static java.util.Comparator.comparing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Curso {

	private String nome;
	private int alunos;

	public Curso(String nome, int alunos) {
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

public class ExemploCursos {
	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("JS", 150));
		cursos.add(new Curso("C", 55));

		cursos.sort(comparing(Curso::getAlunos));
		// cursos.forEach(c -> System.out.println(c.getNome()));

		cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.forEach(c -> System.out.println(c.getNome()));
		
		
		System.out.println("===============================");
		cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.map(Curso::getAlunos)
		.forEach(System.out::println);
		
		
		System.out.println("===============================");
		 int sum  = cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.mapToInt(Curso::getAlunos)
		.sum();
		//.forEach(System.out::println);
		
		 
		System.out.println(sum);
		System.out.println("===============================");
		cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.findAny()
		.ifPresent(c -> System.out.println(c.getNome()));
		
		
		cursos.stream()
		   .filter(c -> c.getAlunos() > 50)
		   .findFirst()
		   .ifPresent(c -> System.out.println(c.getNome()));
		
		
		System.out.println("===============================");
		 
//		Map<String, Integer> map = cursos.stream()
//		.filter(c -> c.getAlunos() >= 100)
//		.collect(Collectors.toMap(
//				c-> c.getNome(),
//				c-> c.getAlunos()));
//		 
//		 System.out.println(map);
		
		cursos.stream()
				.filter(c -> c.getAlunos() >= 100)
				.collect(Collectors.toMap(
						c-> c.getNome(),
						c-> c.getAlunos()))
				.forEach((nome, alunos) -> System.out.println(nome + " Tem " + alunos + " aluno "));
	
		
		System.out.println("===============================");
		 cursos.stream()
		.mapToInt(Curso::getAlunos)
		.average();
		//.forEach(System.out::println);
		 
		 
		 Stream<Curso> stream = cursos.stream()
				   .filter(c -> c.getAlunos() > 50);
		 List<Curso> cf = cursos.stream()
				 .filter(c -> c.getAlunos()>50)
				 .collect(Collectors.toList());
	
	}

}