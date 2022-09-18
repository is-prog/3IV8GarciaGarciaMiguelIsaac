//esto es un comentario

/**
 * Todo programa en java debe de tener el nombre de la clase tal cual como el
 * archivo
 */

class EntradadeDatos {
    // los limites de la clase

    // toda clase debe tener un metodo principal
    /**
     * vamos a realizar un programa mediante el cual podemos introducir texto a
     * nuestra convenencia
     */

    // tipo de dato
    // el ; es el fin de linea

    // metodo principal
    public static void main(String[] args) {

        String nombre;
        // instancia
        System.out.println("Por favor introduce tu nombre bien kawai");

        // vamos a obtenet el nombre del usuario
        nombre = System.console().readLine();

        System.out.println("Hola  " + nombre + "  bienvenido a tu programita");
    }

}