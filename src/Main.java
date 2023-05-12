import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pontos=0;
        int ganhou=0;
        int perdeu=0;
        //int invalido=0;
        System.out.println("-----Jogo dos dados-----");
        System.out.println("Você terá 5 tentativas\n");
        System.out.println("-------Instruções-------");
        System.out.println("* Caso seu número seja igual o número gerado, ganha 10Pts.");
        System.out.println("* Caso seu número seja 1 numero acima ou abaixo do número gerado, ganha 5Pts.");
        System.out.println("* Caso não seja nenhuma das opções, você perde.");
        System.out.println("*O programa so ira rodar se o número que você colocar estiver entra (0-10).");

        int i=0;
        while (i<5){
            Scanner entrada=new Scanner(System.in);
            int numero;
            System.out.println("---------------------------------");
            System.out.println("Informe um número de 0 até 10: ");
            numero= entrada.nextInt();

            while (numero>10 || numero<0){
                System.out.println("Entrada invalida, entre novamente com um valor.");
                System.out.println("Informe um número de 0 até 10: ");
                numero= entrada.nextInt();
            }
            Random random=new Random();
            int numeroAleatorio=random.nextInt(10);

            int valorAcima=numero+1;
            int valorAbaixo=numero-1;
            System.out.println("Número Aleatorio: "+numeroAleatorio);
            System.out.println("valorAcima: "+valorAcima+", valorabaixo: "+valorAbaixo);

            if (numero==numeroAleatorio) {
                pontos+=10;
                ganhou++;
                System.out.println("Você ganhou 10 pontos.");
            }
            else if (numeroAleatorio==valorAbaixo || numeroAleatorio==valorAcima) {
                pontos+=5;
                ganhou++;
                System.out.println("Você ganhou 5 pontos.");
            }
            //Substitui essa função pelo while na linha 26.
            /*else if (numero>10)
                invalido++;
                System.out.println("Rodada inválida.");
            }*/
            else {
                perdeu++;
                System.out.println("Você perdeu o jogo.");
            }
            i++;
        }
        System.out.println("---------------------------------");
        System.out.println("Você está com " + pontos + " pontos.");
        System.out.println("De 5 rodadas você ganhou "+ganhou+" e perdeu "+perdeu+".");
        }
    }
