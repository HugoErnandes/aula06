package exercicio01;

public class App {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Camila", 100, 35);
        Senior senior = new Senior("Bruno", 100, 35, 50);

        System.out.println(funcionario.exibir());
        System.out.println(senior.exibir());
    }
}