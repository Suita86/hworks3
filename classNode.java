private static class Node {
    private final Person person;
    private Node left;
    private Node right;

    public Node(Person person) {
        this.person = person;
    }

    public void add(Person person) {
        if (person.compareTo(this.person) < 0) {
            if (left == null) {
                left = new Node(person);
            } else {
                left.add(person);
            }
        } else {
            if (right == null) {
                right = new Node(person);
            } else {
                right.add(person);
            }
        }
    }

    public void print() {
        if (left != null) {
            left.print();
        }
        System.out.println(person);
        if (right != null) {
            right.print();
        }
    }

    public void getSortedByName(List<Person> list) {
        if (left != null) {
            left.getSortedByName(list);
        }
        list.add(person);
        if (right != null) {
            right.getSortedByName(list);
        }
    }

    public void getSortedByBirthdate(List<Person> list) {
        if (left != null) {
            left.getSortedByBirthdate(list);
        }
        list.add(person);
        if (right != null) {
            right.getSortedByBirthdate(list);
        }
    }
}
