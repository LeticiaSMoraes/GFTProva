/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package censo;
import java.util.*;
/**
 *
 * @author Leticia
 */
public class Habitantes{

    public int empregados;
    public String desempregados;
    public int numfilhos;
    public int totalEmpregados;
    public int totalFilhos;
    
    protected double salario;
  
    Scanner entrada = new Scanner(System.in);
    
    public void contarPessoas(){
        System.out.println("----PESQUISA DA CIDADE-----");
        System.out.print("Quantos filhos moram na sua residencia? ");
        
        int contCriancas = entrada.nextInt();
        
        this.setNumfilhos(this.getNumfilhos()+ contCriancas);
        
        System.out.println("Gostaria de saber se o senhor(a), tem algum tipo de remuneracao?"
        + "/ n, seja ela por trabalhos formais e informais");
        System.out.println("Digite:" + "\n SIM - S" + "\n NAO - N");
        String resposta = entrada.next();
        
        this.setDesempregados(resposta);
        
        if (desempregados == "S"){
                   
            this.setEmpregados(getmpregados()+1);
            System.out.println("Informe a quantia  recebida por mes: ");
            salario = entrada.nextDouble();
            System.out.println("Obrigada pela sua participação!!");
            } else {
            System.out.println("Obrigada pela sua participação!!");
 
        }
    }

    public int getmpregados() {
        return empregados;
    }

    public void setEmpregados(int empregados) {
        this.empregados = empregados;
    }

    public int getNumfilhos() {
        return numfilhos;
    }

    public void setNumfilhos(int numfilhos) {
        this.numfilhos = numfilhos;
    }

    public int getTotalEmpregados() {
        return totalEmpregados;
    }

    public void setTotalEmpregados(int totalEmpregados) {
        this.totalEmpregados = totalEmpregados;
    }

    
    public String getDesempregados() {
        return desempregados;
    }

    public void setDesempregados(String desempregados) {
        this.desempregados = desempregados;
    }

    public void informarSalario(){
        
    }

    public double getSalario(double f) {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

 
    
    
}
