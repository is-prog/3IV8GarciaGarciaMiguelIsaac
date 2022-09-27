
import java.util.Scanner;

class Ejercicio {
    /*
     * Vamos a hacer un programa mediante el cual vamos a tener 4 opciones, que
     * seran una calculadora, conversion de unidades, creacion de un cuadro magico.
     * y un movimiento de un cuadro.
     */
    // objetos
    Scanner entrada = new Scanner(System.in);
    // metodos de comportamietos de la clase
    // vamos a crear un metodo para el menu
    /*
     * public es el acceso a el tipo de dato,clase o metodo cualquier elemento del
     * programa puede acceder a el
     * private es de acceso restringido solo mediante reglas se puede acceder a el
     * protected se puede tener acceso desde la misma clase y aplicando la misma
     * herencia de POO entre los hijos y padres
     * Un metodo es un tipo de dato aplicado
     */
    char op;

    public void menu() {
        System.out.println("Bienvenido a los metodos");
        System.out.println("Elige una opcion");
        System.out.println("a .- Calculadora");
        System.out.println("b.- Conversion de unidades");
        System.out.println("c.- Creacion  de cuadros");
        System.out.println("d.- Movimiento de un cuadro");
        op = entrada.next().charAt(0);

        switch (op) {
            case 'a':
                // vamos a hacer un metodo
                Ejercicio1();
                break;
            case 'b':
                // vamos a hacer un metodo
                Ejercicio2();
                break;
            case 'c':
                // vamos a hacer un metodo
                Ejercicio3();
                break;
            case 'd':
                // vamos a hacer un metodo
                Ejercicio4();
                break;
            default:
                System.out.println("Gracias por estar aqui, pero hay que mimir, operacion no valida");
        }

    }

    // metodo 1
    public void Ejercicio1() {

    }

    // metodo2
    public void Ejercicio2() {

    }

    // metodo3
    public void Ejercicio3() {

    }

    // metodo4
    public void Ejercicio4() {

    }

}