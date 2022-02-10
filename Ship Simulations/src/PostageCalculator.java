public class PostageCalculator {
    private static double totalCost;
    private static double oCountyCode;
    private static double dCountyCode;

    public static double calculatePostage(String oZipCode, String dZipCode, double weight)
    {
        oCountyCode = Integer.parseInt(oZipCode.substring(0,4));
        dCountyCode = Integer.parseInt(dZipCode.substring(0,4));
        double diff = Math.abs(dCountyCode-oCountyCode) / 100.0;
        totalCost = cost(weight) + diff;
        return totalCost;
    }

    public static double calculatePostage(Address origin, Address destination, double weight)
    {
        String oZipCode = origin.getZipcode();
        String dZipCode = destination.getZipcode();
        oCountyCode = Integer.parseInt(oZipCode.substring(0,4));
        dCountyCode = Integer.parseInt(dZipCode.substring(0,4));
        double diff = Math.abs(dCountyCode-oCountyCode) / 100.0;
        totalCost = cost(weight) + diff;
        return totalCost;
    }

    public static double calculatePostage(Package pack)
    {
        String oZipCode = pack.getOrigin().getZipcode();
        String dZipCode = pack.getDestination().getZipcode();
        oCountyCode = Integer.parseInt(oZipCode.substring(0,4));
        dCountyCode = Integer.parseInt(dZipCode.substring(0,4));
        double diff = Math.abs(dCountyCode-oCountyCode) / 100.0;
        totalCost = cost(pack.getWeight()) + diff;
        return totalCost;
    }

    private static double cost(double weight)
    {
        double c = weight * 10 * 0.5 + 3.75;
        return c;
    }


}
