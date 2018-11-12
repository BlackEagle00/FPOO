package Paquetes;
import java.awt.*;

public class Practica11 
{
	public static void ComprobarPunto() 
	{
        Point objeto1 = new Point(11 ,22);
        Punto3D objeto2 = new Punto3D(7 ,6 ,64);

        System.out.println("El punto 2D está localizado en (" + objeto1.x
            + ", " + objeto1.y + ")");
        System.out.println("\tEstá siendo movido a (4, 13) ");
        objeto1.move(4, 13);
        System.out.println("El punto 2D está ahora en (" + objeto1.x
            + ", " + objeto1.y + ")");
        System.out.println("\tEstá siendo movido -10 unidades tanto en el eje x "
            + "como en el eje y");
        objeto1.translate(-10,- 10) ;
        System.out.println("El punto 2D finaliza en (" + objeto1.x
            + " , " + objeto1.y + " ) \n") ;
        System.out.println("El punto 3D está localizado en (" + objeto2.x
            + " , " + objeto2.y + " , " + objeto2.z + " ) ");
        System.out.println("\tEstá siendo movido a (10, 22, 71) " ) ;
        objeto2.move(10,22,71 ) ;
        System.out.println("El punto 3D está ahora en (" + objeto2.x
            + " , " + objeto2.y + " , " + objeto2.z + " ) ");
        System.out.println("\tEstá siendo movido - 20 unidades en los ejes x, y "
            + " z");
        objeto2.translate(-20, -20, -20);
        System.out.println("El punto 3D finaliza en ( " + objeto2.x
            + " , " + objeto2.y + " , " + objeto2.z + " ) ");
    }
	
	public class Punto3D extends Point 
	{
	    public int z;
	    public Punto3D(int x, int y, int z) 
	    {
	         super(x, y);
	         this.z = z;
	    }

	    public void move(int x, int y, int z) 
	    {
	         this.z = z;
	         super.move(x, y);
	    }

	    public void translate(int x, int y, int z) 
	    {
	         this.z += z;
	         super.translate(x, y);
	    }
	}
}
