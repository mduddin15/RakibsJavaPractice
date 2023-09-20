package Basic.ProgramizProblems.ControlFlow;

public class NumbersExceptMultipleOfThree {

        public static void main(String[] args) {

            // loop from i = 1 to 10
            for (int i = 1; i <= 10; i++) {
                // inside the loop, check whether i is divisible by 3
                if (i % 3 == 0) {
                    // if true, skip the current iteration of the loop.
                    continue;
                }
                // Otherwise, print i
                System.out.println(i);
            }
        }
    }
