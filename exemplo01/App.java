package exemplo01;

public class App {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Marcos Silva", 3000, 8);
        Funcionario funcionario = new Funcionario("Camila", 4000);

        //gerente.teste();
        System.out.println(gerente.exibir());
        System.out.println(funcionario.exibir());
    }
}