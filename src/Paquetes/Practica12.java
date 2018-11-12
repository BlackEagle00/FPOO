package Paquetes;
import java.awt.*;
import java.util.StringTokenizer;

public class Practica12 
{
	public static void ConfigurarPunto() 
	{
        Point localizacion = new Point(4, 13);
        System.out.println("Empezar localización:");
        System.out.println("X igual a " + localizacion.x);
        System.out.println("Y igual a " + localizacion.y);

        System.out.println("\nMoviéndolo a (7, 6)");
        localizacion.x = 7;
        localizacion.y = 6;

        System.out.println("\nLocalización final:");
        System.out.println("X igual a " + localizacion.x);
        System.out.println("Y igual a " + localizacion.y);
    }
	
	public static void ProbarToken() 
	{
        StringTokenizer st1 , st2;
        String cita1 = " TEXTO 6 -3/4" ;
        st1 = new StringTokenizer(cita1 );
        System. out. println( "Token 1 : " +st1.nextToken());
        System. out. println( "Token 2: " + st1.nextToken());
        System. out. println( "Token 3: " + st1.nextToken());
        
        String cita2 = " DSGR@9 32/ 25@2/17";
        st2 = new StringTokenizer(cita2, "@");
        System. out. println( "\nToken 1: " + st2.nextToken());
        System. out. println( "Token 2: " + st2.nextToken());
        System. out. println( "Token 3: " + st2.nextToken());
     }
	
	public static void ProbarToken2() 
	{
        StringTokenizer st1 , st2;
        String cita = " DSGR@9 32/ 25@2/17";
        st1 = new StringTokenizer(cita );
        System. out. println( "Token 1 : " +st1.nextToken() ) ;
        System. out. println( "Token 2: " + st1.nextToken() ) ;
        System. out. println( "Token 3: " + st1.nextToken() ) ;
        
        
        st2 = new StringTokenizer(cita, "@");
        System. out. println( "\nToken 1: " + st2.nextToken() ) ;
        System. out. println( "Token 2: " + st2.nextToken() ) ;
        System. out. println( "Token 3: " + st2.nextToken() ) ;
     }
	
	public static void RevisorStrings() 
	{
        String str = "La estupidez insiste siempre";
        System.out.println( "El string es: " + str);
        System.out.println( "Tamaño de este string: " + str.length( ));
        System.out.println( "El carácter en la posición 5: " + str.charAt(5) );
        System.out.println( "El substring de 3 a 12: " + str.substring(3, 12));
        System.out.println( "El index del carácter z: " + str.indexOf('z' ));
        System.out.println( "El index del inicio del " + "substring \" siempre\": " + str.indexOf( "siempre") );
        System.out.println( "El string en mayúsculas: " + str.toUpperCase() ) ; 
     }
}