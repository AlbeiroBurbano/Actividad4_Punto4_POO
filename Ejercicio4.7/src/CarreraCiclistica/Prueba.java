
package CarreraCiclistica;
import java.util.Scanner;
public class Prueba {
public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
      
        System.out.println("Ingrese el nombre del equipo: ");
        String team = input.next();
         System.out.println("Ingrese el pais: ");
         String pais = input.next();
         
        System.out.println("Ingrese la identificacion del velocista: ");
        int idv = input.nextInt();
        
        System.out.println("Ingrese el tiempo acumulado del velocista: ");
        int timev = input.nextInt();
        
         System.out.println("Ingrese la nombre del velocista: ");
        String namev = input.next();
        
         System.out.println("Ingrese la potencia promedio del velocista: ");
        int pov = input.nextInt();
        
         System.out.println("Ingrese la velocidad promedio del escalador: ");
        int vpv = input.nextInt();
        
        System.out.println("Ingrese la identificacion del escalador: ");
        int ides = input.nextInt();
        
       System.out.println("Ingrese la nombre del escalador: ");
        String namees = input.next();
        
         System.out.println("Ingrese la aceleracion promedio  del escalador: ");
        int aces = input.nextInt();
        
         System.out.println("Ingrese el grado de la rampa del escalador: ");
        int graes = input.nextInt();
        
        System.out.println("Ingrese el tiempo acumulado del escalador: ");
        int timees = input.nextInt();
        
        System.out.println("Ingrese la identificacion del Contrarrelojista: ");
        int idco = input.nextInt();
        
        System.out.println("Ingrese la nombre del Contrarrelojista: ");
        String nameco = input.next();
        
        System.out.println("Ingrese la velocidad maxima del Contrarrelojista: ");
        int vmax = input.nextInt();
        System.out.println("Ingrese el tiempo acumulado del Contrarrelojista: ");
        int timeco = input.nextInt();
    Equipo equipo1 = new Equipo(team,pais);
    Velocista velocista1 = new Velocista(idv, namev, pov, vpv);
    Escalador escalador1 = new Escalador(ides, namees, aces, graes);
    Contrarrelojista contrarrelojista1 = new Contrarrelojista(idco,nameco, vmax);
    equipo1.anadirCiclista(velocista1);
    equipo1.anadirCiclista(escalador1);
    equipo1.anadirCiclista(contrarrelojista1);
    velocista1.setTiempoAcumulado(timev);
    escalador1.setTiempoAcumulado(timees);
    contrarrelojista1.setTiempoAcumulado(timeco);
    equipo1.calcularTotalTiempo();
    equipo1.imprimir();
    equipo1.listarEquipo();
    }
}
