package projetopessoas;

public class Professor extends Pessoa {
    String especialidade;
    float salario;
    float receberAumento;

    public void receberAumento(float aum){
        this.salario += aum;

    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getReceberAum() {
        return receberAumento;
    }

    public void setReceberAum(float receberAum) {
        this.receberAumento = receberAum;
    }
}
