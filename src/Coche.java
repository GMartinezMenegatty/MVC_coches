/**
 * Clase que genera al coche
 * controla y devuelve la velocidad, kiometros,
 * metricula y gasolina
 */

public class Coche {
    String matricula;
    String modelo;
    Integer velocidad;
    double kilometros = 0;
    double gasolina = 0;

    public Coche(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = 0;
        this.kilometros = 0;
        this.gasolina = 0;
    }
}
