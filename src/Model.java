import java.util.ArrayList;

/**
 * Clase encargada de manejar los datos
 */
public class Model {
    static ArrayList<Coche> parking = new ArrayList<>();

    /**
     * Crea un coche y lo mete en el parking
     * @param modelo del coche
     * @param matricula identificador unico
     * @return el coche creado
     */
    public Coche crearCoche(String modelo, String matricula){
        Coche aux = new Coche(modelo, matricula);
        parking.add(aux);
        return aux;
    }

    /**
     * Busca coche segun matricula
     * @param matricula a buscar
     * @return chche o null si no existe
     */
    public Coche getCoche(String matricula){
        Coche aux = null;
        // recorre el array buscando por matricula
        for (Coche e: parking) {
            if (e.matricula.equals(matricula)) {
                aux = e;
            }
        }
        return aux;
    }

    /**
     * Cambia la velocidad de un coche
     * @param matricula
     * @param v nueva velocidad
     * @return velocidad modificada
     */
    public int cambiarVelocidad(String matricula, Integer v) {
        // busca el coche
        getCoche(matricula).velocidad = v;
        System.out.println(" LOG esta haciendose");
        // retorna la nueva velocidad
        return getCoche(matricula).velocidad;
    }

    /**
     * Ddevuelve la velocidad segun la matricula
     * @param matricula
     * @return
     */
    public int getVelocidad(String matricula) {
        return getCoche(matricula).velocidad;
    }
    /**
     * Hace avanzar un coche
     * @param matricula matrícula del coche
     * @param metros metros recorridos
     * @return kilómetros actuales
     */
    public double avanzar(String matricula, double metros){

        Coche c = getCoche(matricula);

        if(c != null){
            c.kilometros += metros / 1000;
            return c.kilometros;
        }

        return -1;
    }

    /**
     * Devuelve kilómetros recorridos
     * @param matricula matrícula
     * @return kilómetros recorridos
     */
    public double getKilometros(String matricula){

        Coche c = getCoche(matricula);

        if(c != null){
            return c.kilometros;
        }

        return -1;
    }
    /**
     * hace avanzar un coche
     * consume gasolina dependiendo de la velocidad
     *
     * @param matricula matricula
     * @param metros metros recorridos
     * @return kilometros actuales
     */
    public double Avanzar(String matricula, double metros){
        Coche c = getCoche(matricula);

        if(c != null){
            double kmRecorridos = metros / 1000;
            c.kilometros += kmRecorridos;

            double consumo = kmRecorridos * c.velocidad * 0.01;

            c.gasolina -= consumo;

            if (c.gasolina < 0){
                c.gasolina = 0;
            }
            return c.kilometros;
        }
        return -1;
    }
}