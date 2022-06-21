/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concessionaria;
import java.util.*;
/**
 *
 * @author Leticia
 */
public class Concessionaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double valorCarro;
        double valotFinal;
        String v = "V";
        int parcelas;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Insira o valor do automóvel: ");
        valorCarro = entrada.nextFloat();
        
        System.out.println("Como deseja efetuar a sua compra? ");
        System.out.println("Para pagar a vista digite V ");
        System.out.println("Para pagar a prazo digite P ");
        v = entrada.next();
        
         if (v == "V"){
            valotFinal = (valorCarro * 0.8);
             System.out.println("O valor final do carro teve um desconto de 20% e ficou em R$ " + valotFinal);
            ;
        } else {
             System.out.println("Insira a quantidade de parcelas que serao divididas?");
             System.out.println("6 - parcelas");
             System.out.println("12 - parcelas ");
             System.out.println("18 - parcelas");
             parcelas = entrada.nextInt();
             
             if (parcelas == 6){
             }
        }
        
    }
    
}
