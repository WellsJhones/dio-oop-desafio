package br.com.dio.desafio.dominio;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
public class Curso extends Conteudo {
    //metodos

    private int cargaHoraria;
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }


    //getters
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    //setters
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
