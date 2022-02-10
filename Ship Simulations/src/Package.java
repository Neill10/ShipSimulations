public class Package {
    private Address origin;
    private Address destination;
    private double weight;//pounds

    public Package(Address origin,Address destination,double weight)
    {
        this.origin = origin;
        this.destination = destination;
        if(weight < .1)
        {
            System.out.println("Not a valid weight! (Less than .1 lbs) Weight will be equal to null");
            this.weight = 0;
        }
        else {
            this.weight = weight;
        }
    }

    public Address getOrigin()
    {
        return  origin;
    }
    public Address getDestination()
    {
        return destination;
    }
    public double getWeight()
    {
        return weight;
    }
}
