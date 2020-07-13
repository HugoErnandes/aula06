package exercicio01;

public class Senior extends Funcionario {

    int qtdeBonus;
    double bonus, valorBonus;

    public Senior(String nome, double salario, double horas, double valorBonus) {
        super(nome, salario, horas);
        this.valorBonus = valorBonus;
	}

    public double getBonus(){
        qtdeBonus = (int)getHoras()/10;
        bonus = qtdeBonus*valorBonus;
        return bonus;
    }

    //polimorfismo  
    @Override
    public String exibir(){
        getBonus();
        return super.exibir() + " Valor do bônus: R$" + bonus;
    }

}