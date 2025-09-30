import java.util.Scanner;


public class Program {
    /**
     * M I   I N T E N T O
     * *********************
     * <p>
     * public static void main(String[] args) {
     * Car carSaab = new Car("Saab", "saab diesel 99", 1999);
     * //
     * carSaab.startEngine();
     * //CON ESTO LINKAMOS POWERONOFF CON CARSAAB
     * powerOnOff(carSaab);
     * }
     * public static void powerOnOff(Car car) {
     * enum turnOnOff {
     * turnOn,
     * turnOff
     * }
     * turnOnOff loqsea = turnOnOff.turnOff;
     * int activation;
     * //MENU USUARIO
     * System.out.println("Hola en que puedo ayudarte?\n" +
     * "\t1. turnOn\n" +
     * "\t2. turnOff\n");
     * <p>
     * Scanner sc = new Scanner(System.in);
     * System.out.println("Hola que desea hacer con su vehiculo?");
     * activation = sc.nextInt();
     * <p>
     * switch (turnOnOff.values()[activation]) {
     * case turnOn:
     * System.out.println("Bienvenid@" + car.getBrand() + car.getModel() + car.getYear());
     * break;
     * case turnOff:
     * System.out.println("No olvides las llaves" + car.getBrand() + car.getModel() + car.getYear());
     * }
     * }
     *
     */


    public static final int OPCION_ENCENDER = 2, OPCION_APAGAR = 1, OPCION_SALIR = 3;

    public static void main(String[] args) {
        Car carSaab = new Car("Saab", "saab diesel 99", 1999);
        int op = -1;

        while (op != 3) {
            op = getUserInput();
            if (op == OPCION_APAGAR) {
                carSaab.stopEngine();
            }
            if (op == OPCION_ENCENDER) {
                carSaab.startEngine();
            }
            if (op == OPCION_SALIR) {
                System.out.println("Chaus");
            }
        }


    }


    public static int getUserInput() {
        System.out.println("1. apagar\n2. Encender");
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        return op;
    }
}

/**
 * A P U N T E S
 * LOS STATICS SIEMPRE ESTAN CARGADOS
 * Y SIEMPRE ESTÁN EN LA MEMORIA
 * SIEMPRE EXISTE EN LA RAM DESDE QUE ARRANCO EL PROGRAMA.
 * LOS STATICS PUEDEN LLAMARSE DESDE LAS INSTANCIAS, PERO NO AL REVÉS!
 * LOS PUBLIC STATICS PUEDEN LLAMARSE DESDE CUALQUIER PARTE DEL PROGRAMA SEA EN Car.java o Program.java
 * <p>
 * <p>
 * LOS NEWS
 * VAN CREANDO HUECOS DONDE NO HAY NADA ALMACENADO
 * <p>
 * SI QUIERE SABER CUANTO OCUPA 'EL COCHE' TENDRIA QUE COMPROBAR TODAS LAS VARIABLES QUE HAY ESCRITAS
 *
 *
 */