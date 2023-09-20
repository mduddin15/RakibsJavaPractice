package Enum.Months;

public class MainForMonths {
    public static void main(String[] args) {
        String givenMonth = "January";

        // calling whichMonth method
        // Input parameter is givenMonth i.e : January
        // Return the numeric value of the month and storing the returned value in variable d
        int d = whichMonth(givenMonth);
        System.out.println(d);
    }

    public static int whichMonth(String givenMonth) {
        Months months = Months.valueOf(givenMonth); // valueOf is built in method of enum which takes
        //the value of parameter match with the enum value and return it as enum.
        System.out.println(months); // print as example.
        int date = 0;
        switch (months) {
            case January:
                date = 1;
                break;
            case February:
                date = 2;
                break;
            case March:
                date = 3;
                break;
            case April:
                date = 4;
                break;
            case May:
                date = 5;
                break;
            case June:
                date = 6;
                break;
            case July:
                date = 7;
                break;
            case August:
                date = 8;
                break;
            case September:
                date = 9;
                break;
            case October:
                date = 10;
                break;
            case November:
                date = 11;
                break;
            case December:
                date = 12;
                break;
            default:
                date = 0;
                break;
        }
        return date;
    }
}
