package NestedClass;

// outer class
public class BasicNestedClass {

    //Inner class
    static class Newclass {

            private String myName ="rakib";
            public String getName() {
                return myName;
            }
    }
        public static void main(String[] args) {
            int a =1;
            int d =4;
            int c = a+d;

            BasicNestedClass.Newclass myObject = new BasicNestedClass.Newclass();
            String Name = myObject.getName();
            System.out.println (Name);
            System.out.println (c);
        }

    }


