#include <stdio.h>
#include <stdlib.h>

int main(){
    int qntVendas;
    float valArrecadado, valorDeBonus, salario, bonus;
    printf("Digite o total de vendas de caterina nesse mes:");
    scanf("%d", &qntVendas);
    valArrecadado = (qntVendas * 19.90) * 0.5;
    bonus = 0.08 * valArrecadado;
    if(qntVendas%15 == 0){
        valorDeBonus = (qntVendas/15) * bonus;
    }
    else{
        valorDeBonus = ((qntVendas - (qntVendas%15))/15) * bonus;
    }
    salario = valorDeBonus + (valArrecadado);
    printf("%.2fR$ foram arrecadados em vendas; \nO bonus foi de %.2fR$;\n%.2fR$ foi o salario dela ao fim do mes.", valArrecadado, valorDeBonus, salario);
}