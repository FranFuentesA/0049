
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

    /**
     *  Metodo que suma dos numeros (num1 y num2) y muestra sa suma entre esos dos numeros
     */
    public int sumValuesInterval(int num1, int num2)
    {
        // Creo variables locales para el contador y dos mas para intercambiar valores 
        int contador = 0;

        int acumulador = 0;

        int cambio1 = num1;

        int cambio2 = num2;

        if (cambio1 >= 0 && cambio2 >= 0) {
            if (cambio2 > cambio1) {
                cambio2 = num1;
                cambio1 = num2;
            }

            while (contador <= cambio1) {

                acumulador = acumulador + contador; 
                contador = contador + 1;

            }

        } else { 

            System.out.println("Error deben se valores positivos");

            acumulador = -1;

        }

        return acumulador;

    }

    /**
     *
     */
    public boolean isPrime(int n) {

        boolean esPrimo = true;
        
        int contador = 2;

        while (esPrimo && (contador < n)) {
            
            if (n % contador == 0) {
             
                esPrimo= false;
            
            }
            contador++;
        }
        
        return esPrimo;
    }

}
