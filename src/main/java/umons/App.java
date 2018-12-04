package umons;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Addition addition=new Addition();

        System.out.println( "Hello World!" );
        int somme = addition.add(3,5);
        System.out.println( somme );
    }
}

