public class Main
{
    public static void main(String[] args)
    {
        double springMaintenanceCost = 300.50;
        double summerMaintenanceCost = 510.00;
        double fallMaintenanceCost = 205.25;
        double winterMaintenanceCost = 400.25;
        double totalYearlyMaintenanceCosts = 0.00;

        totalYearlyMaintenanceCosts = springMaintenanceCost + summerMaintenanceCost + fallMaintenanceCost + winterMaintenanceCost;

        System.out.println("The spring home maintenance cost of $" + springMaintenanceCost + " plus the summer home maintenance cost of $" + summerMaintenanceCost + " plus the fall home maintenance cost of $" + fallMaintenanceCost + " plus the winter home maintenance cost of $" + winterMaintenanceCost + " result in a total yearly home maintenance cost of $" + totalYearlyMaintenanceCosts + ".");
    }
}