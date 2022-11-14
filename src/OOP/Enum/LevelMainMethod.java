package OOP.Enum;

public class LevelMainMethod {

    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);



                switch(myVar) {
                    case LOW:
                        System.out.println("Low level");
                        break;
                    case MEDIUM:
                        System.out.println("Medium level");
                        break;
                    case HIGH:
                        System.out.println("High level");
                        break;
                }
            }
        }

