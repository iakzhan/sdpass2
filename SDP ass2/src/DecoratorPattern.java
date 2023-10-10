// This is the main class that demonstrates the Decorator design pattern.
public class DecoratorPattern
{
    public static void main(String[] args)
    {
        // Create a sporty dress decorated with a basic dress.
        Dress sportyDress = new SportyDress(new BasicDress());
        sportyDress.assemble(); // Call the assemble method to build the sporty dress.
        System.out.println();

        // Create a fancy dress decorated with a basic dress.
        Dress fancyDress = new FancyDress(new BasicDress());
        fancyDress.assemble(); // Call the assemble method to build the fancy dress.
        System.out.println();

        // Create a casual dress decorated with a basic dress.
        Dress casualDress = new CasualDress(new BasicDress());
        casualDress.assemble(); // Call the assemble method to build the casual dress.
        System.out.println();

        // Create a sporty and fancy dress combination, where a fancy dress is decorated with a sporty dress, both on a basic dress.
        Dress sportyFancyDress = new SportyDress(new FancyDress(new BasicDress()));
        sportyFancyDress.assemble(); // Call the assemble method to build the sporty and fancy dress.
        System.out.println();

        // Create a casual and fancy dress combination, where a fancy dress is decorated with a casual dress, both on a basic dress.
        Dress casualFancyDress = new CasualDress(new FancyDress(new BasicDress()));
        casualFancyDress.assemble(); // Call the assemble method to build the casual and fancy dress.
    }
}
