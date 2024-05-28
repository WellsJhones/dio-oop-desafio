

import java.time.LocalDate;
import br.com.dio.desafio.dominio.*;

public class Main {
    public static void main(String[] args) {
       Curso curso1 = new Curso();
       curso1.setTitulo("curso java");
       curso1.setDescricao("descrição curso java");
       curso1.setCargaHoraria(8);

       Curso curso2 = new Curso();
       curso2.setTitulo("curso JS ");
       curso2.setDescricao(" domine Js utilizando typescript");
       curso2.setCargaHoraria(4);

       Mentoria mentoria = new Mentoria();
       mentoria.setTitulo("mentoria de java");
       mentoria.setDescricao("Java Spring mentoria");
       mentoria.setData(LocalDate.now());

       Bootcamp bootcamp = new Bootcamp();
       bootcamp.setNome("Bootcamp Java spring");
       bootcamp.setDescricao("Best java Spring bootcamp for java developers");
       bootcamp.getConteudos().add(curso1);
       bootcamp.getConteudos().add(curso2);
       bootcamp.getConteudos().add(mentoria);

       Dev devKami = new Dev();
       devKami.setNome("Kami");
       devKami.inscreverBootcamp(bootcamp);
       System.out.println("Conteúdos inclusos Kami:" + devKami.getConteudosInscritos());

       devKami.progredir();
       devKami.progredir();
       System.out.println("-");
       System.out.println("Conteúdos Inscritos Kami:" + devKami.getConteudosInscritos());
       System.out.println("Conteúdos Concluídos Kami:" + devKami.getConteudosConcluidos());
       System.out.println("XP:" + devKami.calcularTotalXp());

       System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-");

       Dev devJohn = new Dev();
       devJohn.setNome("Jhon");
       devJohn.inscreverBootcamp(bootcamp);
       System.out.println("Conteúdos Inscritos Jhon:" + devJohn.getConteudosInscritos());
       devJohn.progredir();
       devJohn.progredir();
       devJohn.progredir();
       System.out.println("-");
       System.out.println("Conteúdos Inscritos Jhon:" + devJohn.getConteudosInscritos());
       System.out.println("Conteúdos Concluidos Jhon:" + devJohn.getConteudosConcluidos());
       System.out.println("XP:" + devJohn.calcularTotalXp());

         }
}