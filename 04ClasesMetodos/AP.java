import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.Math;
class AP{
	
	Scanner entrada = new Scanner(System.in);
	
	double b = 0.0, h = 0.0, l1 = 0.0, per=0.00, ar=0.00;
	char op;
	char letra;
	
	public void menu(){
		do{
		System.out.println("Bienvenido al programa de Miguel Isaac Garcia Garcia");
        System.out.println("Elige una opcion");
        System.out.println("a .- Area y perimetro de un Triangulo");
        System.out.println("b.- Area y perimetro de un Rectangulo");
        System.out.println("c.- Area y perimetro de un Cuadrado");
        System.out.println("d.- Area y perimetro de un Circulo");
		System.out.println("e.- Salir del programa");
        op = entrada.next().charAt(0);

		try{
		switch (op) {
            case 'a':
					System.out.println("Ingrese la longitud de la base");
					b = entrada.nextDouble();
					System.out.println("Ingrese la longitud de la altura");
					h = entrada.nextDouble();
					System.out.println("Ingrese la longitud del lado restante");
					l1 = entrada.nextDouble();
					aT();
					pT();
					
                break;
            case 'b':

					System.out.println("Ingrese la longitud del lado mayor");
					b= entrada.nextDouble();
					System.out.println("Ingrese la longitud del lado menor");
					h= entrada.nextDouble();
					aR();
					pR();
                break;
            case 'c':
					System.out.println("Ingrese la longitud de un lado del cuadrado");
					b = entrada.nextDouble();
					aC();
					pC();
                break;
            case 'd':
					System.out.println("Ingrese la longitud del radio del circulo");
					b= entrada.nextDouble();
					
					aCi();
					pCi();
					
                break;
			case 'e':
			System.out.println("¿Desea salir del programa? Presione s si asi lo desea");
				Scanner tecla = new Scanner(System.in);
				letra = tecla.next().charAt(0);
				if(letra == 's'|| letra == 'S'){
					System.exit(0);
				}
            default:
                System.out.println("Gracias por estar aqui, pero hay que mimir, operacion no valida");
		}
		}catch(InputMismatchException ex){
					System.out.println("Por favor ingrese solamente numeros en este apartado");
					System.exit(0);
				}	
		
		
		}while(letra != 'e');	
		
		
	}
	    public void aT(){
			ar= (h*b)/2;
			System.out.println("Tu area es iagual a "+ar);	
		}
		
		public void pT(){
			per= h + b + l1;
			System.out.println("Tu perimetro es igual a "+per);
		}
		
		public void aR(){
			ar = b*h;
			System.out.println("Tu area es iagual a "+ar);	
		}
		
		public void pR(){
			per= (b+h) * 2;
			System.out.println("Tu perimetro es igual a "+per);
		}
		public void aC(){
			ar =b * b;
System.out.println("Tu area es iagual a "+ar);	
		}
		public void pC(){
			per = b*4;
			System.out.println("Tu perimetro es igual a "+per);
		}
		
		public void aCi(){
			ar= Math.PI*(b*b);
System.out.println("Tu area es iagual a "+ar);	
		}
		public void pCi(){
			per= 2*Math.PI*b;
System.out.println("Tu perimetro es igual a "+per);
		}
}