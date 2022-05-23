
package tabladispersa;
import java.util.Scanner;
public class TablaDispersa {
    private static String clave;
    private static Tabla tablaHash = new Tabla();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer poblacion, direccion;
        String clave;
        int numHabitacion,respuesta;
        respuesta=0;
        double precio;
        do{
            System.out.println("¡Buenos dias!");
            System.out.println("Ingrese 1 para insertar una casa");
            System.out.println("Ingrese 2 para eliminar una casa");
            System.out.println("Ingrese 3 para buscar una casa");
            System.out.println("Ingrese 4 para salir");
            respuesta=sc.nextInt();
            sc.nextLine();
                while(respuesta<1 || respuesta>4){
                System.out.println("Error: La opcion ingresa no es válida");
                System.out.println("Ingrese 1 para insertar una casa");
                System.out.println("Ingrese 2 para eliminar una casa");
                System.out.println("Ingrese 3 para buscar una casa");
                System.out.println("Ingrese 4 para salir");
                respuesta=sc.nextInt();
                sc.nextLine();
                }
            switch(respuesta){
               case 1:
                    CasaRural casaInsertar = new CasaRural();
                    tablaHash.insertar(casaInsertar);
                    break;
                   case 2:
                    System.out.print("Ingrese la clave de la casa que desea Eliminar \n");
                    clave=sc.nextLine();
                    tablaHash.eliminar(clave);
                    break;
                    case 3:
                    CasaRural casaMostrar = new CasaRural();
                    System.out.print("Ingrese la clave de la casa que desea Buscar \n");
                    clave=sc.nextLine();
                    casaMostrar = tablaHash.buscar(clave);
                    casaMostrar.muestra();
                    break;
                }    
        }while(respuesta<4);
    }
    
}
