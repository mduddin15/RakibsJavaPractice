package MathProblems.Calculator;

public class SimpleInterestCalculatorObject {


        double PAmount;
        double ROI;
        double TimePeriod;

        public SimpleInterestCalculatorObject(double PAmount, double ROI, double TimePeriod) {
            this.PAmount = PAmount;
            this.ROI = ROI;
            this.TimePeriod = TimePeriod;
        }

    public double simpleInterest(){
            return (PAmount*ROI*TimePeriod)/100;
        }

    @Override
    public String toString() {
        return "SimpleInterestCalculation{" +
                "PAmount=" + PAmount +
                ", ROI=" + ROI +
                ", TimePeriod=" + TimePeriod +
                '}';
    }

    public static void main(String[] args) {

        SimpleInterestCalculatorObject obj = new SimpleInterestCalculatorObject(5000, 5, 6);
        System.out.println(obj);
        double x = obj.simpleInterest();
        System.out.println("Total Simple interest is: "+ x);

        }
    }

