package main;

public class LateFeeCalculator {
    public double calculateTotalLateFees(LateFeeCalculatable[] items,int days)
    {
        double totalLateFee=0;
        for(LateFeeCalculatable item:items)
        {
            totalLateFee+=item.calculateLateFee(days);
        }
        return totalLateFee;
    }
}
