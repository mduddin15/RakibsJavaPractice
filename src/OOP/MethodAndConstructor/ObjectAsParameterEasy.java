package MethodAndConstructor;

class Adder{
    int x;
    int y;
    int z;

    public int addThree(Adder adderObj) {
        return adderObj.x + adderObj.y + adderObj.z;
    }
}

class Employee{

    String fName, lName;
   String fullName(Employee name){
       return name.fName + name.lName;

    }
}

public class ObjectAsParameterEasy {

    public static void main(String[] args) {

        Adder adder = new Adder();
        adder.x = 10;
        adder.y = 20;
        adder.z = 30;

        System.out.println(adder.addThree(adder));

        Employee e = new Employee();
        e.fName = "Rakib";
        e.lName = "Uddin";
        System.out.println(e.fullName(e));
    }
}
