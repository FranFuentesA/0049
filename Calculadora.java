
/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculadora
{
    
    /**
     * Constructor for objects of class Calculadora
     */
    public Calculadora()
    {
        
    }

    /**
     *  Metodo que imprime todos los múltiplos de 5 entre 10 y 95 (ambos extremos no incluidos)
     */
    public void multiplesOfFive()
    {
        //Creo dos variables locales.
        int multiplo = 5;
        
        int contador = 0;  
        
        while  ((multiplo * contador) < 95)
        {
            if (multiplo * contador > 10)
            {
                System.out.println (multiplo + " por " + contador + " es igual " + (multiplo * contador));
            }
            //se incrementara el contador para acumular los multiplos dentro del rango
            contador= contador + 1;
        }
    }
}
