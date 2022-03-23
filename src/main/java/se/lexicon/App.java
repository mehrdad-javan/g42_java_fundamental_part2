package se.lexicon;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Person erik= new Person();
        erik.firstName = "Erik";
        erik.lastName = "Svensson";
        erik.age = 42;
        erik.hobby = "programming";
        System.out.println(erik.getInformation());

        Person mehrdad = new Person();
        mehrdad.firstName = "Mehrdad";
        mehrdad.lastName = "Javan";
        mehrdad.age = 33;
        mehrdad.hobby = "programing";
        System.out.println(mehrdad.getInformation());


    }
}
