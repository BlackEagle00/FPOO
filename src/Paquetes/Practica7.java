package Paquetes;
public class Practica7
{
	public static void elseif() 
	{
        int puntuacion = 3;
        char grupo ='C';
        if (puntuacion >= 5) {
           System.out.println("Â¡Enhorabuena, has aprobado! ");
           System.out.println("Tu nota final es: " + puntuacion);
           grupo = 'A';
        }
        else { 
           System.out.println("Â¡Lo Siento, has suspendido! ");
           System.out.println("Tu nota final es: " + puntuacion);
           grupo = 'B';
        
        }

        System.out.println("Formas parte del Grupo: "+ grupo);
    }

	public static void If() 
	{
        int puntuacion=9;
		if (puntuacion != 5) System. out. println("Â¡Tienes un aprobado raspado!" ) ;
	}

	public static void ifbloque() 
	{
        int puntuacion = 7;
        char grupo ='C';
        if (puntuacion >= 5) 
		{
           System.out.println("Â¡Enhorabuena, has aprobado! ");
           System.out.println("Tu nota final es: " + puntuacion);
           grupo = 'A';
        }
        System.out.println("Formas parte del Grupo: "+ grupo);
    }

	public static void if2() 
	{
        int puntuacion = 2;
        if (puntuacion == 7) 
		{
           System.out.println("Â¡Tienes un notable! ");
        }
        if (puntuacion == 3) 
		{
           System.out.println("Â¡Tienes un insuficiente ! ");
        }
        System. out.println("Nota final: " + puntuacion);
    }

	public static void ifelse() 
	{
        int puntuacion = 3;
        char grupo ='C';
        if (puntuacion >= 5) 
		{
           System.out.println("Â¡Enhorabuena, has aprobado! ");
           System.out.println("Tu nota final es: " + puntuacion);
           grupo = 'A';
        }
        else 
		{ 
           System.out.println("Â¡Lo Siento, has suspendido! ");
           System.out.println("Tu nota final es: " + puntuacion);
           grupo = 'B';
        }
		System.out.println("Formas parte del Grupo: "+ grupo);
    }

	public static void ifstring() 
	{
        String puntuacion="nueve";
		if (puntuacion == "nueve") 
		{
			System. out. println("Â¡Enhorabuena, sobresaliente!" ) ;
		}
	}
}