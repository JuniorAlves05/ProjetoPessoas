package projetopessoas;

public class projetopessoas {
    public static void main (String[]args){
        // Programa Principal

        Pessoa       p1 = new Pessoa();
        Aluno        p2 = new Aluno();
        Professor    p3 = new Professor();
        Funcionario  p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Roberto");
        p4.setNome("Fabiana");

        p1.setIdade(13);
        p2.setIdade(15);
        p3.setIdade(18);
        p4.setIdade(22);

        p2.setCurso("Informatica");
        p3.setSalario( 2500.75f);
        p4.setSetor("Estoque");

        p3.receberAumento(550.20f);
        p4.mudaTrabalho();
        p2.cancelarMatr();

        p1.setSexo("M");
        p2.setSexo("M");
        p3.setSexo("F");
        p4.setSexo("F");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

        //Teste de atualizacao.


    }
}
