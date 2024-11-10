/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edadparavotar;

/**
 *
 * @author jcplo
 */
public class Edadparavotar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);        
    System.out.print("Ingresar edad: ");
    int edad = scanner.nextInt();  
    if (edad >= 18){
    System.out.println("Puedes votar.");
    }else{
    System.out.println("No puedes votar.");
    }
    scanner.close();
    }
}
