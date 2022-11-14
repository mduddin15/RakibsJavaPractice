package MathProblems;

public class SimpleInterestCalculatorStatic {
    static double PAmount;
    static double ROI;
    static double TimePeriod;

    public SimpleInterestCalculatorStatic(double PAmount, double ROI, double TimePeriod) {
        this.PAmount = PAmount;
        this.ROI = ROI;
        this.TimePeriod = TimePeriod;
    }
    public static double simpleInterset(double PAmount, double ROI, double TimePeriod ){
        double x = (PAmount*ROI*TimePeriod)/100;
            return x;
        }
    public static void main(String[] args) {
        double m = simpleInterset(5000, 5, 6);
        System.out.println("Total Simple interest is: " + m);
        }
}

