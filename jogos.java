import java.util.Scanner;
public class jogos {
    public static void main(String[] args) {
        int qntVendas;
        Scanner sc = new Scanner(System.in);
        double valArrecadado, valorDeBonus, salario, bonus;
        System.out.print("Digite o total de vendas de caterina nesse mes:");
        qntVendas = sc.nextInt();
        valArrecadado = (qntVendas * 19.90) * 0.5;
        bonus = 0.08 * valArrecadado;
        if(qntVendas%15 == 0){
            valorDeBonus = (qntVendas/15) * bonus;
        }
        else{
            valorDeBonus = ((qntVendas - (qntVendas%15))/15) * bonus;
        }
        salario = valorDeBonus + (valArrecadado);
        System.out.printf("%.2fR$ foram arrecadados em vendas; \nO bonus foi de %.2fR$;\n%.2fR$ foi o salario dela ao fim do mes.", valArrecadado, valorDeBonus, salario);
        sc.close();
        }
}
