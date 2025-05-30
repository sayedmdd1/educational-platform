

public class Student extends User{

    private String[][] grade_list = new String[5][2];

    Student(String name , String email){

        super(name,email);
    }

    int c = 0;
    void enrollCourse(String courseName){
        System.out.printf("\n--------------------------\n");
        if(c>4){
            System.out.println("Can't enroll in more courses by "+name);
        }else {
            System.out.println(name+" enrolled in "+courseName);
            grade_list[c][0] = courseName;
            c++;
        }

    }

    void set_grade(String courseName,String grade){
        for(int i = 0;i<c;i++){
            if(grade_list[i][0].equals(courseName)){
                grade_list[i][1] = grade;
            }
        }
    }

    void get_grade(String courseName){
        System.out.printf("\n-----------------\n");
        for(int i=0;i<c;i++){
            if(grade_list[i][0].equals(courseName)){

                System.out.println(name+" got '"+grade_list[i][1]+"' on "+courseName);
                break;
            }
            else if(grade_list[i][0].equals(courseName) && grade_list[i][1]==null)
            {
                System.out.println(courseName+" : ---- (not graded yet)");
                break;
            }
            else{
                System.out.println(name + " did not enroll on " + courseName);
                break;
            }
        }
    }

    void viewGrades(){
        System.out.printf("\n----------------------\n");
        System.out.println(name+"'s grades are: ");

        for (int i =0;i<c;i++){

            if(grade_list[i][1]!=null){
                System.out.println(grade_list[i][0]+" : "+grade_list[i][1]);
            }else{
                System.out.println(grade_list[i][0]+" : ---- (not graded yet)");
            }

        }
    }

    void performRole(){
        System.out.printf("\n-----------------------\n");

        System.out.println(name+" enrolled in : ");
        for (String[] sub : grade_list) {
            if (sub[0] != null) {
                    System.out.println(sub[0]);
            }
        }
    }
}
