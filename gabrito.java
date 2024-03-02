import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class gabrito {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Gabarito:");
    
        String gabEntry = sc.nextLine();

        String gabaritoS[] = gabEntry.split(" ");

        ArrayList<String> gabaritoOficial = new ArrayList<String>();

        for(int i = 0; i < gabaritoS.length; i++){
            gabaritoOficial.add(gabaritoS[i]);    
        }

        ArrayList<String> acertos = new ArrayList<>();
        
        ArrayList<String> nomes = new ArrayList<>();
        while (true) {
            System.out.println("Digite o nome e as alternativas:");
            String entradas = sc.nextLine();

            int pontuacao = 0;

            ArrayList<String> alt = new ArrayList<String>();
            
            String arrEntrada[] = entradas.split(" ");

            if(arrEntrada[0].equals("*")){
                break;
            }
            else{
                nomes.add(arrEntrada[0]);
            }
            

            for(int i=1; i < arrEntrada.length; i++){
                alt.add((arrEntrada[i]));
            }
            for(int i=0; i < alt.size(); i++){
                if(alt.get(i).equals(gabaritoOficial.get(i))){
                    pontuacao++;
                }
            }
            acertos.add(String.valueOf(pontuacao));

        }
        

        ArrayList<ArrayList<String>> Participantes = new ArrayList<>();
        for(int i = 0; i < nomes.size(); i++){
            ArrayList<String> UniParticipantes = new ArrayList<>();
            UniParticipantes.add(nomes.get(i));
            UniParticipantes.add(acertos.get(i));
            Participantes.add(UniParticipantes);
        }
        
        //Ordenar em ordem alfabética
        Collections.sort(nomes);
        ArrayList<ArrayList<String>> ParticipantesAlf = new ArrayList<>();
        for(int i = 0; i < nomes.size();i++){
           String nomeAtual = nomes.get(i);
           for(int j = 0; j < Participantes.size();j++){
                String parComp = Participantes.get(j).get(0);
                if(nomeAtual.equals(parComp)){
                    ParticipantesAlf.add(Participantes.get(j));
                }
           }
        }
        System.out.println("Participantes em ordem alfabética");
        for (ArrayList<String> i : ParticipantesAlf) {
            System.out.println("->"+ i);
        }
        //Ordenar por melhores Notas
        Collections.sort(Participantes, Comparator.comparingInt(p -> Integer.parseInt((String) p.get(1))));
        System.out.println("Participantes em ordem de maiores notas:");
        for(int i = Participantes.size()-1; i >= 0 ; i--) {
            System.out.println(Participantes.get(i));
        }

        Collections.sort(Participantes, Comparator.comparingInt(p -> Integer.parseInt((String) p.get(1))));
        System.out.println("Participantes em ordem de menores notas:");
        for(int i = 0; i < Participantes.size(); i++) {
            System.out.println(Participantes.get(i));
        }

        
        //Percentual de alunos com mais de 5 acertos
        //System.out.println(Participantes.size());
        int pessoasPositivas = 0;
        for (int i=0;i < acertos.size(); i++) {
            int num = Integer.parseInt(acertos.get(i));
            if(num >= 6){
                pessoasPositivas++;
            }
        }
        float cincoAcertos = (pessoasPositivas * 100) / (Participantes.size());
        System.out.printf("Percentual de pessoas com pelo menos 5 acertos:%.1f", cincoAcertos);

        
        
        sc.close();
    }
}
