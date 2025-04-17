package lab10.part2.ex2;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook {
    ArrayList<Student> phoneBook;

    public PhoneBookList() {
        phoneBook = new ArrayList<>();
    }


    @Override
    public Student searchByLastName(String lastName) {
        for (Student student : phoneBook) {
            if (student.getLastName().equalsIgnoreCase(lastName)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String number) {
        for (Student student : phoneBook) {
            if (student.getPhone().equals(number)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void addPerson(Student student) {
        phoneBook.add(student);
    }

    @Override
    public Student searchByName(String name) {
        for (Student student : phoneBook) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String number) {
        phoneBook.removeIf(student -> student.getPhone().equals(number));
    }
}
