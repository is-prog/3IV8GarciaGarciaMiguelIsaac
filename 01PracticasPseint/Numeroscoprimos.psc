Algoritmo Numeroscoprimos
	Repetir
		a<-0
		Escribir "Ingrese un numero entero"
		Leer a
		b<-0
		Escribir "Ingrese otro numero entero"
		Leer b
		maximo<-1
		si a >0 y b > 0 Entonces
			x=1
			Mientras  x <= a Hacer 
				si a MOD x ==0 y b MOD x ==0 Entonces
					si x > maximo Entonces
						maximo = x
					FinSi
				FinSi
				x = x+1
			FinMientras
		Fin si
		Si maximo ==1  Entonces
			Escribir "Los numeros " , a , " y " , b, "  son coprimos"
		Sino 
			Si maximo <>1 Entonces
				Escribir "Los numeros no son coprimos"	
			Fin si
		Fin si
	Hasta Que maximo<0
FinAlgoritmo
