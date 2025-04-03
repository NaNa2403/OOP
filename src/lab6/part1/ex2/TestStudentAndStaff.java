package lab6.part1.ex2;

public class TestStudentAndStaff {
    public static void main(String[] args) {
        Student student1 = new Student("Nghia", "Bac Giang", "Data Science", 4, 10000.0);
        System.out.println(student1);

        Staff staff1 = new Staff("Hieu", "Bac Ninh", "HUS", 10000.0);
        System.out.println(staff1);
    }
}
