/**
* E.java
*
* @version   $Id: E.java,v_1.0 03/02/15
*
* @author    hhk9433 (Hrishikesh Karale)
*
* Revisions:
*      Initial revision
*/


/*
 * This Program generates Eulers Number thrice using various formulas
 * and then displays them as output if the difference between the Euler's Number
 * and calculated Euler's Number is less than delta which is set as 0.001
 */
public class E
{
    /**
     * This method takes an integer as parametere and returns
     * the factorial value of that integer using recursion. 
     *    
     * @param n
     * @return factorial of given number
     */
    static	int factorial(int n)
    {
        if (n == 0)
            return 1;
        else
            return (n*factorial(n-1));
	}
 
    /**
     * This static method calculates the value of eulers constant
     * using the formula 'Summation( (counter+1)/factorial(counter) )'  where'in
     * a call to factorial(int n) is made to calculate factorial of counter.
     * this method returns the calculated eulers constant
     *   
     * @param delta
     * @return calculated Euler's Number
     */
    static double caculateEversion1(double delta) //cut piece
    {
        int counter=0;
        double e = 0;
        double myEuler = 0;
        
        /*
         * breaks if difference between calaulated Eulers No  and Eulers Number
         * is less than the allowed range which is delta
         */
        
        while (Math.abs(myEuler-Math.E) >= delta)
        {
            e+= ((double)(counter+1)/(factorial(counter)));
            myEuler = e/2;
            counter++;
        }
        return myEuler; 
    }
 
    /**
     * This Static method accepts delta as paramater and returns the Eulers
     * number as a double calculated using the formula
     * 'Summation( (counter+1)/factorial(2k+1) )'. To calculate the factorial,
     * a call to the Method factorial(int n) is made which returns
     * the factorial of the integer.
     * 
     * @param delta
     * @return calculated Euler's Number
     */
    static double caculateEversion2(double delta) //factorial
    {
        int counter=0;
        double e = 0;
        double myEuler = 0;
        
        /*
         * breaks if difference between calaulated Eulers No  and Eulers Number
         * is less than the allowed range which is delta
         */
        while (Math.abs(myEuler-Math.E) >= delta)
        {
            e+= ((double)(counter+1)/(factorial(2*counter +1)));
            myEuler = 2*e;
            counter++;
        }
        return myEuler;
    }

    /**
     * This Static method accepts a double as delta and returns Eulers Number
     * which is calculating the formula 'Summation( (counter^2)/2(factorial(counter)) )', 
     * where the factorial of counter is calculated by called the factorial(int n)
     * which returns the factorial of counter.
     * 
     * @param delta
     * @return Calculated Euler's Number
     */
    static double caculateEversion3(double delta) //
    {
        int counter=0;
        double myEuler=0;
        
      /*
       * breaks if difference between calaulated Eulers No  and Eulers Number
       * is less than the allowed range which is delta
       */
        while (Math.abs(myEuler-Math.E) >= delta)			
        {
        	myEuler+= ((double)(counter*counter)/(2*(factorial(counter))));
            counter++;
        }
        return myEuler;
    }

    /**
     * This main method calls other functions which return Calculated
     * Euler's Numbers and then Displays them as output.
     * 
     * @param args
     */
    
    public static void main(String args[])
    {
        double delta= 0.001;
        double e1 = caculateEversion1(delta);
        double e2 = caculateEversion2(delta);
        double e3 = caculateEversion3(delta);
        
        System.out.println("Eulers Number: "+(Math.E));
        System.out.println("\nFirst Method Gives Euler's no as: "+e1);
        System.out.println("\nSecond Method Gives Euler's no as: "+e2);
        System.out.println("\nThird Method Gives Euler's no as: "+e3);
    }
}