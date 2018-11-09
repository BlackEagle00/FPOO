package mvc.fpoo;
import java.util.Scanner;
import Paquetes.*;
public class main
{
	public static void main (String [] args)
	{
		Practica5 Obj5 = new Practica5();
                Practica6 Obj6 = new Practica6();
                Practica7 Obj7 = new Practica7();
                Practica8 Obj8 = new Practica8();
                Practica9 Obj9 = new Practica9();
                Practica10 Obj10 = new Practica10();
                Practica11 Obj11 = new Practica11();
                Practica12 Obj12 = new Practica12();
                Practica13 Obj13 = new Practica13();
                Practica14 Obj14 = new Practica14();
                Practica15 Obj15 = new Practica15();
                Practica16 Obj16 = new Practica16();
                Practica17 Obj17 = new Practica17();
                Practica18 Obj18 = new Practica18();
                Practica19 Obj19 = new Practica19();
                Practica20 Obj20 = new Practica20();
                Practica21 Obj21 = new Practica21();

		Scanner sc = new Scanner (System.in);
		System.out.println("Bienvenido, ingrese el número del paquete que desea ver, de 5 a 21");
		int n = sc.nextInt();
		switch (n) 
		{
			case 5:
                            System.out.println("Ingrese el número del ejercicio a ver");
                            int ejer = sc.nextInt();
                            switch (ejer)
                            {
                                case 1:
                                    Obj5.incremento();
                                    break;
                                case 2:
                                    Obj5.operacion();
                                    break;
                                case 3:
                                    Obj5.operadores();
                                    break;    
                            }
                break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			case 10:
				break;
			case 11:
				break;
			case 12:
				break;
			case 13:
				break;
			case 14:
				break;
			case 15:
				break;
			case 16:
				break;
			case 17:
				break;
			case 18:
				break;
			case 19:
				break;
			case 20:
				break;
			case 21:
				break;
		}
	}
}