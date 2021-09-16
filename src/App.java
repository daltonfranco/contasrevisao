import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class App {
    public static void main(String[] args){
        
        /*Conta minhaConta = new Conta();
        
        minhaConta.setNumero(146);

        System.out.println(minhaConta.getNumero());

        minhaConta.setNumero(15789);

        System.out.println(minhaConta.getNumero());*/


        Scanner sc = new Scanner(System.in);


        System.out.print("Digite uma letra: ");
        char letra = sc.next().charAt(0);

        switch(letra){
            case 'A': System.out.println("A letra que voce digitou foi A"); break;
            case 'E': System.out.println("A letra que voce digitou foi E"); break;
            case 'I': System.out.println("A letra que voce digitou foi I"); break;
            case 'O': System.out.println("A letra que voce digitou foi O"); break;
            case 'U': System.out.println("A letra que voce digitou foi U"); break;
        }

    }
}
