Algoritmo Resistencia
	i <- 1
	result <- 0
	nroResis <- 3
	Mientras i<=nroResis Hacer
		Escribir 'Ingrese Resistencia: ',i
		Leer r
		result <- result+1/r
		i <- i+1
	FinMientras
	Escribir 'La resistencia total es de ',1/result
FinAlgoritmo
