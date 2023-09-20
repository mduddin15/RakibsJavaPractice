package LinkedList;


import java.util.LinkedList;

public class BasicLinkedList {

    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Zeep");
        cars.add("Diamlar");
        cars.add("Tesla");
        cars.add("Nissan");
        System.out.println(cars);

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));

        }

        cars.set(2, "Toyota");
        System.out.println(cars);

        cars.remove(0);
        System.out.println(cars);

        cars.addFirst("Mazda");
        System.out.println(cars);

        cars.addLast("Mazda");
        System.out.println(cars);

        cars.removeFirst();
        System.out.println(cars);

        cars.removeLast();
        System.out.println(cars);

        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());

        cars.clear();
        System.out.println(cars);

        }
    }
