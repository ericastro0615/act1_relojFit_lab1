

public class Persona {

    private String nombre;
    private int edad;
    private double altura;
    private Reloj reloj;
    private RelojFit relojFit;


    public Persona(String nombre, int edad, double altura, Reloj reloj) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.reloj = reloj;
    }

    public Reloj getReloj() {
        return reloj;
    }

    public void setReloj(Reloj reloj) {
        this.reloj = reloj;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void decirHora() {
        System.out.println("Dia: " + this.reloj.getDia() + " Hora: " + this.reloj.getHora());
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + ", reloj=" + reloj + '}';
    }

}
