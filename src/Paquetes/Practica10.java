package Paquetes;

public class Practica10
{
	public static void Dante()
	{
		class DanteRobot
		{
			String estatus;
			int velocidad;
			float temperatura;
		
			void comprobarTemperatura() {
				if (temperatura > 660) {
					estatus = "Volviendo a Casa";
					velocidad = 5;
				}
			}
		
			void mostrarAtributos() {
				System.out.println("Estatus: " + estatus);
				System.out.println("Velocidad: " + velocidad);
				System.out.println("Temperatura: " + temperatura);
			}
		public void Dante() 
		{
			DanteRobot dante = new DanteRobot();  // 
		    dante.estatus = "explorando";
		    dante.velocidad = 2;
		    dante.temperatura = 510;
		    dante.mostrarAtributos();
		    System.out.println("Incrementando velocidad a 3.");
		    dante.velocidad = 3;
		    dante.mostrarAtributos();
		    System.out.println("Cambiando temperatura a 670.");
		    dante.temperatura = 670;
		    dante.mostrarAtributos();
		    System.out.println("Comprobando la temperatura.");
		    dante.comprobarTemperatura();
		    dante.mostrarAtributos();
		}
		}
	}
}
