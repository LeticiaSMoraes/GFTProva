/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package censo;
import java.util.*;
public class Censo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int cont = 1;
       int populacao = 1;

       
       while (cont != 0){
           while (populacao != 0){
               Habitantes h = new Habitantes();
               h.contarPessoas();
               System.out.println("Há mais alguem para se fazer a pesquisa?");
               System.out.println("Digite "+ "/n, 0 - NAO" + "/n, 1 - SIM");
               
               Scanner entrada = new Scanner(System.in);
               int pararPesquisa = entrada.nextInt();
           }
       }
        
        
        
        
    }
    
}
