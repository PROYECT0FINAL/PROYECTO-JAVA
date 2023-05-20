
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("********** EL PIRATIN **********");
            System.out.println("1. Registrar artista");
            System.out.println("2. Registrar canciones");
            System.out.println("3. Registrar discos");
            System.out.println("4. Agregar disco al catalogo");
            System.out.println("5. Eliminar disco del catálago");
            System.out.println("6. Vender disco");
            System.out.println("7. Salir");
            System.out.println("Elige una opción:");
            System.out.print("********************************");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Has elegido la opción 1");
                    break;
                case 2:
                    System.out.println("Has elegido la opción 2");
                    break;
                case 3:
                    System.out.println("Has elegido la opción 3");
                    break;
                 case 4:
                    System.out.println("Has elegido la opción 4");
                    break;
                 case 5:
                    System.out.println("Has elegido la opción 5");
                    break; 
                case 6:
                    System.out.println("Has elegido la opción 6");
                    break;
                case 7:
                    System.out.println("Has elegido salir del menú");
                    break;
                default:
                    if (opcion < 1 || opcion > 7) {
                        System.out.println("Opción inválida. Inténtalo de nuevo.");
                    }
            }
        } while (opcion != 4);
        sc.close();
    }
}

    
