package Paquetes;
import java.awt.Point;

public class Practica15 
{
	public static void Caja() 
	{
		
		class Caja 
		{
			int x1 = 0;
		    int y1 = 0;
		    int x2 = 0;
		    int y2 = 0;

	     Caja construirCaja(int x1 , int y1 , int x2, int y2)
	     {
	         this.x1 = x1;
	         this.y1 = y1;
	         this.x2 = x2;
	         this.y2 = y2;
	         return this;
	     }

	     Caja construirCaja(Point supIzq, Point infDer) 
	     {
	         x1 = supIzq.x;
	         y1 = supIzq.y;
	         x2 = infDer.x;
	         y2 = infDer.y;
	         return this;
	     }

	     Caja construirCaja(Point supIzq, int an, int al) 
	     {
	         x1 = supIzq. x;
	         y1 = supIzq. y;
	         x2 = (x1 + an) ;
	         y2 = (y1 + al) ;
	         return this;
	     }

	     void imprimirCaja() 
	     {
	         System. out. print( "Caja: <" + x1 + " , " + y1 );
	         System. out. println( ", " + x2 + " , " + y2 + " >" );
	     }

	     public void main(String[] arguments) 
	     {
	         Caja rect = new Caja( );

	         System. out. println( "Llamando a construirCaja con coordenadas "
	             + "(25, 25) and (50, 50) :");
	         rect.construirCaja(25, 25, 50, 50);
	         rect.imprimirCaja();

	         System. out. println( "\nLlamando a construirCaja con puntos "
	             + "(10, 10) and (20, 20) :");
	         rect.construirCaja(new Point(10, 10), new Point(20, 20) ) ;
	         rect.imprimirCaja() ;

	         System. out. println( "\nLlamando a construirCaja con 1 punto "
	             + "(10, 10), ancho 50 and alto 50:" );

	         rect. construirCaja(new Point(10, 10), 50, 50) ;
	         rect. imprimirCaja() ;
	    }
		}
	}
	
	public static void Convertidor ()
	{
		class Convertidor 
		{
			   void aMayusculas(String[] texto) 
			   {
			         for (int i = 0; i < texto.length; i++) 
			         {
			            texto[i] = texto[i].toUpperCase();
			         }
			   }
			   public void main(String[] argumentos) 
			   {
			         Convertidor convertidor = new Convertidor();
			         convertidor.aMayusculas(argumentos);
			         for (int i = 0; i < argumentos. length; i++)
			         {
			             System.out.print( argumentos[i] + " ");
			         }
			   }
		 }
	 }
	
     public static void Promedio(String [] arguments) 
     {
         int sum = 2;

         if (arguments.length > 0) {
             for (int i = 0; i < arguments.length; i++) 
             {
                 sum += Integer.parseInt(arguments[ i] );
             }
             System.out.println( "Suma es: " + sum) ;
             System.out.println( "Promedio es: " + (float) sum / arguments.length);
         }
     }
}
