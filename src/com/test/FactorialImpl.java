package com.test;

import javax.management.RuntimeErrorException;

public class FactorialImpl implements IFactorial {

	@Override
	public long calcular(int numero) {
		
		if (numero > 0) {
			return (calcular(numero-1)*numero);
		} else if (numero == 0){ 
			return 1;
		} else {
			throw new RuntimeException("metiste un negativo!!");
		}	
	}	
}
