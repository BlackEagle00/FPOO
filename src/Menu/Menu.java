package Menu;
import Paquetes.*;

import java.io.IOException;
import java.util.Scanner;

public class Menu 
{
	static Scanner sc = new Scanner (System.in);
	public static void Menu_Practica5() 
	{
		System.out.println("Ingrese el número del ejercicio a ver");
        int ejer5 = sc.nextInt();
        switch (ejer5)
        {
            case 1:
                Practica5.incremento();
                break;
            case 2:
                Practica5.operacion();
                break;
            case 3:
                Practica5.operadores();
                break; 
            case 4:
            	Practica5.pesoplaneta();
				break;
			case 5:
				Practica5.prioridad1();
				break;
			case 6:
				Practica5.prioridad2();
				break;
			case 7:
				Practica5.prioridad3();
				break;
			case 8:
				Practica5.tiempo();
				break;
        }
	}
	
	public static void Menu_Practica6() 
	{
		System.out.println("Ingrese el número del ejercicio a ver");
        int ejer6 = sc.nextInt();
        switch (ejer6)
        {
            case 1:
                Practica6.caracteres_epeciales();
                break;
            case 2:
            	Practica6.Case();
            	break;
            case 3:
                Practica6.concatenacion();
                break;
            case 4:
                Practica6.concatenacion_variable();
                break; 
            case 5:
            	Practica6.equals();
				break;
			case 6:
				Practica6.indexOf();
				break;
			case 7:
				Practica6.length();
				break;
			case 8:
				Practica6.mostrar_string();
				break;
			case 9:
				Practica6.palabrasClave();
				break;
			case 10: 
				Practica6.palabrasClave2();
				break;
        }
	}
	
	public static void Menu_Practica7() 
	{
		System.out.println("Ingrese el número del ejercicio a ver");
        int ejer7 = sc.nextInt();
        switch (ejer7)
        {
            case 1:
                Practica7.elseif();
                break;
            case 2:
            	Practica7.If();
            	break;
            case 3:
                Practica7.ifbloque();
                break;
            case 4:
                Practica7.if2();
                break; 
            case 5:
            	Practica7.ifelse();
				break;
			case 6:
				Practica7.ifstring();
				break;
        }
	}
	
	public static void Menu_Practica8() 
	{
		System.out.println("Ingrese el número del ejercicio a ver");
        int ejer8 = sc.nextInt();
        switch (ejer8)
        {
            case 1:
                Practica8.AnidarLoops();
                break;
            case 2:
                Practica8.ComplejidadLoops();
                break;
            case 3:
                Practica8.Contador();
                break; 
            case 4:
            	Practica8.ContinueLoop();
				break;
			case 5:
				Practica8.Juego();
				break;
			case 6:
				Practica8.LoopDo();
				break;
			case 7:
				Practica8.LoopDo2();
				break;
			case 8:
				Practica8.MedirVelocidad();
				break;
			case 9:
				Practica8.Multiplo();
				break;
			case 10:
				Practica8.NombrarLoops();
				break;
			case 11:
				Practica8.SalirLoop();
				break;
        }
	}
	
	public static void Menu_Practica9() 
	{
		System.out.println("Ingrese el número del ejercicio a ver");
        int ejer9 = sc.nextInt();
        switch (ejer9)
        {
            case 1:
                Practica9.EliminarEspacio();
                break;
            case 2:
                Practica9.Length();
                break;
            case 3:
                Practica9.Nombre();
                break; 
            case 4:
            	Practica9.Rueda();
				break;
        }
	}
	
	public static void Menu_Practica10() 
	{
		Practica10.Dante();
	}
	
	public static void Menu_Practica12() 
	{
		System.out.println("Ingrese el número del ejercicio a ver");
        int ejer12 = sc.nextInt();
        switch (ejer12)
        {
            case 1:
                Practica12.ConfigurarPunto();
                break;
            case 2:
                Practica12.ProbarToken();
                break;
            case 3:
                Practica12.ProbarToken2();
                break; 
            case 4:
            	Practica12.RevisorStrings();
				break;
        }
	}
	
	public static void Menu_Practica13() throws IOException 
	{
		System.out.println("Ingrese el número del ejercicio a ver");
        int ejer13 = sc.nextInt();
        switch (ejer13)
        {
            case 1:
                Practica13.CastingVariables();
                break;
            case 2:
                Practica13.ProbarReferencias();
                break;
            case 3:
                Practica13.RaizNuevo(null);
                break; 
            case 4:
            	Practica13.RaizNuevo2();
				break;
        }
	}
	
	public static void Menu_Practica14() 
	{
		System.out.println("Ingrese el número del ejercicio a ver");
        int ejer14 = sc.nextInt();
        switch (ejer14)
        {
            case 1:
                Practica14.ComprobarScope();
                break;
            case 2:
                Practica14.ListarRango();
                break;
        }
	}
	
	public static void Menu_Practica15() 
	{
		System.out.println("Ingrese el número del ejercicio a ver");
        int ejer15 = sc.nextInt();
        switch (ejer15)
        {
            case 1:
                Practica15.Caja();
                break;
            case 2:
                Practica15.Convertidor();
                break;
            case 3:
                Practica15.Promedio(null);
                break;
        }
	}
	
	public static void Menu_Practica18() 
	{
		Practica18.ConstantesCortas();
	}
}