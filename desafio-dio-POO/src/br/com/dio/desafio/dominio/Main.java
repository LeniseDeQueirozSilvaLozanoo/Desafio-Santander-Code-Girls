package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("curso Java");
		curso1.setDescricao("descri��o do curso de Java");
		curso1.setCargaHoraria(10);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso JS");
		curso2.setDescricao("descri��o do curso de JS");
		curso2.setCargaHoraria(5);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria do curso");
		mentoria.setDescricao("Descri��o da mentoria do curso");
		mentoria.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descri��o do bootcamp de Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		System.out.println("Bootcamp dispon�vel: " + bootcamp);
		System.out.println("---------------------------------------------------------------------------");
		
		
		Dev devAna = new Dev();
		devAna.setNome("Ana");
		devAna.inscreverBootcamp(bootcamp);
		System.out.println("CONTE�DO ANA: " + devAna);
		devAna.progredir();
		devAna.calcularTotalXp();
		
		System.out.println("Cursos inscritos por Ana: " + devAna.getConteudosInscritos());
		System.out.println("Cursos conclu�dos por Ana: " + devAna.getConteudosConcluidos());
		System.out.println("Total XP do Ana: " + devAna.calcularTotalXp());
		System.out.println("---------------------------------------------------------------------------");
		
		Dev devLucas = new Dev();
		devLucas.setNome("Lucas");
		devLucas.inscreverBootcamp(bootcamp);
		System.out.println("CONTE�DO LUCAS: " + devLucas);
		devLucas.progredir();
		devLucas.calcularTotalXp();
		
		System.out.println("Cursos inscritos por Lucas: " + devLucas.getConteudosInscritos());
		System.out.println("Cursos conclu�dos por Lucas: " + devLucas.getConteudosConcluidos());
		System.out.println("Total XP do Lucas: " + devLucas.calcularTotalXp());		
	}
}
