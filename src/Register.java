//6510451131 Ithikorn Ungniyom

public class Register {
    public static boolean register(User user) {
        //vertify user
        user.vertify();
        user.getEmail().vertify();
        return true;
    }
}
