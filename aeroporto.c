#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

int main()
{
    int passageiros;
    char rg[30],Passagem[30],dataRg[30],dataPass[30],cadeiraPass[30];
    printf("Bem vindo ao aeroporto\n");

    printf("Quantos passageiros tem no voo?");
    scanf("%d", &passageiros);

    while (getchar() != '\n');

    for(int i = 0; i < passageiros; i++){
        printf("Passageiro %d:\n", i+1);
        printf("Voce possui RG?[se sim digite: RG/se nao digite: Nao possui]");
        fgets(rg, sizeof(rg), stdin);
        rg[strcspn(rg, "\n")] = '\0';
        if (strcmp(rg, "Nao possui") == 0){
            printf("A saida e nessa direcao\n");
            continue;
        }
        else if (strcmp(rg, "RG") != 0){
            printf("opcao invalida\n");
            continue;
        }

        printf("Digite a idade do RG?[formato:DD/MM/YYYY]");
        fgets(dataRg, sizeof(dataRg), stdin);
        dataRg[strcspn(dataRg, "\n")] = '\0';
        if(dataRg[2]!='/' || dataRg[5]!='/'){
            printf("data invalida\n");
            continue;
        }
        printf("Voce possui Passagem?[se sim digite: Passagem/se nao digite: Nao possui]");
        fgets(Passagem, sizeof(Passagem), stdin);
        Passagem[strcspn(Passagem, "\n")] = '\0';
        if (strcmp(Passagem, "Nao possui") == 0){
            printf("A recepcao e nessa direcao\n");
            continue;
        }
          else if (strcmp(Passagem, "Passagem") != 0){
            printf("opcao invalida\n");
            continue;
        }

        printf("Digite a idade da Passagem[formato:DD/MM/YYYY]:");
        fgets(dataPass, sizeof(dataPass), stdin);
        dataPass[strcspn(dataPass, "\n")] = '\0';
        if(dataPass[2] != '/' || dataPass[5] != '/'){
            printf("data invalida\n");
            continue;
        }
        else if(strcmp(dataRg, dataPass) != 0){
            printf("190\n");
            continue;
        }
        printf("Digite a cadeira do passageiro[formato:A12]:");
        fgets(cadeiraPass, sizeof(cadeiraPass), stdin);
        cadeiraPass[strcspn(cadeiraPass, "\n")] = '\0';
        if( !isalpha(cadeiraPass[0]) || isalpha(cadeiraPass[1]) || isalpha(cadeiraPass[2])){
            printf("Formato invalido\n");
            continue;
        }
        printf("seu assento e %s, tenha um otimo dia\n", cadeiraPass);
    }
    return 0;
}