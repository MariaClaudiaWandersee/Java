//Crie um programa que imprima a tabuada de 0 a 10.

import java.util.Scanner;

public class ListaExercicios2 {
    public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
     {
        System.out.println("---- PROGRAMA DE TABUADA ---- ");
        
        System.out.println("Informe um número: ");
        int script = scanner.nextInt();

        int multiplicador = 0;
        while(multiplicador <= 10)
        {
            int result = script * multiplicador;
            System.out.println(result);   
            multiplicador++;
        }
    }
}
}
