public abstract class User {

    String name,email;

    User(String name , String email){
        this.name =  name;
        this.email = email;
    }

    abstract void performRole();

}
