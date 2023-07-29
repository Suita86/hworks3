private static class TreeIterator implements Iterator<Person> {
        private final List<Person> list;
        private int index;

        public TreeIterator(Node root) {
            list = new ArrayList<>();
            if (root != null) {
                root.getSortedByName(list);
            }
            index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < list.size();
        }

        @Override
        public Person next() {
            return list.get(index++);
        }
    }
}