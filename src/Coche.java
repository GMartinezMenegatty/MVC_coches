public class Coche {
    String matricula;
    String modelo;
    Integer velocidad;
    double kilometros = 0;

    public Coche(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = 0;
    }
}
