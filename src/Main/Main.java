package Main;
import java.util.Scanner;
import Paquetes.*;
import Menu.*;
public class Main
{
	static Scanner sc = new Scanner (System.in);
	public static void main (String [] args)
	{
		System.out.println("Bienvenido, ingrese el número del paquete que desea ver, de 5 a 21");
		int n = sc.nextInt();
		switch (n) 
		{
			case 5:
				Menu.Menu_Practica5();
                break;
			case 6:
				Menu.Menu_Practica6();
				break;
			case 7:
				Menu.Menu_Practica7();
				break;
			case 8:
				Menu.Menu_Practica8();
				break;
			case 9:
				Menu.Menu_Practica9();
				break;
			case 10:
				Menu.Menu_Practica10();
				break;
			case 11:
				Menu.Menu_Practica11();
				break;
			case 12:
				Menu.Menu_Practica12();
				break;
			case 13:
				Menu.Menu_Practica13();
				break;
			case 14:
				Menu.Menu_Practica14();
				break;
			case 15:
				Menu.Menu_Practica15();
				break;
			case 16:
				Menu.Menu_Practica16();
				break;
			case 17:
				Menu.Menu_Practica17();
				break;
			case 18:
				Menu.Menu_Practica18();
				break;
			case 19:
				Menu.Menu_Practica19();
				break;
			case 20:
				Menu.Menu_Practica20();
				break;
			case 21:
				Menu.Menu_Practica21();
				break;
		}
	}
}