import java.time.LocalDate;
import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Reloj {
    private String hora, dia, modelo;
    private long numSerie;

    public Reloj(String modelo, long numSerie) {
        this.hora = LocalTime.now().withNano(0).toString();
        this.dia = LocalDate.now().toString();
        this.modelo = modelo;
        this.numSerie = numSerie;
    }


    public String getHora() {
        return hora;
    }

    public String getDia() {
        return dia;
    }

    public void incrementarDia() {
        Scanner leer = new Scanner(System.in);
        LocalDate diaActual = LocalDate.now();

        try {
            System.out.println("¿Cuántos dias desea incrementar?");
            int aux = leer.nextInt();
            System.out.println("La fecha modificada es: " + dia);
            dia = diaActual.plusDays(aux).toString();
        }  catch (InputMismatchException e) {
        System.out.println("Error: Ingrese un número entero válido.");
    }



    }

    public void incrementarHora() {
        Scanner leer = new Scanner(System.in);
        LocalTime horaActual = LocalTime.now();

        try {
            System.out.println("¿Cuántas horas desea incrementar?");
            int aux = leer.nextInt();
            LocalTime hora = horaActual.plusHours(aux).withNano(0);
            System.out.println("La hora modificada es: " + hora);
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese un número entero válido.");
        }
    }




    public void LimpiarPantalla(){
        LocalDate diaActual = LocalDate.now();
        LocalTime horaActual = LocalTime.now();
        System.out.println("Pantalla limpia ");
        System.out.println("Dia: "+diaActual+" hora: "+horaActual);

    }

    @Override
    public String toString() {
        return "Reloj{" + "hora=" + hora + ", dia=" + dia + ", modelo=" + modelo + ", numSerie=" + numSerie;
    }

}
