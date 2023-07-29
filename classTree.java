public class Tree implements Iterable<Person> {
    private Node root;

    public void add(Person person) {
        if (root == null) {
            root = new Node(person);
        } else {
            root.add(person);
        }
    }

    public void print() {
        if (root != null) {
            root.print();
        }
    }

    public List<Person> getSortedByName() {
        List<Person> list = new ArrayList<>();
        if (root != null) {
            root.getSortedByName(list);
        }
        list.sort(Comparator.comparing(Person::getName));
        return list;
    }

    public List<Person> getSortedByBirthdate() {
        List<Person> list = new ArrayList<>();
        if (root != null) {
            root.getSortedByBirthdate(list);
        }
        list.sort(Comparator.comparing(Person::getBirthdate));
        return list;
    }

    @Override
    public Iterator<Person> iterator() {
        return new TreeIterator(root);
    }
