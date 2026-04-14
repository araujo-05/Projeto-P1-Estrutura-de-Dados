import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
public class TestaProcesso {
    public static void main(String[] args) {
        VetorDinamico v = new VetorDinamico();
        Scanner sc = new Scanner(System.in);
        String solicitante = "";
        String tipo = "";
        int prioridade;
        String data = "";
        int i = 0;
        int j =1;
        while (j>0) {
            System.out.print("\n\nSelceione a operação desejada\n1-Adicionar\n2-Remover\n3-Mostrar Processos\n0-Encerra\nEscolha:");
            j = sc.nextInt();
            sc.nextLine();
            switch(j){
                case 1:
                    System.out.print("Digite o nome do solicitante: ");
                    solicitante = sc.nextLine();

                    System.out.print("Digite o tipo do serviço: ");
                    tipo = sc.nextLine();

                    System.out.print("Digite a prioridade do serviço: ");
                    prioridade = sc.nextInt();

                    Calendar cal = Calendar.getInstance();
                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm");
                    data = formato.format(cal.getTime());

                    v.adiciona(new Processo(solicitante,tipo,prioridade, data));
                    System.out.println("\nCapacidade do Array: " + v.getCapacidade()+"\nOcupação: "+v.getOcupacao()+"\n");

                    sc.nextLine();
                    break;
                case 2:
                    String temp = v.remove();
                    System.err.println(temp);
                    System.out.println("\nCapacidade do Array: " + v.getCapacidade()+"\nOcupação: "+v.getOcupacao()+"\n");
                    break;
                case 3:
                    System.out.print("Lista de Processos\n"+v.listar());                    
                    break;
                default:
                    j=0;
                    break;
            }
            
        }

        System.out.print(v.listar());
         sc.close();
    }
}
