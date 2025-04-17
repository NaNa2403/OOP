package lab10.part2.ex2;

import java.util.HashMap;

public class PhoneBookMap implements PhoneBook {
    HashMap<String, Student> phoneBookMap;

    //Phone number is key
    public PhoneBookMap() {
        phoneBookMap = new HashMap<String, Student>();
    }


    @Override
    public Student searchByLastName(String lastName) {
        for (Student student : phoneBookMap.values()) {
            if (student.getLastName().equalsIgnoreCase(lastName)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String number) {
        return phoneBookMap.get(number);
    }

    @Override
    public void addPerson(Student student) {
        phoneBookMap.put(student.getPhone(), student);
    }

    @Override
    public Student searchByName(String name) {
        for (Student student : phoneBookMap.values()) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String number) {
        phoneBookMap.remove(number);
    }
}
