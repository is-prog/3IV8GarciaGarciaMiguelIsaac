import java.util.Scanner;
import java.util.InputMismatchException;
class Ll{
	
	
	String nc;
	int cr = 0; 
	double crr = 0.0;
	double ct = 0.0;
	double ln = 0.5;
	double li = 0.6;
	double lc = 0.2;
	int nln = 0;
	int nli = 0;
	int nlc = 0;
	String dec;
	char letra;
	

	public void St(){
		do {
		System.out.println("Bienvenido al programa de Miguel Isaac Garcia Garcia");
        System.out.println("Costo total de llamadas ");
			Scanner ent = new Scanner(System.in);
		
				try{
					System.out.println("Ingrese su numero");
					nc = ent.nextLine();
					System.out.println("Ingrese su credito actual");
					cr = ent.nextInt();
					System.out.println("Ingrese el numero de llamadas Locales Nacionales realizadas");
					nln = ent.nextInt();
					System.out.println("Ingrese el numero de llamadas Locales Internacionales realizadas ");
					nli = ent.nextInt();
					System.out.println("Ingrese el numero de llamadas Celulares realizadas ");
					nlc = ent.nextInt();	
				
					Costot();
				}catch(InputMismatchException ex){
					System.out.println("Por favor ingrese solamente numeros en este apartado");
					System.exit(0);
				}	
					System.out.println("¿Quiere consultar su crédito? Si/No");
					Scanner ent2 = new Scanner(System.in);
					dec = ent2.nextLine();
					switch(dec){
						case "Si":
							Creres();
							break;
						case "No":
							System.out.println("¿Deseas repetir el programa? Si lo desea escriba s");
							Scanner ent3 = new Scanner(System.in);
							letra = ent3.next().charAt(0);
							
							break;
						default:
							System.exit(0);
						break;
					}
						
					
			}while(letra == 's' || letra == 'S');		
		}
	
	public void Costot(){
		ct = (nln*ln)+(nli*li)+(nlc*lc);
		System.out.println("El costo total de las llamadas realizadas es: " + ct + " pesos");
	}
	public void Creres(){
		ct = (nln*ln)+(nli*li)+(nlc*lc);
		crr = cr - ct;
		System.out.println("Su credito restante es de: " + crr + " pesos");
	}


}
