
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
    }

    /**
     * 
     */
    public void testSumValuesInterval()
    {
        Calculadora calculador1 = new Calculadora();

        if (calculador1.sumValuesInterval(1,4) == -1 ) {

            System.out.println("Comprobando sumValuesInterval(1,4)...  valores incorrectos -1 / resultado metodo " + calculador1.sumValuesInterval(1,4) + "... ERROR" ) ;       

        } else {

            System.out.println("Comprobando sumValuesInterval(1,4)...  Resultado correctos 10 / resultado metodo " + calculador1.sumValuesInterval(1,4) + "... OK");

        }

        if (calculador1.sumValuesInterval(-1,4) == -1 ) {

            System.out.println("Comprobando sumValuesInterval(-1,4)...  valores incorrectos -1 / resultado metodo " + calculador1.sumValuesInterval(-1,4) + "... ERROR" ) ;       

        }

        if (calculador1.sumValuesInterval(1,-4) == -1 ) {

            System.out.println("Comprobando sumValuesInterval(1,-4)...  valores incorrectos -1 / resultado " + calculador1.sumValuesInterval(1,-4) + " ... ERROR" ) ;               

        }

        if (calculador1.sumValuesInterval(-1,-4) == -1 ) {

            System.out.println("Comprobando sumValuesInterval(1,-4)...  valores incorrectos -1 / resultado " + calculador1.sumValuesInterval(1,-4) + " ... ERROR" ) ;       

        } 

        if (calculador1.sumValuesInterval(2,8) == -1 ) {

            System.out.println("Comprobando sumValuesInterval(1,4)...  valores incorrectos -1 / resultado metodo " + calculador1.sumValuesInterval(2,8) + "... ERROR" ) ;       

        } else {

            System.out.println("Comprobando sumValuesInterval(1,4)...  Resultado correcto 36 / resultado metodo " + calculador1.sumValuesInterval(2,8) + "... OK");

        }    

        if (calculador1.sumValuesInterval(20,500) == -1 ) {

            System.out.println("Comprobando sumValuesInterval(1,4)...  valores incorrectos -1 / resultado metodo " + calculador1.sumValuesInterval(20,500) + "... ERROR" ) ;       

        } else {

            System.out.println("Comprobando sumValuesInterval(1,4)...  Resultado correcto 125250 / resultado metodo " + calculador1.sumValuesInterval(20,500) + "... OK");

        }

    }

    /**
     *
     */
    public void testIsPrime()
    {
        Calculadora calculador1 = new Calculadora();

        boolean isPrime = true;
        String resultado = "OK";
        String correcto = "Si";

        if (calculador1.isPrime(7) == true)   {

            System.out.println("Comprobando isPrime(7)... resultado correcto " +  isPrime   + " / resultado metodo true... " + resultado);
        } else {
            isPrime = false;
            resultado = "ERROR";
            correcto = "no";
            System.out.println("Comprobando isPrime(7)... resultado incorrecto " +  isPrime   + " / resultado metodo false... " + resultado);

        }

        if (calculador1.isPrime(4) == true)   {

            System.out.println("Comprobando isPrime(4)... resultado correcto " +  isPrime   + " / resultado metodo true... " + resultado);
        } else {
            isPrime = false;
            resultado = "ERROR";
            correcto = "no";
            System.out.println("Comprobando isPrime(4)... resultado incorrecto " +  isPrime   + " / resultado metodo false... " + resultado);

        }

        if (calculador1.isPrime(-5) == true)   {

            System.out.println("Comprobando isPrime(-5)... resultado correcto " +  isPrime   + " / resultado metodo true... " + resultado);
        } else {
            isPrime = false;
            resultado = "ERROR";
            correcto = "no";
            System.out.println("Comprobando isPrime(-5)... resultado incorrecto " +  isPrime   + " / resultado metodo false... " + resultado);

        }

        if (calculador1.isPrime(20) == true)   {

            System.out.println("Comprobando isPrime(20)... resultado correcto " +  isPrime   + " / resultado metodo true... " + resultado);
        } else {
            isPrime = false;
            resultado = "ERROR";
            correcto = "no";
            System.out.println("Comprobando isPrime(20)... resultado incorrecto " +  isPrime   + " / resultado metodo false... " + resultado);

        }

        if (calculador1.isPrime(0) == true)   {

            System.out.println("Comprobando isPrime(0)... resultado correcto " +  isPrime   + " / resultado metodo true... " + resultado);
        } else {
            isPrime = false;
            resultado = "ERROR";
            correcto = "no";
            System.out.println("Comprobando isPrime(0)... resultado incorrecto " +  isPrime   + " / resultado metodo false... " + resultado);

        }

        if (correcto != "si")  {

            System.out.println("el metodo " + correcto + " funciona correctamente ");

        }  else {
            
             System.out.println("el metodo " + correcto + " funciona correctamente ");
        }    

    }
}