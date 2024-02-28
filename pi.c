#include <stdio.h>
#include <math.h>

int main()
{
    int num;
    double S = 0;
    int divisor = 1;
    printf("Digite um numero inteiro representando numero de termos da serie S:\n");
    scanf("%d", &num);
    for(int i = 0; i <= num; i++){
        if(i%2 == 0){
            S += 1 / pow(divisor, 3);  
        }
        else{
            S -= 1 / pow(divisor, 3);
        }
        divisor+=2;
    }
    printf("%.5lf", pow(S * 32, 1.0 / 3.0));
    return 0;
}