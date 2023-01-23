package garbageCollection;

public class LearnGarbageCollection {

    // Garbage Collection

    String name = "James";
    String address = "NY,USA";
    String phoneNumber = "3453465346";
    double salary1 = 50000.7888;
    double salary2 = 90000.7888;

    public static void main(String[] args) {
        LearnGarbageCollection learn = new LearnGarbageCollection();

        LearnGarbageCollection learn1 = new LearnGarbageCollection();

        LearnGarbageCollection learn3 = new LearnGarbageCollection();


        System.out.println(learn.name);

        //learn1.sum();
        learn1.finalize();

        // Requesting JVM for running Garbage Collection
        System.gc();

        // Requesting JVM for running Garbage Collection
        Runtime.getRuntime().gc();

    }

    protected void sum(){
        System.out.println(salary1+ salary2);
    }

    protected void finalize(){
        System.out.println("Called The finalize method");
    }




}
