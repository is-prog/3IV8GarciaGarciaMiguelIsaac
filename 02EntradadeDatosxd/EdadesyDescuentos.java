import java.util.Scanner;

class EdadesyDescuentos {
public static void main (String[] args){
    /*
     * Entradas de Datos
     */
    Scanner scanner;
    scanner = new Scanner(System.in);
    double preciofinal = 0;


    System.out.println ("Introduzca su edad");
    int edad = scanner.nextInt();
    System.out.println ("Introduzca el monto de su abono");
    double abono = scanner.nextDouble();



    if (edad >= 65) {
        preciofinal = (abono * 0.40) + abono;
        System.out.println("Su abono final es: " + preciofinal  + " pesos");
    }
    else if(edad <21){
        System.out.println ("¿Tus padres son socios?"); 
        Scanner scanner2;
        scanner2 = new Scanner(System.in);
        String socios;
        socios = scanner2.nextLine();
		
		switch (socios){
			
			case "Si":
				preciofinal = (abono * 0.45 ) + abono;
				System.out.println("Su abono final es: " + preciofinal + " pesos");
			break;
			
			case "No":
				preciofinal = (abono * 0.25) + abono;
				System.out.println("Su abono final es: " + preciofinal + " pesos");
			break;
			
			default :
				System.out.println("Error xd");
			break;
        
        
		}

    }
	else if(edad >= 21 && edad <65){
		System.out.println("No existe un aumento, su abono es: " + abono + " pesos");
	}


        
    }
}