package Basic.ProgramizProblems.Array;

import java.util.Scanner;
public class ComputeStandardDeviation {

        // method to compute standard deviation
        public double calculateSD(double data[]) {
            double sum = 0.0;

            // find the sum of all the array elements
            for (int i = 0; i < data.length; ++i) {
                sum = sum + data[i];
            }

            // compute the mean
            double mean = sum/data.length;

            double result = 0.0;
            for (int i = 0; i < data.length; ++i) {


                // find the difference of each array value and mean
                double difference =  data[i] - mean;

                // compute the square of each difference
                double squaredDifference = difference * difference;

                // add all the square difference
                result = result + squaredDifference;
            }

            // compute the variance by dividing the above result by data.length

                double variance = result/data.length;

            // compute the standard deviation by computing the square root of variance

            double standardDeviation = Math.sqrt(variance);

            // return standard deviation
            return standardDeviation;

        }

        public static void main(String[] args) {

            // array to store numbers
            double[] numbers = new double[5];

            // get input for numbers
            Scanner input = new Scanner(System.in);
            for(int i = 0; i < numbers.length; ++i) {
                numbers[i] = input.nextDouble();
            }

            ComputeStandardDeviation obj = new ComputeStandardDeviation();


            // call the calculateSD() method with the numbers array as argument
            double sd = obj.calculateSD(numbers);

            System.out.println(sd);

            input.close();
        }
    }
