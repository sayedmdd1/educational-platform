import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<User>users = new ArrayList<>();

        Student s1 = new Student("abu","abu123@gmail.com");
        Student s2 = new Student("Sayed","sayed45@gmail.com");
        Teacher t1 = new Teacher("Mahadi","mahadi123@yahoo.com");
        Teacher t2 = new Teacher("Khabib","khabib23@yahoo.com");
        Administrator a1 = new Administrator("Robin","boss_1@AOL.com");
        Administrator a2 = new Administrator("Khamzat","khamzat56@AOL.com");

        s1.enrollCourse("Math");
        s1.enrollCourse("Phy");
        s1.enrollCourse("Bio");
        s1.set_grade("Math","A");
        s1.set_grade("Phy","B");
        s1.get_grade("Math");
        s1.viewGrades();

        s2.enrollCourse("Calculus");
        s2.enrollCourse("Eng II");
        s2.set_grade("Calculus","C");
        s2.set_grade("Eng II","D");
        s2.get_grade("Calculus");
        s2.get_grade("ghf");
        s2.viewGrades();

        t1.createCourse("Bio");

        t2.createCourse("Calculus");
        t2.createCourse("Eng II");

        a1.addUser("Abu");
        a1.addUser("Mahadi");
        a1.addUser("Abir");
        a1.deleteUser("Abu");

        a2.addUser("Sayed");
        a2.addUser("Khabib");
        a2.deleteUser("Mahadi");

        users.add(s1);
        users.add(t1);
        users.add(a1);
        users.add(s2);
        users.add(t2);
        users.add(a2);

        for (User candidates: users){
            candidates.performRole();
        }

    }
}