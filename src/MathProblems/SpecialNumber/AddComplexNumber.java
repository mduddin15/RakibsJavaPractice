package MathProblems.SpecialNumber;

public class AddComplexNumber {

        double real, imaginary;

    AddComplexNumber(double r, double i) { // it's a constructor
            this.real = r;
            this.imaginary = i;
        }

    @Override
    public String toString() {
        return  real + "+" + imaginary + 'i';
    }


    public static AddComplexNumber sum(AddComplexNumber cn1, AddComplexNumber cn2) {
        AddComplexNumber addition = new AddComplexNumber(0, 0);
        addition.real = cn1.real + cn2.real;
        addition.imaginary = cn1.imaginary + cn2.imaginary;

        return addition;
    }

    public static void main(String args[]){
            AddComplexNumber cn1 = new AddComplexNumber(10.7, 22.5);
            AddComplexNumber cn2 = new AddComplexNumber(28.2, 68);

        System.out.println("cn1: "+ cn1);
        System.out.println("cn2: "+ cn2);

            AddComplexNumber addition = sum(cn1, cn2);

        System.out.println("Addition: "+ addition);

        //Alternate print without toString Method.

            //System.out.printf("\nComplex Numbers Sum = " +
                   // addition.real + " + " + addition.imaginary + "i ");
        }


    }