import java.util.Scanner;
import java.util.Stack;

public class Metodos {
    public Stack<obj> Llenarpila(Stack<obj> p, Scanner sc){
        boolean seguir = true;
        int opt = 0;
        while (seguir) {
            obj o = new obj();
            sc.nextLine();
            System.out.println("INGRESE URL");
            o.setUrl(sc.nextLine());
            System.out.println("INGRESE NOMBRE DE LA PAGINA");
            o.setTitulo(sc.nextLine());
            System.out.println("INGRESE FECHA");
            o.setFecha(sc.nextLine());

            p.push(o);
            System.out.println("DESEACONTINUAR? 1)SI 2)NO");
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
            System.out.println("LISTA VACIA, POR FAVOR LLENE LA LISTA, DESEA HACERLO AHORA? \n 1) SI 2) NO");
            opt = sc.nextInt();
            if(opt==1){
                m.Llenarpila(p, sc);
            }else{
                return p;
            }
        }
        System.out.println("HISTORIAL:");
        for (obj o : p) {
            System.out.println("URL" + o.getUrl());
        }
        
        return p;
    }
    
}
