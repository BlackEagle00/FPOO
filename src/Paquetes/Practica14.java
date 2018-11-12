package Paquetes;

public class Practica14 
{
	public class ComprobarScope 
	{
	    int test = 10;
		void imprimirTest() 
		{
			int test = 20;
			System.out.println("Test: " + this.test);
		}
	    	public void main(String[ ] arguments) 
	    	{
	    		ComprobarScope st = new ComprobarScope( ) ;
	    		st.imprimirTest();
	    	}
	}

	public class ListarRango 
	{
	     int[ ] crearRango(int inferior, int superior) 
	     {
	         int[] rango = new int[( superior-inferior) + 1];
	         for (int i = 0; i < rango.length; i++) 
	         {
	             rango[i] = inferior++;
	         }
	         return rango;
	     }

	     public void main() 
	     {
	         int[] rango;
	         ListarRango listar = new ListarRango() ;

	         rango = listar.crearRango( 100, 113);
	         System.out.print( "El array: [ " );
	         for (int i = 0; i < rango.length; i++) 
	         {
	             System. out. print( rango[ i] + " ");
	         }
	         System. out. println( "] ");
	     }
	 }
}
