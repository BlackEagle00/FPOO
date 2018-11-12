package Paquetes;
import java.util.*;
import java.io.File;
import static java.lang.System.out;

public class Practica8
{
	public static void AnidarLoops() 
	{
        int points = 0;
        int target = 100;
        while (target <= 100)
        {
            for (int i = 0; i < target; i++) 
            {
                if (points > 50) 
                {
					System.out.println("Saliendo del loop for");
					break;
                }
                points = points + i;
            }
        }
    }
	
	public static void ComplejidadLoops() 
	{
        int i, j;
        for ( i = 0, j = 0; i * j < 1000; i++, j += 2) 
        {
            System.out.println(i + " * " + j + " = " + (i * j ));
        }
    }
	
	public static void Contador() 
	{
		for ( int contador = 1; contador <= 10; contador++) 
		{
			out.print("El valor del contador es:");
			out.print(contador) ;
			out.println( " . ") ;
		}
		System.out.println(" ¡Hecho! ") ;
	}
	
	public static void ContinueLoop() 
	{
        int index = 0;
        while (index <= 1000) 
        {
            index = index + 5;
            if (index == 400)
				continue;
            System. out. println(" El index es " + index);
        }
    }
	
	public static void Juego() 
	{
        Scanner miScanner = new Scanner( System.in);
        int numIntentos = 0;
        int numAleatorio = new Random().nextInt(10) + 1;
        out.println("       ******* *****         " ) ;
        out.println(" Bienvenido al juego \"¡¡Acierta el Número!!\"");
        out.println("       ******* *****         " );
        out.println() ;
        out.print( "Escribe un número del 1 al 10: ");
        int numeroEscrito = miScanner.nextInt() ;
        numIntentos++;
        while (numeroEscrito != numAleatorio) 
        {
            out.println( ) ;
            out.println( " Inténtalo de nuevo. . . ");
            out.print(" Escribe un número del 1 al 10: " );
            numeroEscrito = miScanner.nextInt();
            numIntentos++;
        }
        out.print( "Has Ganado después de " );
        out.println(numIntentos + " intentos. " );
    }
	
	public static void LoopDo() 
	{
        File archivo = new File("c:\\miArchivo.txt" );
        Scanner miScanner = new Scanner (System.in);
        char replica;
        do 
        {
            out. print("¿Borrar archivo? (s/n) " );
			replica = miScanner.findWithinHorizon( ".",0).charAt(0); 
			out.print(replica);
		}
        while(replica != 's' && replica != 'n' );
        
		if ( replica == 's' ) 
		{
            out.println( "De acuerdo, borrando archivo. . . ");
            archivo.delete() ; 
        }
        else 
        {
            out. println( "De acuerdo, confirmado no borrar. ");
        }
    }
	
	public static void LoopDo2() 
	{
        File archivo = new File("c:\\miArchivo.txt" );
        Scanner miScanner = new Scanner (System.in);
        char replica;
        do
        {
            out.print("¿Borrar archivo? (s/ n) " );
			replica = miScanner.findWithinHorizon( "." , 0) . charAt( 0) ; 
		}
        while (replica != 's' && replica != 'n' && replica != 'S' && replica != 'N' );
        
		if ( replica == 's' || replica == 'S'  )
		{
            out. println( "De acuerdo, borrando archivo. . . ");
            archivo.delete() ; 
		}
		else
		{
			out.println( "De acuerdo, confirmado no borrar. ");
        }
    }
	
	public static void MedirVelocidad() 
	{
        Calendar start = Calendar.getInstance();
        int startMinute = start.get(Calendar.MINUTE);
        int startSecond = start.get(Calendar.SECOND);
        start.roll(Calendar.MINUTE, true);
        int nextMinute = start.get(Calendar.MINUTE);
        int nextSecond = start.get(Calendar.SECOND);
        int index = 0;
        while ( true) 
        {
            double x = Math.sqrt(index);
            GregorianCalendar now = new GregorianCalendar();
            if (now.get(Calendar.MINUTE) >= nextMinute) 
            {
                if ( now.get(Calendar.SECOND) >= nextSecond) 
                {
                    break;
                }
            }
            index++;
        }
        System. out.println(index + " loops en un minuto." ) ;
    }
	
	public static void Multiplo()
	{
		int multiplo;
        for (int x = 1; x <= 200; x++)
        {
            multiplo = 7 * x;
            out.print(multiplo + " ");
        }
    }
	
	public static void NombrarLoops() 
	{
        int points = 0;
        int target = 100;
        targetLoop:
        while (target <= 100) 
        {
            for (int i = 0; i < target; i++) 
            {
                if (points > 50)
                {
                    System.out.println("points = "+ points);
                    System.out.println("Saliendo de los dos loops");
                    break targetLoop;
				}
			points = points + i;
			}
		}
	}

	public static void SalirLoop() 
	{
        int index = 0;
        while (index <= 1000) 
        {
            index = index + 5;
            System.out. println(index);
            if (index == 400)
            {
                System.out. println( "index = 400. Saliendo.... ");
                break;
            }
        }
    }
}
