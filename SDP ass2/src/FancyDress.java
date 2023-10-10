// This is a class definition for a decorator called "FancyDress" that extends another class "DressDecorator".
class FancyDress extends DressDecorator
{
	// Constructor for the FancyDress class, which takes a "Dress" object as a parameter.
	public FancyDress(Dress c)
	{
		// Call the constructor of the parent class (DressDecorator) and pass the "Dress" object to it.
		super(c);
	}

	// Override the "assemble" method from the parent class (DressDecorator).
	@Override
	public void assemble()
	{
		// Call the "assemble" method of the parent class (DressDecorator).
		super.assemble();

		// Print a message indicating that Fancy Dress features are being added.
		System.out.println("Adding Fancy Dress Features");
	}
}
