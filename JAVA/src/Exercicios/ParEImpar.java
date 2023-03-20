//Digite X números e informe quantos números pares/ímpares foram digitados.


package Exercicios;
import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] argss){
        Scanner leitor = new Scanner(System.in);
        int num, contPar = 0, contImpar = 0;
        
        for(int i = 1; i <= 5; i++){
            System.out.println("Digite o " + i + "º número");
            num = leitor.nextInt();
            
            if(num % 2 == 0){
                contPar++;
            }

            // para informar números impares
            /*
            if(num % 2 == 1){
                contImpar++;
            }
            */
        }
        
        System.out.println("Foram digitados " + contPar + " números pares \n");
        // System.out.println("E " + contImpar + " números ímpares");
        
    }
}
