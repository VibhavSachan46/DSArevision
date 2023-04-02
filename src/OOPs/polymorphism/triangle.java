package OOPs.polymorphism;

public class triangle extends shape
{
    @Override   // this is called annotation. Will give error if below fun is not overriden
    void area()
    {
        System.out.println("Area is .5 * h * b");
    }
}
