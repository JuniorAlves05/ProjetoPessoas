package projetopessoas;

public class Aluno extends Pessoa {
    String matr;
    String curso;

    public static void cancelarMatr(){

    }

    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
