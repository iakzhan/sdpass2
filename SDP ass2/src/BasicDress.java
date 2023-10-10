class BasicDress implements Dress
{
    @Override
    public void assemble()//BasicDress class can be decorated with additional features by creating decorator classes that extend
    // the BasicDress class and override the "assemble()" method

    {
        System.out.println("Basic Dress Features");
    }
}