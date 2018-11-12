package Paquetes;
import java.util.*;

public class Practica9 
{
	public static void EliminarEspacio() 
	{
        String citaDiaria = "La educación consiste en enseñar a los hombres no lo que deben pensar sino a pensar.";
        char[] convertir = citaDiaria.toCharArray();
        for (int dex = 0; dex < convertir.length; dex++) 
		{
            char current = convertir[dex];
            if (current != ' ') 
			{
                System.out.print(current);
            }else 
			{
                System.out.print('.');
            }
        }
    }
	
	public static void Length()
	{
		String [ ] marcasImpresoras = { "Brother", " Canon", " Dell", "Epson", "HP" , "Lexmark" , "Olivetti", " Samsung"};
		System.out.println ("Hay " +marcasImpresoras.length + " marcas de impresoras.");
	}
	
	public static void Nombre()
	{
        String nombres[] = { "Miguel" , "María", "Alberto", "Fernando",
            "Alejandro", "Rosa" , "Evaristo", "Bernardo", "Francisco" ,
            "Homero", "Cristina" , "Carla", "César"};
        System. out.println("El orden original:");
        for (int i = 0; i < nombres.length; i++) 
        {
            System.out.print( i + " : " + nombres[i] + " ");
        }
        Arrays.sort(nombres);
        System. out.println("\nEl nuevo orden: ");
        for (int i = 0; i < nombres. length; i++) 
        {
            System.out.print( i + " : " + nombres[i] + " " );
        }
        System. out.println();
    }
	
	public static void Rueda() 
	{
        String frase[] = 
        	{
           "TODA CUESTION TIENE DOS PUNTOS DE VISTA",
            "EL EQUIVOCADO Y EL NUESTRO" ,
            "TODAS LAS MUJERES TIENEN ALGO HERMOSO",
            "AUNQUE SEA UNA PRIMA LEJANA",
            "SE ESTA MURIENDO GENTE QUE ANTES NO SE MORIA",
            "HE OIDO HABLAR TAN BIEN DE TI",
            "QUE CREIA QUE ESTABAS MUERTO",
            "RECUERDA SIEMPRE QUE ERES UNICO",
            "EXACTAMENTE IGUAL QUE TODOS LOS DEMAS" ,
            "TODO TIEMPO PASADO FUE ANTERIOR." ,
            "LOS HONESTOS SON INADAPTADOS SOCIALES",
            "LA VERDAD ABSOLUTA NO EXISTE" ,
            "Y ESTO ES ABSOLUTAMENTE CIERTO",
            "LO TRISTE NO ES IR AL CEMENTERIO, SINO QUEDARSE",
            "EL AMOR ETERNO DURA APROXIMADAMENTE TRES MESES"
        	};
        
        int[ ] contadorLetras = new int[26];
        for (int contador = 0; contador< frase.length; contador++) 
        {
            String actual = frase[contador];
            char[] letras = actual.toCharArray();
            for (int contador2 = 0;  contador2 < letras.length; contador2++) 
            {
                char let = letras[contador2];
                if ((let >= 'A' ) & (let <= 'Z'))
                {
                    contadorLetras[let - 'A' ]++;
                }
            }
        }
        for (char contador = 'A' ; contador <='Z'; contador++) 
        {
            System.out.print( contador + ":" + contadorLetras[contador - 'A' ] +" ") ;
        }
        System. out.println();
    }
}
