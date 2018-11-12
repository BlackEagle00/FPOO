package Paquetes;

public class Practica17 
{
	public class ContadorInstancias 
	{
	     private static int numInstancias = 0;

	     protected int getCuenta() 
	     {
	         return numInstancias;
	     }

	     private void addInstancia()
	     {
	         numInstancias++;
	     }

	     ContadorInstancias() 
	     {
	         ContadorInstancias.addInstancia();
	     }

	     public static void main(String[ ] arguments) 
	     {
	         System.out.println( "Empezamos con " + ContadorInstancias. getCuenta() + " instancias");
	         for (int i = 0; i < 500; ++i)
	             new ContadorInstancias();
	         System.out.println( "Creadas " + ContadorInstancias.getCuenta() + " instancias");
	     }
	 }
	
	class Logger
	{
		private String formato;
	  
		public String getFormat() 
		{
			return this.formato;
		}
	  
		public void setFormat(String formato)
		{
			if (( formato.equals("admin")) || (formato.equals("OutKast")))
			{
				this.formato = formato;
			}
		}
	}
}
