package com.test;

import javax.management.RuntimeErrorException;

public class FactorialRecursive implements IFactorial {
	
	@Override
	public long calcular(int numero) {
		System.out.println("Estas utilizando la implementacion Recursiva!!");
		return calcularRecur(numero);
	}
	
	
	private long calcularRecur(int numero) {
		
		if (numero > 0) {
			return (calcularRecur(numero-1)*numero);
		} else if (numero == 0){ 
			return 1;
		} else {
			throw new RuntimeException("metiste un negativo!!");
		}	
	}
}
