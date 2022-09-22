Algoritmo Identificarnumeroprimo
		nump<-0
		Repetir
			Escribir "Inserta cualquier numero"
			Leer nump
			Para x<-1 Hasta nump Hacer
				Si nump%x ==0 Entonces
					z<-z+1
				Fin Si
			Fin Para
			Si z==2 Entonces
				Escribir "El numero es primo"
			SiNo
				Escribir "El numero no es primo"
			Fin Si
		Hasta Que nump<0
FinAlgoritmo
