//6510451131 Ithikorn Ungniyom

public class User implements Vertification {
    //attributes
    private String name;
    private Email email;
    private int age;

    //constructor
    public User(String name, String emailName, int age) {
        this.name = name;
        this.email = new Email(emailName);
        this.age = age;
    }
    //getters
    public String getName() {
        return name;
    }
    public Email getEmail() {
        return email;
    }
    public int getAge() {
        return age;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(Email email) {
        this.email = email;
    }
    public void setAge(int age) {
        this.age = age;
    }

    //implement method from Vertification Interface
    @Override
    public void vertify() {
        //Check name of user
        if (getName() == null || getName().trim().equals("")) {
            throw new IllegalArgumentException("");
        }
        System.out.println("Name is " + getName());

        //Check format name of user
        if ( !getName().matches("[a-zA-Z]+")){
            throw new IllegalArgumentException("Name is wrong format");
        }
        System.out.println(getName() + " is correct format");

        //Check age of user
        if(getAge() < 20 ) {
            throw new IllegalArgumentException("Age should more than 20 years");
        }
        System.out.println("Age more than 20 years");
    }
}
