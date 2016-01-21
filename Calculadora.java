
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
    
    /**
     *  Metodo que suma los numeros (ellos incluidos) entre 0 y 10.
     */
    public void sumValues()
    {
        // Creo dos variables locales
        int valor = 0;

        int contador = 0;

        while (contador <= 10)
        {
            valor = valor + contador;
            contador = contador + 1;
        }

        System.out.println("El resultado de sumar todos los numeros entre el 0 y el 10 es: " + valor);

    }
}
