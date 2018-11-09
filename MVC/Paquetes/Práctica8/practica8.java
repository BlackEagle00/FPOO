public class practica8
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
					System.out.println ("Saliendo del loop for");
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
            System. out. println(i + " * " + j + " = " + (i * j ));
        }
    }
	
	public static void contador() 
	{
		for ( int contador = 1; contador <= 10; contador++) 
		{
			System.out.print("El valor del contador es:  ");
			System.out.print(contador);
			System.out.println( " . ");
		}
		System.out.println(" ¡Hecho! ");
	}
}