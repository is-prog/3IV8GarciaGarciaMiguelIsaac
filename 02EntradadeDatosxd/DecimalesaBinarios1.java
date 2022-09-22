import java.util.Scanner;

class DecimalesaBinarios1 {
    public static void main(String[] args) {
        // declaro mi objeto
        Scanner entrada = new Scanner(System.in);
		
		int numbinario;
		String binario = "";
		
		 System.out.println("Ingrese el numero positivo entero que deseee convetir a binario");
                    numbinario = entrada.nextInt();
                    binario = "";

                    /* Tengo que comporobar que sea entero positivo */
                    if (numbinario > 0) {
                        // Debo aplicar el algoritmo
                        while (numbinario > 0) {
                            if (numbinario % 2 == 0) {
                                binario = "0" + binario;

                            } else {
                                binario = "1" + binario;
                            }
                            numbinario = (int) numbinario / 2;
                        }
                    } else if (numbinario == 0) {
                        binario = "0";

                    } else {
                        binario = "No se pudo convertir el numero, ingrese solo positivos";
                    }
                    System.out.println("El numero binario es : " + binario);
	}
	
}