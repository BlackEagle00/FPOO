public class practica6
{
	public static caracteres_epeciales() 
	{
      System.out.println("La mejor canci\u00f3n de Victor Jara es\n\"Te Recuerdo Amanda\"");
    }

	public static String Case() 
	{
		String nombre = "Pedro Gonz\u00e1lez";
		String minusculas= nombre.toLowerCase();
		String mayusculas= nombre.toUpperCase();
		System.out.println(minusculas);
		System.out.println(mayusculas);
    }

	public static String concatenacion() 
	{
		System.out.println( " \"\'Descubrir\' El verdadero viaje de descubrimiento consiste" +" no en encontrar nuevas tierras, sino verlas con nuevos ojos. \"\n\t-- Marcel Proust, Citas");
    }

	public static int concatenacion_variable() 
	{
		int numero = 143 ;
		char valor = 'M' ;
		System. out. println( "Hubo un total de: " + numero + " participantes");
		System. out. println( "Promedio " + valor);
    }

    public static String equals(String[ ] args) 
	{
		String respuesta = "amarillo";
		String resultado = "amarillo";
		System. out. println( "Â¿ Has respondido que el color es " + resultado + "?");
		System. out. println( "Respuesta: " + respuesta.equals(resultado));
    }

	public static int indexOf() 
	{
		String texto = "SeguÃ­ale Sancho a todo trote de su jumento; pero caminaba tanto Rocinante," +
		"que, viÃ©ndose quedar atrÃ¡s, le fue forzoso dar voces a su amo, que se aguardase.";
		int busca = texto.indexOf("Sancho");
		System.out.println(busca);
    }

	public static int length() 
	{
		String respuesta = "amarillo";
		String resultado = "amarillo";
		System.out.println( "Â¿ Has respondido que el color es " + resultado + "?");
		System.out.println( "Respuesta: " + respuesta.equals(resultado));
		int tam = respuesta.length();
		System.out.println(tam);
    }

	public static String mostrar_string() 
	{
		System.out.print("El ");
		System.out.print("Solsticio ");
		System.out.print("de ");
		System.out.print("invierno ");
		System.out.print("es ");
		System.out.print("en ");
		System.out.print("Diciembre en el Hemisferio Norte.");
    }

	public static String palabrasClave() 
	{
        String palabrasClave = "";
        palabrasClave = palabrasClave + "videotutoriales ";
        palabrasClave = palabrasClave + "flash " ;
        palabrasClave = palabrasClave + "php ";
        System.out.println(palabrasClave);
    }

	public static String palabrasClave2() 
	{
        String palabrasClave = "";
        palabrasClave += "videotutoriales ";
        palabrasClave += "flash " ;
        palabrasClave += "php ";
        System.out.println(palabrasClave);
    }
}