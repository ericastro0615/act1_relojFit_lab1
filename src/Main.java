import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Reloj unReloj = new Reloj("Modelo1", 123456789);
        Persona unaPersona = new Persona("Jose", 20, 1.80, unReloj);
        RelojFit unRelojFit = new RelojFit("Modelo Fit", 987654321);


        try {
            System.out.println("Hola!🙋‍♂️ \n Qué desea hacer?");
            int opcion;

            do {
                System.out.println("------------------------------");
                System.out.println("1) Incrementar dia");
                System.out.println("2) Incrementar hora");
                System.out.println("3) Mostrar dia y hora");
                System.out.println("4) Limpiar pantalla");
                System.out.println("5) Contar pasos");
                System.out.println("6) Frecuencia Aleatoria");
                System.out.println("7) Salir");

                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        unaPersona.getReloj().incrementarDia();
                        break;
                    case 2:
                        unaPersona.getReloj().incrementarHora();
                        break;
                    case 3:
                        unaPersona.decirHora();;
                        break;
                    case 4:
                        unaPersona.getReloj().LimpiarPantalla();
                        break;
                    case 5:
                        System.out.println("Ingrese los valores de X:");
                        int x=leer.nextInt();
                        System.out.println("Ingrese los valores de Y:");
                        int y=leer.nextInt();
                        unRelojFit.cuentaPasos(x, y);
                        break;
                    case 6:
                        unRelojFit.getFrecuenciaAleatoria();
                        break;
                    case 7:
                        System.out.println("Adios! ");
                        break;
                    default:
                        System.out.println("Opción incorrecta, reintente nuevamente");

                }


            } while (opcion != 7);
        }catch (InputMismatchException e){
            System.out.println("Ingrese un número válido");
        }

    }


}

