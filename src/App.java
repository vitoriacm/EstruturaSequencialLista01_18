import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite o tamanho do arquivo em MB");
        double tamanhoArquivo = teclado.nextDouble();

        System.out.println("Digite a velocidade de um link da internet em Mbps");
        double velocidadeinternet = teclado.nextDouble();
        teclado.close();

       double tempoDownloadMinutos = (tamanhoArquivo / (velocidadeinternet / 8)) / 60;
       System.out.printf("Tempo aproximado de download: %.2f minutos", tempoDownloadMinutos);



        

    }
}
