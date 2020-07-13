package exercicio01;

/**
 * Funcionario
 */
public class Funcionario {

    private String nome;
    private double salario, horas;

    public Funcionario(String nome, double salario, double horas) {
        this.nome = nome;
        this.salario = salario;
        this.horas = horas;
    }


    public String getNome(){
        return nome;
    }
    public double getHoras(){
        return horas;
    }

    public double getSalario() {
        return salario*horas;
    }

    public String exibir(){
        getSalario();
        return nome + ": " +"Valor do salário: R$" + salario*horas;
    }

    
    
}