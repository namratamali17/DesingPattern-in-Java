package designpattern;

interface Iterator {
    boolean hasNext();

    Object next();
}

interface Container {
    Iterator getIterator();
}

class CollectionName implements Container {
    public String names[] = { "Araj", "Riya", "Siya" };

    @Override
    public Iterator getIterator() {
        return new CollectionNameIterator();
    }

    private class CollectionNameIterator implements Iterator {
        int i;

        @Override
        public boolean hasNext() {
            return i < names.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[i++];
            }
            return null;
        }
    }
}

public class IteratorDesignPattern {
    public static void main(String[] args) {
        CollectionName collection = new CollectionName();
        Iterator iterator = collection.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
