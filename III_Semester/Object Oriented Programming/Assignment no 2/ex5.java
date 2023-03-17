
import java.io.PrintStream;

abstract class DomesticAnimals
{
    public abstract void kitten();
    public abstract void puppy();
}

class Kitten extends DomesticAnimals
{
    PrintStream p = System.out;
    public void kitten()
    {
        p.println("Kittens meow");
    }
    public void puppy()
    {}
}

class Puppy extends DomesticAnimals
{
    PrintStream p = System.out;
    public void kitten()
    {}
    public void puppy()
    {
        p.println("Puppies bark");
    }
}

public class ex5 
{
    public static void main(String args[]) 
    {
        Kitten k = new Kitten();
        Puppy p = new Puppy();
        k.kitten();
        p.puppy();
    }
}