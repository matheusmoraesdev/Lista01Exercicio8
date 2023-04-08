    import java.util.Scanner;

public class ex08 {
    public static void main(String [] args) {

    double salario_hora,salario_mensal;
    int horas_trabalhadas;

    Scanner reader = new Scanner(System.in);
        System.out.print("Quantos você ganha por hora ? R$ ");
            salario_hora = reader.nextDouble();
        System.out.print("Quantas horas você trabalha por mês ? ");
            horas_trabalhadas = reader.nextInt();
        reader.close();

    salario_mensal = salario_hora * horas_trabalhadas;

        System.out.println("Você ganha R$ " + salario_mensal + " no mês!");

    }
}
