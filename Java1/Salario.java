public class Exercicios 
{
    public static void main(String args[])
        {
        double salario = 4500;

        String aliquota = salario <= 1903.98 ? "Isento" : salario <= 2826.65 ? "7.5%" : salario <= 3751.05 ? "15%" : salario <= 4664.68 ? "22.5%" : "27.5%";

        System.out.println(aliquota);
        }
    
}
