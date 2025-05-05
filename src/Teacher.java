

public class Teacher extends User{

    Teacher(String name, String email){

        super(name, email);
    }

    String[] create_courses = new String[5];
    int c =0;
    void createCourse(String courseName) {
        System.out.println("\n-----------------------------\n");

        if (c > 4) {
            System.out.println("Can't create any new course by "+name);
        } else {
            create_courses[c] = courseName;
            c++;
            System.out.println("Teacher " + name + " created " + courseName);
        }
    }

    void performRole(){
        System.out.printf("\n--------------------\n");

        System.out.println(name+" teaches : ");
        for(String sub : create_courses){
            if(sub!=null){
                System.out.println(sub);
            }
        }
    }
}
