import java.util.Scanner;

/**
 * Clase encargada de la interacción con el usuario
 */
public class View {


    public void menu() {
        Controller c = new Controller();
        int opcion = 0;
        do {
            System.out.println("\n--- GESTOR COCHES ---");
            System.out.println("1. Añadir Coche");
            System.out.println("2. Mostrar velocidad");
            System.out.println("3. Avanzar");
            System.out.println("4. Mostrar kilómetros");
            System.out.println("5. Poner gasolina");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = new Scanner(System.in).nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Modelo: ");
                    String modelo = new Scanner(System.in).next();
                    System.out.println("Matricula: ");
                    String matricula = new Scanner(System.in).next();
                    c.añadirCoche(modelo, matricula);
                    System.out.println("Se ha añadido correctamente");
                }

                case 2 -> {

                    System.out.println("Matricula: ");
                    String matricula = new Scanner(System.in).next();
                    System.out.println("Nueva velocidad: ");
                    int velocidad = new Scanner(System.in).nextInt();
                    c.newVelocidad(matricula,velocidad);
                    System.out.println("Se ha cambiado correctamente");

                }
                case 3 -> {

                    System.out.println("Matricula: ");
                    String matricula = new Scanner(System.in).next();

                    System.out.println("Metros recorridos: ");
                    double metros = new Scanner(System.in).nextDouble();

                    boolean a = c.avanzar(matricula, metros);

                    if (a == true) {
                        System.out.println("El coche ha avanzado");
                    }
                    else {
                        System.out.println("Algo ha fallado");
                    }
                }
                case 4 -> {

                    System.out.println("Matricula: ");
                    String matricula = new Scanner(System.in).next();

                    System.out.println("Kilómetros recorridos: "
                            + c.miModel.getKilometros(matricula));
                }
                case 5 -> {

                    System.out.println("Matricula: ");
                    String matricula = new Scanner(System.in).next();

                    System.out.println("Litros gasolina: ");
                    double gasolina = new Scanner(System.in).nextDouble();

                    boolean a = c.ponerGasolina(matricula, gasolina);

                    if(a == true){
                        System.out.println("Gasolina añadida");
                    }
                    else{
                        System.out.println("Algo ha fallado");
                    }
                }

                case 6 -> {
                    System.out.println("Saliendo...");
                }
            }
        } while (opcion != 6);
    }

    public boolean muestraVelocidad(String matricula, Integer v){
        System.out.println(matricula + ": " + v + "km/hr");
        return true;
    }
    /**
     * Muestra kilómetros recorridos
     * @param matricula matrícula
     * @param km kilómetros
     * @return true si se mostró correctamente
     */
    public boolean mostrarKilometros(String matricula, double km){

        System.out.println(matricula + ": "
                + km + " km recorridos");

        return true;
    }
    /**
     * Muestra la gasolina actual
     * @param matricula matrícula
     * @param gasolina litros
     * @return true si se mostró correctamente
     */
    public boolean mostrarGasolina(String matricula, double gasolina){

        System.out.println(matricula + ": "
                + gasolina + " litros");

        return true;
    }
}