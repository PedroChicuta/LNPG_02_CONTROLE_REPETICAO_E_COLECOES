import java.util.Scanner;
public class aeroporto {
    
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Aeroporto");
        Scanner sc = new Scanner(System.in);
        System.out.print("digite a quantidade de passageiros:");
        int qntPass = sc.nextInt();
        sc.nextLine();
        System.out.printf("total de passageiro: %d\n", qntPass);
        for(int i = 0; i < qntPass; i++){
            System.out.printf("Passageiro %d\n", i+1);
            System.out.print("Voce possui RG?[se sim digite: RG/se nao digite: Nao possui]");
            String rg = sc.nextLine();
            if(rg.toUpperCase().equals("NAO POSSUI")){
                System.out.println("A saida e nessa direção");
                continue;
            }
            else if(rg.toUpperCase().equals("RG") == false){
                System.out.println("Opção inválida");
                continue;
            }
            System.out.print("Digite a idade do RG?[formato:DD/MM/YYYY]");
            String dataRg = sc.nextLine();
            if(dataRg.charAt(2) != '/' || dataRg.charAt(5) != '/'){
                System.out.println("Data inválida");
                continue;
            }
            System.out.print("Você possui Passagem?[se sim digite: passagem/se nao digite: Nao possui]");
            String pass = sc.nextLine();
            if(pass.toLowerCase().equals("nao possui")){
                System.out.println("\"A recepcao e nessa direcao");
                continue;
            }
            else if(pass.toUpperCase().equals("PASSAGEM") == false){
                System.out.println("Opção inválida");
                continue;
            }
            System.out.print("Digite a idade da Passagem[formato:DD/MM/YYYY]:");
            String dataPass = sc.nextLine();
            if(dataPass.charAt(2) != '/' || dataPass.charAt(5) != '/'){
                System.out.println("Data inválida");
                continue;
            }
            else if(dataPass.equals(dataRg) == false){
                System.out.println("190");
                continue;
            }
            System.out.print("Digite a cadeira[formato: A12]:");
            String cad = sc.nextLine();
            if(!Character.isLetter(cad.charAt(0)) || Character.isLetter(cad.charAt(1)) || Character.isLetter(cad.charAt(2))){
                System.out.println("Cadeira inválida");
                continue;
            }
            else{
                System.out.printf("seu assento e %s, tenha um otimo dia\n", cad);
            }
        }
        sc.close();
    }
    
}
