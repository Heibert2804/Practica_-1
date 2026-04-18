import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Principal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<obj> pila = new Stack<>();
        Queue<obj> cola = new LinkedList<>(); 
        boolean seguir = true;
        Metodos m = new Metodos();
        System.out.println("BIENVENIDO \n");
        
        while (seguir) {
            System.out.println("Selecione lo que desea realizar");
            System.out.println("1. Ingrese datos de la pagina WEB");
            System.out.println("2. Historial");
            System.out.println("3. Retroceder");
            System.out.println("4. SALIR");
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    m.Llenarpila(pila, sc);
                    break;
                case 2:
                    m.mostrarpila(pila, sc);
                    break;
                case 3:
                    System.out.println("a");
                    break;
                case 4:
                    System.out.println("GRACIAS Y ADIOS");
                    seguir = false;
                    break;
                default:
                    System.out.println("Digite una opcion correcta");
                    break;
            }
        }
    }
}