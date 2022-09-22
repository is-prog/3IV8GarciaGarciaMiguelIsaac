Algoritmo Factorialdeunnumero
	Repetir
		num1<-0
		factorial<-1
		Escribir "Ingrese cualquier numero"
		Leer num1
		Para x<-1 Hasta num1 Hacer
			factorial<-factorial*x
		Fin Para
		Escribir "El factorial del numero " ,num1, " es: ", factorial
	Hasta Que num1<0
FinAlgoritmo
