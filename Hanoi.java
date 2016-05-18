/**
* TowerOfHanoi.java
*
* @version   $Id: TowerOfHanoi.java,v_1.4 03/01/15
*
* @author    hhk9433 (Hrishikesh Karale)
*
* Revisions:
*      Initial revision
*/


/*
 * This Program solve's Tower Of Hanoi problem for 3 discs Recursively
 * and gives output as the steps that should be implemented so as to solve
 * the tower of hanoi. 
 */

public class Hanoi
{

    static int a[] = {1,2,3,4};					 //Start pole
    static int b[] = {0,0,0,0};					 //Intermediate pole
    static int c[] = {0,0,0,0};					 //end pole
	
    /**
     * This method takes integer arrays as inputs and prints the three arrays
     * 
     * @param a
     * @param b
     * @param c
     */
	 
    public static void display (int a[], int b[], int c[])
    {
        for (int i = 0 ; i < a.length ; i++) 
            System.out.println(a[i] + " " + b[i] + " " + c[i]);
        System.out.println("-------");
        System.out.println("1 2 3");
    }

    /**
     * This method takes no of discs, start pole, intermediate pole and
     * end pole as input and moves the discs one at a time and gives us
     * new start pole, end pole and intermediate pole.
     * 
     * @param n
     * @param startPole
     * @param intermediatePole
     * @param endPole
     */
    
    public static void calculate(int n, String startPole,String intermediatePole, String endPole)
    {
        /*
         * if condition to move the disc from peg "1" to "3"
         */
        if (startPole == "1" && endPole == "3")
        {
            for (int i = 0 ; i < a.length ; i++)
            	//if the disc with value n found in a
                if (a[i] == n)                                
                {
                    for (int j = 0 ; j < c.length - 1 ; j++)
					/* if the current element in c is 0 and the next term is not 0
					 * place the value from a to c
					 */
                        if (c[j] == 0 && c[j+1] != 0 )         
                        {
                            c[j]=a[i];
                            break;
                        }
						//if reached the last element of c
                        else if (j == (c.length - 2))
                            c[c.length - 1] = a[i] ;
                    /*
                     * after successful movement of disc from a to c
                     * put that element in a as 0
                     */
                    a[i] = 0;                              
                }
            display (a, b, c);
        }
		
        /*
         * if condition to move the disc from peg "1" to "2"
         */
        else if (startPole == "1" && endPole == "2")
        {
            for (int i = 0 ; i < a.length ; i++)
            	//if the disc with value n found in a
                if (a[i] == n)
                    {
                        for (int j = 0 ; j < b.length - 1 ; j++)
						/* if the current element in b is 0 and the next term is not 0
						 * place the value from a to b
						 */
                            if (b[j] == 0 && b[j+1] != 0 )
                            {
                                b[j]=a[i];
                                break;
                            }
							//if reached the last element of b
                            else if (j == (b.length - 2))
                                b[b.length - 1] = a[i] ;
                        /*
                         * after successful movement of disc from a to b
                         * put that element in a as 0
                         */
                        a[i] = 0;
                    }
            display (a, b, c);
        }
        
        /*
         * if condition to move the disc from peg "2" to "1"
         */
        else if (startPole == "2" && endPole == "1")
        {
            for (int i = 0 ; i < b.length ; i++)
            	//if the disc with value n found in b
                if (b[i] == n)
                {
                    for (int j = 0 ; j < a.length - 1 ; j++)
					/* if the current element in a is 0 and the next term is not 0
					 * place the value from b to a
					 */
                        if (a[j] == 0 && a[j+1] != 0 )
                        {
                            a[j]=b[i];
                             break;
                        }
						//if reached the last element of a
                        else if (j == (a.length - 2))
                            a[a.length - 1] = b[i] ;
                    /*
                     * after successful movement of disc from b to a
                     * put that element in b as 0
                     */
                      b[i] = 0;
                }
            display (a, b, c);
        }
		
        /*
         * if condition to move the disc from peg "2" to "3"
         */
        else if (startPole == "2" && endPole == "3")
        {
            for (int i = 0 ; i < b.length ; i++)
            	//if the disc with value n found in b
                if (b[i] == n)
                {
                    for (int j = 0 ; j <= c.length - 1 ; j++)
					/* if the current element in c is 0 and the next term is not 0
					 * place the value from b to c
					 */
                        if (c[j] == 0 && c[j+1] != 0 )
						{
							c[j]=b[i];
							break;
						}
						//if reached the last element of c
                        else if (j == (c.length - 2))
                            c[c.length - 1] = b[i] ;
                    /*
                     * after successful movement of disc from b to c
                     * put that element in b as 0
                     */
                    b[i] = 0;
                }
            display (a, b, c);
        }
		
        /*
         * if condition to move the disc from peg "3" to "1"
         */
        else if (startPole == "3" && endPole == "1")
        {
            for (int i = 0 ; i < c.length ; i++)
            	//if the disc with value n found in c
                if (c[i] == n)
                {
                    for (int j = 0 ; j <= a.length - 1 ; j++)
					/* if the current element in a is 0 and the next term is not 0
					 * place the value from c to a
					 */
                        if (a[j] == 0 && a[j+1] != 0 )
                        {
                            a[j]=c[i];
                            break;
                        }
                    /*
                     * after successful movement of disc from c to a
                     * put that element in c as 0
                     */
                    c[i] = 0;
                }
            display (a, b, c);
        }
		
        /*
         * if condition to move the disc from peg "3" to "2"
         */
        else if (startPole == "3" && endPole == "2")
        {
            for (int i = 0 ; i < c.length ; i++)
            	//if the disc with value n found in c
                if (c[i] == n)
                {
                    for (int j = 0 ; j <= b.length - 1 ; j++)
					/* if the current element in b is 0 and the next term is not 0
					 * place the value from c to b
					 */
                        if (b[j] == 0 && b[j+1] != 0 )
                        {
                            b[j]=c[i];
                            break;
                        }
                    /*
                     * after successful movement of disc from c to b
                     * put that element in c as 0
                     */
                    c[i] = 0;
                }
            display (a, b, c);
        }
    }

    /**
     * This method takes no of discs as int, and start pole, intermediate pole,
     * end pole as strings and calls move() which moves the discs one at a time  
     * 
     * @param n
     * @param startPole
     * @param intermediatePole
     * @param endPole
     */
    
    public static void move(int n, String startPole,String intermediatePole, String endPole)
	{
        if (n== 0)
		return;
        //recursively calls  move() to move "n-1" discs to peg 2
        move(n-1, startPole,endPole, intermediatePole);                   
        System.out.println("\nMove " +n + " from " + startPole + " to " +endPole );
        //shift the disc and calculate arrays a, b ,c
        calculate(n,startPole, intermediatePole, endPole);
        //recursively calls move() to move "n-1" discs to peg 3
        move(n-1, intermediatePole,startPole, endPole);
    }

    /**
     * calls display() and move()
     * 
     * @param args
     */
    public static void main(String[] args) 
    {
        display(a,b,c);
        move(4, "1","2", "3");
    }
}