package aula36;

// Classes Wrappers java leng
public class Principal {

	public static void main(String[] args) {
		
		//int x = 10;
		
		Integer i = new Integer(10);
		
		/*
		 * Tipos Primitivos - Classes Wrappers
		 * 
		 * byte - Byte
		 * short Short
		 * int - Integer
		 * long - Long
		 * float - Float
		 * double Double
		 * char - Character*/
		
		//byte n = (byte)x; //converte x=10 em byte... Modo antigo!!!! Usar abaixo...
		
		byte b = i.byteValue(); //conversão nova, converteu para byte
		
		double d = i.doubleValue(); // converteu para double
		
		System.out.println("Byte: " + b);
		System.out.println("Double: " + d);
		
		
		
		
		
		
		
		
		

	}

}
