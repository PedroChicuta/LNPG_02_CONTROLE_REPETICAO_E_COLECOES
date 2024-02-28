import java.util.Scanner;

public class pi {
    public static void main(String[] args) {
        int num;
        double S = 0;
        int divisor = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero inteiro representando numero de termos da serie S:");
        num = sc.nextInt();
        for(int i = 0; i <= num; i++){
            if(i%2 == 0){
                S += 1 / Math.pow(divisor, 3);  
            }
            else{
                S -= 1 / Math.pow(divisor, 3);
            }
            divisor+=2;
        }
        System.out.printf("%.5f", Math.pow(S * 32, 1.0 / 3.0));
        sc.close();
    }
}
