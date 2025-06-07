package lab13.iterator.example;

public class EmployeeRepository implements EmployeeIterable {
    public String[] employees;

    public EmployeeRepository() {
        employees = new String[]{"David", "Scott", "Rhett", "Andrew", "Jessica"};
    }

    @Override
    public Iterator getIterator() {
        return new EmployeeIterator();
    }

    private class EmployeeIterator implements Iterator {
        int position;

        public EmployeeIterator() {
            position = 0;
        }

        @Override
        public boolean hasNext() {
            if (position < employees.length) {
                return true;
            }

            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return employees[position++];
            }

            return null;
        }
    }
}
