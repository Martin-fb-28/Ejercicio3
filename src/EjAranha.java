import java.util.Scanner;

public class EjAranha {
    public static void main(String[] args) {
        int vida = 100;
        int distancia = 0;
        boolean sobrevivio = false;

        System.out.println(" Bienvenidos a la historia de una peculiar aranha ");

        System.out.println(" ¿ Cual es el nombre de la aranha ? ");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        System.out.println( nombre + " Entra en la clase de DAM muy silenciosamente y escala hasta el techo");

        System.out.println(" ¿Que hace Samuel tras entrar al aula? ");
        System.out.println(" 1) Investiga ");
        System.out.println(" 2) Se desplaza ");
        int respuesta = sc.nextInt();

        if (respuesta == 1) {
System.out.println(" Investiga que hacen los alumnos y para hacerlo de la mejor manera posible se acerca a las pantallas colgandose de su tela ");
        }else if (respuesta == 2) {
            System.out.print(" Se va ");
            return;
        }


        System.out.println(" ¿Qué hace ahora? " + nombre);
        System.out.println(" 1) va hacia Jose Antonio ");
        System.out.println(" 2) Se asusta ");
        int decision = sc.nextInt();


        if (decision == 1) {
            distancia += 4;
            System.out.println(nombre + " trepa por la espalda de Jose Antonio y se esconde ");
        } else if (decision == 2) {
            distancia += 8;
            System.out.println(nombre + " se escapa por la ventana en busca de una nueva aventura ");
            return;
        }
    System.out.println( " Escoge un camino: ");
    System.out.println(" 1. Al irse con Jose antonio lo descubren y se pelea ");
    System.out.println(" 2. En vez de pelear se escapa ");
    int decision2 = sc.nextInt();

    if(decision2 == 1) {
        vida -= 100;
        distancia += 5;
        sobrevivio = false;
        System.out.println(nombre + " Se pelea con Jose antonio y muere ");
        return;
    }
    if (decision2 == 2){
        vida -= 0;
        distancia += 10;
        sobrevivio = true;
    System.out.println( nombre + " escapa y sobrevive ");
        }
    System.out.println(" ¿Qué tiene en mente? " + nombre);
    System.out.println(" 1) Encuentra una nueva aventura ");
    System.out.println(" 2) vuelve a su hogar y descansa ");
    int decision3 = sc.nextInt();

  if (decision3 == 1 && decision2 == 2){;
            vida -= 0;
            distancia += 10;
            sobrevivio = true;
            System.out.println( nombre + " Vive la vida hasta que la atropella un camión ");
        }
      if (decision3 == 2 && decision2 == 2) {
          System.out.println( nombre + " vuelve con su familia y vive felizmente ");
      }
   System.out.println(" Fin de esta aventura ");

      //estadísticas

    System.out.println(" La vida es:" + vida);
    System.out.println(" La distancia es:" + distancia);
    System.out.println(" La sobrevivio es:" + sobrevivio);







    }
}

