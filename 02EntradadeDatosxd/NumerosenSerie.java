import java.util.Scanner;
import java.util.ArrayList;

class NumerosenSerie{
	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		System.out.println("Programa de Garcia Garcia Miguel Isaac 3IV8");
		System.out.println("Ingrese una serie de numeros positivos y negativos, escribe 0 para terminar la sucesion: ");
		int input = entrada.nextInt();
		//Iterator <Double> xd=numeros.iterator();
		
		while(input != 0){
			numeros.add(input);
			input = entrada.nextInt();
			
		}
		System.out.println(".................");
		
		for(int i : numeros){
			System.out.println(i);
			
		}
		
		ArrayList <Integer> positivos = new ArrayList<Integer>();
		ArrayList <Integer> negativos = new ArrayList<Integer>();
		for(int j = 0; j<numeros.size(); j++){
			
			if(numeros.get(j) > 0){
				positivos.add(numeros.get(j));
			}
			
			if(numeros.get(j) < 0){
				negativos.add(numeros.get(j));
			}	
		}
		System.out.println("Estos son los números positivos de la sucesión: ");	
		for(int k : positivos){
			System.out.println(k);
			
		}
		
		System.out.println("Estos son los números negativos de la sucesión: ");	
		for(int p : negativos){
			System.out.println(p);
			
		}
		
		//ArrayList <Int> negativos = new ArrayList<Int>();
		//for(int n = 0; n<numeros.length; n++){
			
			//if(numeros.get(n) < 0){
				//negativos.add(n);
			//}
		//}
		//System.out.println("Estos son los números negativos de la sucesión: ");	
		//for(int p : negativos){
			//System.out.println(p);
			
		//}
		
	}
}
		