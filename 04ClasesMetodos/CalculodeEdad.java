import java.util.Scanner;
import java.util.InputMismatchException;
class CalculodeEdad{
	
	
	Scanner entrada = new Scanner(System.in);
	
	int naci= 0;
	int actual= 2022;
	int edad= 0;
	char letra;
	
	public void menu(){
		
	do{
		System.out.println("Bienvenido al programita de Garia Garcia Miguel Isaac");
		System.out.println("Ingrese el año en que nacio la persona");
		try{
		naci = entrada.nextInt();
		}catch(InputMismatchException ex){
					System.out.println("Por favor ingrese solamente numeros en este apartado");
					System.exit(0);
		}
		Calculodedatos();
		
		
		System.out.println("¿Desea repetir el programa? Si es así, presione s");
		letra = entrada.next().charAt(0);
	
	}while(letra == 's' || letra == 'S');

	}
		public void Calculodedatos(){
		edad = actual - naci;
		System.out.println("Su edad actual es de: " + edad + " anos");
		
	}
}
	
