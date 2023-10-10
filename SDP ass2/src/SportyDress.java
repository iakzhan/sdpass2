class SportyDress extends DressDecorator
{//SportyDress class constructor takes a Dress object as a paramete
    public SportyDress(Dress c)
    {
        super(c);
    }

    @Override
    public void assemble() //assemble() method on the decorated dress before adding the sporty dress features
    {
        super.assemble();
        System.out.println("Adding Sporty Dress Features");
    }
}