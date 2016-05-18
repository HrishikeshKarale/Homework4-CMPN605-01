/**
* Exceptions.java
*
* @version   $Id: Exceptions.java,v_1.0 03/02/15
*
* @author    hhk9433 (Hrishikesh Karale)
* 
* Revisions:
*      Initial revision
*/

import java.util.*;
import java.io.*;
import java.lang.reflect.Method;


class UserGeneratedMyClassException extends Exception
{
	UserGeneratedMyClassException(int k)
	{
	}
}

/*
 * This Program generates various types of Exceptions.
 */	
class Exceptions
{
    
    public static void main(String agrs[])throws Exception
	{
        int count=0;
        int counter=0;
        final String CLASS_TO_LOAD = "main.java.Utils";
    	String str=new String("NumberFormatException");
    	
    	//user generated Exception is thrown
    	try
    	{
    		throw new UserGeneratedMyClassException(9);
    	}
    	catch( UserGeneratedMyClassException e)
    	{
    		System.out.println("1. EXCEPTION: "+e);
//          e.printStackTrace();
    		System.out.println();
    	}
    	
    	/*
    	 * The below try-catch block is used to check for NumberFromatException
    	 * a string is converted into integer using a static parseInt() from
    	 * Integer class which is a wrapper class. 
    	 */
        try
		{
            count=Integer.parseInt(str);
        }
        catch(NumberFormatException e)
		{
            System.out.println("2. Number Format Exception: \n"+e);
//            e.printStackTrace();
        }
        
        /*
    	 * The below try-catch block is used to check for
    	 * StringIndexOutOfBoundsException which is generated when u try
    	 * to access character position of a string which doesn't exist.
    	 * we have used charAt(n) from String class to check for character
    	 * at position n of he string.
    	 */
        try
		{
	        char a;
	        int l=str.length();
	        for(int i=0; i<=l; i++)
	        {
		        a=str.charAt(i);
		        System.out.print(a);
	        }
        }
        catch(StringIndexOutOfBoundsException e)
		{
            System.out.println("\n\n3. String Index out of bound: \n"+e);
//	        e.printStackTrace();
	    	System.out.println();
	    }
        
        /*
    	 * The below try-catch block is used to check for ArithematicException
    	 * which is generated when u try to divide a number by zero. 
    	 */
        try
		{
            count=5/count;
        }
        catch(ArithmeticException e)
		{
            System.out.println("4. Divide by Zero: \n"+e);
//            e.printStackTrace();
        	System.out.println();
        }
        
        /*
         * The below try-catch block is used to check NoSuchMethodException
         * which is generated if we try to access a method which doesn't
         * exist in the specified class
         */
        try
		{
        	/*
        	 * Class.forName(x) causes the class named x to be dynamically
        	 * loaded and initializes the class x, whereas the returned object
        	 * is not an instance of the x class itself. 
        	 */
        	
	        Class c = Class.forName("java.lang.String");
	        
	        //stores 5 class objects
	        
	        Class[] paramTypes = new Class[5];
            
	        /*
	         * returns method object specified method of the class
	         * represented by this Class object.
	         */
	        
	        Method m = c.getDeclaredMethod("fooMethod", paramTypes);
        }
        catch(NoSuchMethodException e)
		{
            System.out.println("5. No Such Method Found: \n"+e);
//        	e.printStackTrace();
        	System.out.println();
        }
  
        /*
         * the below try-catch block checks for ArrayIndexOutOfBoundsException
         * and handel's an exception if it is thrown by the code in try block.
         * an ArrayIndexOutOfBoundsException is thrown if we try to access an
         * unspecified array index position
         */
        try
		{
            int array[]= new int[1];
            for (int i=0; i<=1; i++)
                array[i]=0;
        }
        catch (ArrayIndexOutOfBoundsException e)
		{
            System.out.println("6. Array Index Out Of Bound: \n"+e);
 //           e.printStackTrace();
        	System.out.println();
        }
        
        /*
         * The below try-catch block checks for ClassNotFoundException and
         * handel's the exception using a catch block.a ClassNotFoundException
         * is generated if u try to access a class or load a class which 
         * you are unable to access due to various reasons.
         */
        try
		{
            /*
             * Class.forName(x) loads class Dynamically and creates an instance
             * of the class x. returned object  is not an instance of the class
             * x itself.
             */
        	
        	Class loadedClass = Class.forName(CLASS_TO_LOAD);
            System.out.println("Class " + loadedClass + " found successfully!");
        }
        catch(ClassNotFoundException e)
		{
            System.out.println("7. Class Not Found: \n"+e);
//            e.printStackTrace();
        	System.out.println();
        }
        
        /*
         * The below try-catch block checks for FileNotFoundException and
         * handel's the exception using a catch block.A FileNotFoundException
         * is generated if u try to access a file or load a file which 
         * does not exist or if the file is inaccessible.
         */
        
        try
		{
        	// creates a reader that you can use to read the content of file
	        FileReader fr= new FileReader("macbeth.txt");
	    }
	    catch( FileNotFoundException e)
		{
	        System.out.println("8. File Not Found: \n"+e);
//	        e.printStackTrace();
	    	System.out.println();
	    }

        /*
         * The try-catch block below checks for NullPointerExeption and
         * handel's if an exception is thrown by the code in the try block.
         * A NullPointerException is thrown if we are trying to access
         * an object with null value.
         */
        try
		{
            str=null;
            if(str.equals("java"))
                System.out.println("yes! str equals to java");
             else
                System.out.println("str  not equals to java");
        }
        catch( NullPointerException e)
		{
            System.out.println("9. Null Pointer: \n"+e);
 //	        e.printStackTrace();
 	   	    System.out.println();
        }
  
        /*
         * the below try-catch block tries to check for a 
         * NegativeArraySizeException and handel's Exception by a catch block.
         * This kind of exception is thrown if an array of size less than zero
         *  is tried to be created.
         */
        try
		{
        	int []s= new int[-1];
        }
        catch (NegativeArraySizeException e)
		{
            System.out.println("10. Negative Size Array: \n"+e);
//            e.printStackTrace();
        	System.out.println();
        }
   }
}
    
