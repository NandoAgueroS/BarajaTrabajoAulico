/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package barajatrabajoaulico;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author NandoJ
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("Menú:");
            System.out.println("1. Barajar");
            System.out.println("2. Siguiente carta");
            System.out.println("3. Cartas disponibles");
            System.out.println("4. Dar cartas");
            System.out.println("5. Cartas en el montón");
            System.out.println("6. Mostrar baraja");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    baraja.barajar();
                    break;
                case 2:
                    System.out.println("Siguiente carta: " + baraja.siguienteCarta());
                    break;
                case 3:
                    System.out.println("Cartas disponibles: " + baraja.cartasDisponibles());
                    break;
                case 4:
                    System.out.print("¿Cuántas cartas quieres? ");
                    int cantidad = scanner.nextInt();
                    System.out.println("Cartas dadas: " + baraja.darCartas(cantidad));
                    break;
                case 5:
                    baraja.cartasMonton();
                    break;
                case 6:
                    baraja.mostrarBaraja();
                    break;
                case 7:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del menú.");
                    break;
            }
        } while (opcion != 7);

        scanner.close();
    }
    
}
