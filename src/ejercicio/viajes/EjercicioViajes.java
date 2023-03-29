
package ejercicio.viajes;
import java.util.Scanner;

/**
 *
 * @author 503
 */
public class EjercicioViajes {

    /**
     * Hacer un programa que lea n registros de viajes (código viaje, numero de personas que viajan y ciudad destino),
     * debe imprimir el valor del viaje si el valor por persona para cada destino
     * es el siguiente: Cartagena vale 1200000, Leticia vale 2000000, Cali vale 800000 y Bogotá vale 700000)
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int n;
        String codigoViaje = "";
        int numeroPersonas;
        String ciudadDestino = "";
        double valorPersona = 0;
        double valorViaje = 0;
        
        System.out.println("Ingrese el numero de viajes: ");
        n = teclado.nextInt();
        
        for(int i = 1; i<=n; i++){
            System.out.println("Ingrese el codigo del viaje: ");
            codigoViaje = teclado.next();
            System.out.println("Ingrese el numero de personas que viajan: ");
            numeroPersonas = teclado.nextInt();
            System.out.println("Ingrese la ciudad destino: ");
            ciudadDestino = teclado.next();
            
            switch(ciudadDestino){
                case "Cartagena":
                    valorPersona = 1200000;
                    break;
                case "Leticia":
                    valorPersona = 2000000;
                    break;
                case "Cali":
                    valorPersona = 800000;
                    break;
                case "Bogota":
                    valorPersona = 700000;
                    break;
                default:
                    valorPersona = 0;        
                    
            }
            
            
            valorViaje = numeroPersonas * valorPersona;
            System.out.println("El valor del viaje es: " + valorViaje);
        }
    }
    
}
