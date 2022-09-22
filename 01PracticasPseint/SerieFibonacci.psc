Algoritmo SerieFibonacci
	Escribir "Ingrese el término que desea obtener de la serie: "
	Leer numf
	x<-0
	z<-1
	Para i<-1 Hasta numf Hacer
		Escribir x
		n<-x+z
		x<-z
		z<-n
	Fin Para
FinAlgoritmo
