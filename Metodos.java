import java.util.Scanner;
import java.util.Stack;

public class Metodos {
    public Stack<obj> Llenarpila(Stack<obj> p, Scanner sc){
        boolean seguir = true;
        int opt = 0;
        while (seguir) {
            obj o = new obj();
            sc.nextLine();
            System.out.println("Ingrese el URL");
            o.setUrl(sc.nextLine());
            System.out.println("Ingrese el nombre de la pagina");
            o.setTitulo(sc.nextLine());
            System.out.println("Ingrese la fecha");
            o.setFecha(sc.nextLine());

            p.push(o);
            System.out.println("Página visitada correctamente.");
            System.out.println("Desea continuar hacia otra pagina? 1)SI 2)NO");
            opt = sc.nextInt();
            if(opt == 2){
                seguir = false;
            }
        }

        return p;
    }

    public Stack<obj> mostrarpila(Stack<obj> p, Scanner sc){
        int opt = 0;
        Metodos m = new Metodos();
        if(p.isEmpty()){
            System.out.println("Historial Vacio, desa visitar un nueva pagina? \n 1) SI 2) NO");
            opt = sc.nextInt();
            if(opt==1){
                m.Llenarpila(p, sc);
            }else{
                return p;
            }
        }
        System.out.println("Historial de navegacion: \n");
        for (obj o : p) {
            System.out.println("URL: " + o.getUrl());
            System.out.println("Nombre de la pagina: " + o.getTitulo());
            System.out.println("Fecha de ingreso: " + o.getFecha());
            System.out.println("---------------------------------------------------");
        }
        
        return p;
    }

    public Stack<obj> retroceder(Stack<obj> p){
        if(p.size() > 1){
            p.pop();

            System.out.println("Regresaste a: ");
            obj actual = p.peek();

            System.out.println("URL: " + actual.getUrl());
            System.out.println("Título: " + actual.getTitulo());
        } else {
            System.out.println("No hay más páginas para retroceder.");
        }

        return p;
    }
    
}
