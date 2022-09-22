Funcion Salariopredeterminado <- Calcularsalarioordinario (horas , dias , salario)
	Salariopredeterminado<-horas*dias*salario
	
Fin Funcion

Funcion Salariohorasextras <- Calcularsalarioconhorasextras ( salario )
	salario<-horas*dias*100
Fin funcion


Algoritmo Nomina
	Escribir "Desarrolla un algoritmo que calcule la nomina de un trabjador"
	horas<-0
	dias<-0
	salario<-0
	horasextras<-0
	horassabado<-0
	horasdomingo<-0
	
	Escribir "Ingrese el numero de horas"
	Leer horas
	Escribir "Ingrese el numero de días trabajados"
	Leer dias
	Escribir "Ingrese el salario por hora"
	Leer salario
	Escribir "Ingrese el numero de horas extras"
	Leer horasextras
	Escribir "Ingrese el numero de horas extras que trabajo el dia Sabado"
	Leer horassabado
	Escribir "Ingrese el numero de horas extras que trabajo el dia Domingo"
	Leer horasdomingo
	
	
	Si dias <= 15 y horas <= 23 Entonces
		Escribir "El salario  comun que recibirá a la quincena sera: " , Calcularsalarioordinario(horas , dias , salario)
	SiNo
		Escribir "El salario se reincia cada quince días, espera a la segunda quincena"
	Fin si
		
	Si horasextras > 0 Entonces
		salarioextra<-0
		salarioextra= Calcularsalarioordinario (horas , dias, salario) + (horasextras*200)
		Escribir "El salario total con las horas extras que recibirá en la quincena sera: " , salarioextra
	SiNo 
		Escribir "Su salario es de: ", Calcularsalarioordinario(horas , dias , salario)
		Escribir "No recibirá pago de las horas extra"
	Fin si	
			
	Si horassabado > 0 y horasextras==0 Entonces
		salarioextrasab<-0
		salarioextrasab= Calcularsalarioordinario(horas , dias , salario) + (horassabado*200)
		Escribir "El salario total con las horas extras del dia sabado que recibirá en la quincena sera: " , salarioextrasab
	SiNo
		Si horassabado > 0 y horasextras > 0 Entonces
			salarioextrasab<-0
			salarioextrasab= Calcularsalarioordinario(horas , dias , salario ) + (horassabado*200) + (horasextras*200) 
			Escribir "El salario total con las horas extras del dia sabado y las horas extras que recibirá en la quincena sera: ",salarioextrasab
		Fin si
		Si horassabado ==0 y horasextras > 0 Entonces
				salarioextrasab<-0
				salarioextrasab = Calcularsalarioordinario (horas , dias , salario ) + (horasextras*200) 
				Escribir "El salario total sin las horas extras del dia sabado y las horas extras que recibirá en la quincena sera: " , salarioextrasab
		Fin Si
		Si horasextras ==0 y horassabado ==0 Entonces
			Escribir "Su salario  es de: ", Calcularsalarioordinario(horas , dias , salario)
			Escribir "No recibirá pago por las horas extras del dia Sabado"
		FinSi
	Fin si
	
	Si horasdomingo > 0 Entonces
		salarioextradom<-0
		salarioextradom= Calcularsalarioordinario(horas , dias , salario)+ (horasdomingo*300)
		Escribir "El salario total con las horas extras del dia Domningo que recibirá en la quincena sera: " , salarioextradom
	SiNo
		Escribir "Su salario es de: " , Calcularsalarioordinario(horas , dias , salario)
		Escribir "No recibirá un extra por las horas del dia Domingo"
	Fin Si
	
	
	
FinAlgoritmo
