package OOP.Composition;

public class Religeon {
    private String name;
    private String group;

    public Religeon(String name, String group) {
        this.name = name;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Religeon{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
