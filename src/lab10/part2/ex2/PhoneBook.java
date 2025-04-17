package lab10.part2.ex2;

public interface PhoneBook {
    public Student searchByLastName(String lastName);

    public Student searchByNumber(String number);

    public void addPerson(Student student);

    public Student searchByName(String name);

    public void deleteByNumber(String number);
}
