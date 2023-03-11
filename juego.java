import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OUTER:
        while(true){
            System.out.println(" Juego Adivina el numero \n");
            System.out.println("1 - Nivel facil\n"
            + "2 - Nivel intermedio \n"
            + "3 -Nivel Dificil\n"
            +"4 -Salir");
            
            Scanner leer = new Scanner(System.in);
            System.out.print("Ingrese una Opcion: ");
            int opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    jugar(10);
                    break;
                case 2:
                    jugar(7);
                    break;
                case 3:
                    jugar(5);
                    break;
                case 4:
                    System.out.println("Cerrando el programa ");
                    break OUTER;
                default:
                    System.out.println("Opcion Incorrecta");
            }
            
                    
        }
       
    }
    static void jugar(int vidas){
        int numeroRandom = (int)(Math.random()*101);
        int numeroElegido = -1;
        
        Scanner leer = new Scanner(System.in);
        
        while(numeroElegido != numeroRandom){
        System.out.print("Ingrese un numero entre 1 y 100: ");
        numeroElegido = leer.nextInt();
        
        if(numeroRandom < numeroElegido){
            System.out.println("El numero mas pequeño");
            vidas--;
        }else if(numeroRandom > numeroElegido){
            System.out.println("El numero es mas grande");
            vidas--;
            
        }
        if(vidas == 0){
            System.out.println("Game Over");
            System.out.println("----------");
            break;
        }
        System.out.printf("Te quedan %d vidas \n",vidas); 
    }
        if(numeroElegido == numeroRandom){
            System.out.println("Felicidades ganaste el juego");
        }
    } 
    
} 
