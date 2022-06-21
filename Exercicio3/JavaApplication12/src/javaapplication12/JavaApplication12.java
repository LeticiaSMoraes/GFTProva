/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication12;
import java.util.*;
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String v = "V";
        
        float totalCompras = 0;
        float totalVista = 0;
        float totalPrazo = 0;
        
        int cont = 1;
        
        Scanner entrada = new Scanner(System.in);
        
        if (cont<=5){
        System.out.print("Insira o valor da compras: ");
        float Compra = entrada.nextFloat();
        
        
        System.out.println("----------------------------------");
        System.out.println("Como deseja efetuar a sua compra? ");
        System.out.println("Para pagar a vista digite V ");
        System.out.println("Para pagar a prazo digite P ");
        v = entrada.next();
        
        
        if (v == "V"){
            totalVista = totalVista + Compra;
            cont++;
        } else {
            totalPrazo = totalPrazo + Compra;
            cont++;
        }
       
        
    } totalCompras = totalPrazo + totalVista;
            System.out.println("total de todas as compras a vistas: " + totalVista);
            System.out.println("Total de todas as compras a prazo: " + totalPrazo);
            System.out.println("Total das compras: " + totalCompras);
            
            
        
    }
    
}
