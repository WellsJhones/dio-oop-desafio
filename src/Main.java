import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setCargaHoraria(8);
        curso.setTitulo("brabo");
        curso.setDescricao("nada");
        System.out.println(curso);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("brabo");
        mentoria.setDescricao("nada");
        mentoria.setData(LocalDate.of(2010, 10, 10));
        System.out.println(mentoria);
    }
}