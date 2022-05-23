
package tabladispersa;
import java.util.Scanner;
public class TablaDispersa {
    

    public static void main(String[] args) {
        StringBuffer poblacion, direccion;
        String clave;
        int numhabitacion,respuesta;
        respuesta=0;
        Scanner Teclado = new Scanner(System.in);
        double precio;
        do{
            System.out.println("¡Buenos dias!");
            System.out.println("Ingrese 1 para insertar una casa");
            System.out.println("Ingrese 2 para eliminar una casa");
            System.out.println("Ingrese 3 para salir");
            respuesta=Teclado.nextInt();
                while(respuesta<1 || respuesta>3){
                System.out.println("Error: La opcion ingresa no es válida");
                System.out.println("Ingrese 1 para insertar una casa");
                System.out.println("Ingrese 2 para eliminar una casa");
                System.out.println("Ingrese 3 para salir");
                respuesta=Teclado.nextInt();
                }
            switch(respuesta){
                
            }    
        }while(respuesta<3);
    }
    
}
