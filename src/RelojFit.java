import java.util.Random;

public class RelojFit extends Persona {
    public RelojFit(String modelo, long numSerie) {
        super(modelo, numSerie);
    }


    public void cuentaPasos(int x, int y) {
        double cuentaPasos = Math.abs(x) + Math.abs(y);
        System.out.println("👣 Usted camino: " + cuentaPasos);
    }

    public void getFrecuenciaAleatoria() {
        double frecuencia = Math.random() * (200 - 30 + 1) + 30;
        System.out.println("❤ Frecuencia aleatoria: " + frecuencia);
    }
}
