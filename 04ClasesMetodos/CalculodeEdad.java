import java.util.Scanner;

class CalculodeEdad{
	
	Scanner entrada = new Scanner(System.in);
	
	int naci= 0;
	int actual= 2022;
	int edad= 0;
	
	
	public void Ingresodedatos(){
		System.out.println("Bienvenido al programita de Garia Garcia Miguel Isaac");
		System.out.println("Ingrese el año en que nacio la persona");
		naci = entrada.nextInt();
		
	}
	
	public void Calculodedatos(){
		edad = actual - naci;
		System.out.println("Su edad actual es de: " + edad + " anos");
		
	}
	
}