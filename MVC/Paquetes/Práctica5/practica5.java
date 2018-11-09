public class practica5
{
	public static int incremento() 
	{
      int x=3;
      int valor = ++x * 10;
        System. out.println(valor);
        System.out.println(x);
    }
	
    public static int operacion() 
	{
		int numero = 317;
		System. out.println("La raÃ­z cuadrada de "+ numero+ " es "+ Math.sqrt(numero));
	}
	
    public static int operadores() 
	{
		int puntuacion=12;
		int total = (325+puntuacion)*22;
        System. out.println(total);
	}
	
	public static double pesoplaneta() 
	{
		System.out.print("Tu peso en la Tierra es de ");
		double peso = 72;
		System.out.println(peso);

		System.out.print("Tu peso en Mercurio es de ") ;
		double mercurio = peso * .378;
		System.out.println (mercurio) ;

		System. out.print( "Tu peso en la luna es de " );
		double luna = peso * .166;
		System. out.println(luna);

		System. out.print( "Tu peso en JÃºpiter es de ") ;
		double jupiter = peso * 2.364;
		System. out.println(jupiter) ;
	}
	
	public static int prioridad1() 
	{
		int y=21;
		int x = y*3+5;
        System.out.println(x);
    }
	
	public static int prioridad2() 
	{
		int x=7;
		int z = x++ * 6 + 4 * 10 / 2;
        System.out.println(z);
        System.out.println(x);
    }

	public static int prioridad3(String[ ] args) 
	{
		int y=21;
		int x = y*(3+5) ;
        System.out.println(x);
    }

	
    public static float tiempo() 
	{
        float fah = 86;
        System. out. println( fah + " grados Fahrenheit son . . .");
        // Para convertir de Fahrenheit a Celsius
        // Empezamos por restar 32
        fah = fah - 32;
        // Dividimos el resultado por 9
        fah = fah / 9;
        // Multiplicamos el resultado por 5
        fah = fah * 5;
        System. out.println(fah + " grados Celsius\n");
        float cel = 33;
        System. out.println(cel + " grados Celsius son . . . ") ;
        // Para convertir de Fahrenheit a Celsius
        // Empezamos por restar 9
        cel = cel * 9;
        // Dividimos el resultado por 5
        cel = cel / 5;
        // AÃ±adimos 32 al resultado
        cel = cel + 32;
        System. out.println(cel + " grados Fahrenheit") ;
    }
}
