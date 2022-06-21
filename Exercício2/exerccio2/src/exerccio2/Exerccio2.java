/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerccio2;
import java.util.*;
public class Exerccio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nome;
        int idade;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o seu nome: ");
        nome = entrada.next();
        
        System.out.println(" Insira a idade: ");
        idade = entrada.nextInt();
        
        if(idade < 5){
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Idade insuficiente!!");
        }else if (5<= idade && idade<= 7){
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Categoria: Infantil A");
        }else if (8<= idade && idade<= 10){
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Categoria: Infantil B");
        }else if (11<= idade && idade<= 13){
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Categoria: Juvenil A"); 
        } else if (14<= idade && idade<= 17){
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Categoria: Juvenil B");
        } else {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Categoria: Adulto");
        }
    }
    
}
