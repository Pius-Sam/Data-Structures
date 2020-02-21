package LinkedList;

public class App {
    public static void main(String[] args) {
        List<Person> list = new LinkedList<Person>();

        Person p = new Person(12, "Mike");
        list.insert(p);
        list.insert(new Person(22, "Gustavo"));
        list.insert(new Person(18, "Ade"));
        list.insert(new Person(2, "Peter"));
        list.insert(new Person(8, "Matthew"));

        list.remove(p);

        list.traverseList();
    }
}
