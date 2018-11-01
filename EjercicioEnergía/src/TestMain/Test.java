package TestMain;
/**
la energía de una empresa se mide hora a hora, de ésto, se necesita saber:
1. El consumo por hora 
2. El consumo por día
3. El consumo total del mes, teniendo en cuenta que son de 30 días
4. El consumo está en un rango entre 200 y 400
5. Tomar 3 meses para la estadística
Generar un algoritmo que permita visualizar lo anterior
*/
public class Test 
{
    public int [] Consumo_x_Hora(int [] hour)
    {
        //Consumo por hora
        for (int i = 0; i < hour.length; i++)
        {
            hour [i] = 200 - ( (int) Math.round ((Math.random()) * (200-400)));
        }
        return hour;
    } 
    
    public int [] Consumo_x_Día(int [] day, int [] hour)
    {
        //Consumo por día
        for (int i = 0; i < day.length; i++)
        {
            for (int j = 0; j < day.length; j++)
            {
                int x = 0 - ( (int) Math.round ((Math.random()) * (0-23)));
                day [i] += hour[x];
            }
        }
        return day;
    } 
    
    public int [] Consumo_x_Mes(int [] month, int [] day, int [] hour)
    {
        //Consumo por mes
        for (int i = 0; i < month.length; i++)
        {
            for (int j = 0; j < month.length; j++)
            {
                int x = 0 - ( (int) Math.round ((Math.random()) * (0-29)));
                month [i] += day [x];
            }
        }
        return month;
    } 
}
