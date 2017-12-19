package com;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// affichge dans la console
        System.out.println( "Hello World!" );
        
        Operations operations = new Operations();
        long total = operations.additionner(3, 2);
        //long total2 = operations.multiplier(5, 2);
        System.out.println( "total : " + total /*+ "total2 : " + total2*/);

    }

}
