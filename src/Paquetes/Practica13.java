package Paquetes;
import java.awt.*;
import java.io.*;

public class Practica13 
{
	public static void CastingVariables()
	{
        double x = 56.01;
        float y = (float)(2 * x);
        System.out.println(y);

        double temp1 = 3.4 * y;
        int temp2 = (int)(temp1);
        System.out.println(temp2);
     }
	
	public static void ProbarReferencias() 
	{
	     Point pt1, pt2;
	     pt1 = new Point(100, 100);
	     pt2 = pt1;
	     pt1.x = 200;
	     pt1.y = 200;
	     System.out.println("Point1: " + pt1.x + ", " + pt1.y);
	     System.out.println("Point2: " + pt2.x + ", " + pt2.y);
	 }
	
	public static void RaizNuevo(String [] args)
	{
        int numero = 100;
        if (args.length > 0) 
        {
            numero = Integer.parseInt(args[0]);
        }
        System. out.println("La raíz cuadrada de " + numero + " es "+ Math.sqrt(numero));
    }
	
	public static void RaizNuevo2() throws IOException
	{
	    BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribe un número:");
        String str = buff.readLine();
        int conversion = Integer.parseInt(str );
        System. out.println("La raíz cuadrada de "+ conversion+ " es "+ Math.sqrt(conversion) );
    }
}