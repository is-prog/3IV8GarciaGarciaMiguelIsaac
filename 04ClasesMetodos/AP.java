import java.util.Scanner;

class AP{
	
	Scanner entrada = new Scanner(System.in);
	
	double l1 =0.0, l2 = 0.0, b =  0.0, h = 0.0, pi= 3.1416, r= 0.0, area = 0.0, peri = 0.0;
	char op;
	
	public void menu(){
		System.out.println("Bienvenido al programa de Miguel Isaac Garcia Garcia");
        System.out.println("Elige una opcion");
        System.out.println("a .- Area y perimetro de un Triangulo");
        System.out.println("b.- Area y perimetro de un Rectangulo");
        System.out.println("c.- Area y perimetro de un Cuadrado");
        System.out.println("d.- Area y perimetro de un Circulo");
        op = entrada.next().charAt(0);

		
		switch (op) {
            case 'a':

					System.out.println("Ingrese la longitud de la base");
					b = entrada.nextDouble();
					System.out.println("Ingrese la longitud de la altura");
					h = entrada.nextDouble();
					System.out.println("Ingrese la longitud del lado restante");
					l1 = entrada.nextDouble();
					
					area= aT(double b, h);
					peri = pT(double l1, b, h);
					
					System.out.println("El area del triangulo es de : " + area + " u.");
					System.out.println("El perimetro del triangulo es de : " + peri + " u.");
				
                break;
            case 'b':

					System.out.println("Ingrese la longitud del lado mayor");
					l1 = entrada.nextDouble();
					System.out.println("Ingrese la longitud del lado menor");
					l2 = entrada.nextDouble();
				
					area = aR(double l1, l2);
					peri = pR(double l1, l2);
					
					System.out.println("El area del rectangulo es de : " + area + " u.");
					System.out.println("El perimetro del rectangulo es de : " + peri + " u.");
					
			
                break;
            case 'c':
					System.out.println("Ingrese la longitud de un lado del cuadrado");
					l1 = entrada.nextDouble();
					
					area = aC(double l1);
					peri = pC(double l1);
					
					System.out.println("El area del cuadrado es de : " + area + " u.");
					System.out.println("El perimetro del cuadrado es de : " + peri + " u.");
				
                break;
            case 'd':
					System.out.println("Ingrese la longitud del radio del circulo");
					r = entrada.nextDouble();
					
					area = aCi(double pi ,r);
					peri = pCi(double pi, r);
					
					System.out.println("El area del circulo es de : " + area + " u.");
					System.out.println("El perimetro del circulo es de : " + peri + " u.");
					
                break;
            default:
                System.out.println("Gracias por estar aqui, pero hay que mimir, operacion no valida");
				
		}
		
		
		
		
		
	}
	    public aT(double a, b){
			double c;
			c = (a*b)/2;
			return c;
			
		}
		
		public pT(double d1, a, b){
			double e
			e = a + b + d1;
			return e;
		}
		
		public aR(double p1, p2){
			double f;
			f = p1*p2;
			return f;
			
		}
		
		public pR(double p1, p2){
			double g;
			g = (p1+p2) * 2;
			return g;
			
		}
		public aC(double r1){
			double h;
			h = r1 * r1;
			return h;
		}
		public pC(double r1){
			double j;
			j = r1*4;
			return j;
		}
		
		public aCi(double si ,ra){
			double k;
			k = si*(ra*ra);
			return k;	
		}
		public pCi(double si, ra){
			double m;
			m = 2*si*ra;
			return m;
		}
}