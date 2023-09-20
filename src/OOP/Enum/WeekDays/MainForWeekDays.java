package Enum.WeekDays;

public class MainForWeekDays {


        public static void main(String[] args) {
            String givenDays = "Monday";

            int d = whichDays(givenDays);
            System.out.println(d);
        }

        public static int whichDays(String givenDays) {
            Weekday Days = Weekday.valueOf(givenDays);
            int day = 0;
            switch (Days) {
                case Saturday:
                    day = 1;
                    break;
                case Sundays:
                    day = 2;
                    break;
                case Monday:
                    day = 3;
                    break;
                case Tuesday:
                    day= 4;
                    break;
                case Wednesday:
                    day = 5;
                    break;
                case Thursday:
                    day = 6;
                    break;
                case Friday:
                    day = 7;
                    break;

                    default:
                        day = 0;
                    break;
            }
            return day;
        }
    }

