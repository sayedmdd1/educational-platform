import java.util.ArrayList;

public class Administrator extends User{

    Administrator(String name, String email){
        super(name, email);
    }

    String[] users = new String[5];
    int c= 0;
    void addUser(String userName){
        System.out.printf("\n------------------------------\n");

        if(c>4){
            System.out.println("Can't add more user by admin "+name);
        }else{
            users[c] = userName;
            c++;
            System.out.println("Admin "+name+" added "+userName);
        }

    }
    void deleteUser(String userName){
        System.out.printf("\n-----------------------\n");

        for (int i =0 ;i<c;i++){
            if(users[i].equals(userName)){
                System.out.println("Admin "+name+" removed "+userName);
                users[i]=null;
            }
        }
    }

    void performRole(){
        System.out.printf("\n------------------------\n");

        System.out.println(name+" is in charge of user: ");
        for (String user : users){
            if(user != null){
                System.out.println(user);
            }
        }
    }
}
