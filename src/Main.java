import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<User>users = new ArrayList<>();

        Student s1 = new Student("abu","abu123@gmail.com");
        Teacher t1 = new Teacher("Mahadi","mahadi123@yahoo.com");
        Administrator a1 = new Administrator("Robin","boss_1@AOL.com");

        s1.enrollCourse("Math");
        s1.enrollCourse("Phy");
        s1.enrollCourse("Bio");
        s1.set_grade("Math","A");
        s1.set_grade("Phy","B");
        s1.get_grade("Math");
        s1.viewGrades();

        t1.createCourse("Bio");

        a1.addUser("Abu");
        a1.addUser("Mahadi");
        a1.addUser("Abir");
        a1.deleteUser("Abu");

        users.add(s1);
        users.add(t1);
        users.add(a1);

        for (User candidates: users){
            candidates.performRole();
        }

    }
}