import java.util.Scanner;
import java.util.Stack;

public class Principal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<obj> pila = new Stack<>();
        boolean seguir = true;
        Metodos m = new Metodos();
        System.out.println("BIENVENIDO \n");
        
        while (seguir) {
            if(!pila.isEmpty()){
                obj actual = pila.peek();
                System.out.println("\nPágina actual: " + actual.getTitulo() + " (" + actual.getUrl() + ")");
            } else {
                System.out.println("\n Página actual: Ninguna");
            }
            System.out.println("Selecione lo que desea realizar");
            System.out.println("1. Visitar pagina");
            System.out.println("2. Retroceder");
            System.out.println("3. Historial de navegacion");
            System.out.println("4. SALIR");
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    m.Llenarpila(pila, sc);
                    break;
                case 2:
                    m.retroceder(pila);
                    break;
                case 3:
                    m.mostrarpila(pila, sc);
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