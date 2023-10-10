// Define a class `CasualDress` that extends `DressDecorator`
class CasualDress extends DressDecorator
{
    // Constructor to initialize the decorator with a dress component

    public CasualDress(Dress c)
    {
        super(c);// Call the constructor of the parent `DressDecorator`
    }
    // Override the `assemble` method to add behavior
    @Override
    public void assemble()
    {
        super.assemble();// Call the `assemble` method of the parent `DressDecorator`
        System.out.println("Adding Casual Dress Features"); // Add casual dress features
    }
}