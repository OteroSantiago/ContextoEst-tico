/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contextoestático;
import domain.Persona;
/**
 *
 * @author Santiago
 */
public class ContextoEstático {
    int contador;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un objeto de la clase persona
        Persona p1 = new Persona("Luis");
        System.out.println("Información de la persona -> "+p1);
        Persona p2 = new Persona("Marcos");
        System.out.println("Informacion de la persona -> "+p2);
        imprimir(p1);
        imprimir(p2);
        
        //this.contador=10;//no se puede
    }
    public static void imprimir(Persona persona){
        System.out.println("Persona = "+persona);
    }
    
    public int getContador(){
        return this.contador;
    }
    
}
