package ejercicioenergía;
import TestMain.Test;
/**
la energía de una empresa se mide hora a hora, de ésto, se necesita saber:
1. El consumo por hora 
2. El consumo por día
3. El consumo total del mes, teniendo en cuenta que son de 30 días
4. El consumo está en un rango entre 200 y 400
5. Tomar 3 meses para la estadística

Generar un algoritmo que permita visualizar lo anterior
*/
public class EjercicioEnergía
{
    public static void main(String[] args) 
    {
        Test Obj = new Test(); 
                
        int [] hour = new int [24];
        int [] day = new int [30];
        int [] month = new int [12];
        

        hour = Obj.Consumo_x_Hora(hour);
        day = Obj.Consumo_x_Día(day, hour);
        month = Obj.Consumo_x_Mes(month, day, hour);
                
        for (int i = 0; i < hour.length; i++)
        {
            System.out.println("Consumo de la hora "+(i+1)+": ["+hour[i]+"]"+"Kw/h");
        }
        System.out.println("\n");
        
        for (int i = 0; i < day.length; i++)
        {
            System.out.println("Consumo del día "+(i+1)+": ["+day[i]+"]"+"Kw/h");
        }
        System.out.println("\n");
        
        for (int i = 0; i < month.length; i++)
        {
            System.out.println("Consumo del mes "+(i+1)+": ["+month[i]+"]"+"Kw/h");
        }
        System.out.println("\n");
        
        int first = 0, second = 0, third = 0;
        

            first = 0 - ((int)Math.round((Math.random())*(0-11)));
            second = 0 - ((int)Math.round((Math.random())*(0-11)));
            third = 0 - ((int)Math.round((Math.random())*(0-11)));
        
        System.out.println("Consumo mes " +1+ ":" +month[first]);
        System.out.println("Consumo mes " +1+ ":" +month[second]);
        System.out.println("Consumo mes " +1+ ":" +month[third]);
    }  
}
