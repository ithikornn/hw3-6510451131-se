//6510451131 Ithikorn Ungniyom

import java.util.regex.Pattern;
import java.util.Arrays;
import java.util.List;

public class Email implements Vertification {
    //attribute
    private String emailName;

    //constructor
    public Email(String emailName) {
        this.emailName = emailName;
    }

    //getter
    public String getEmailName() {
        return emailName;
    }
    //setter
    public void setEmailName(String emailName) {
        this.emailName = emailName;
    }

    //implement method from Vertification Interface
    @Override
    public void vertify() {
        //check empty email name
        if (getEmailName() == null || getEmailName().trim().equals("")) {
            throw new IllegalArgumentException("Email should not empty");
        }
        System.out.println("Email is " + getEmailName());

        //check pattern of email name
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern validEmailPattern = Pattern.compile(EMAIL_PATTERN);
        if( !validEmailPattern.matcher(getEmailName()).matches() ) {
            throw new IllegalArgumentException("Email is wrong format");
        }
        System.out.println(getEmailName() +  " is correct format");

        //check domains
        List<String> notAllowDomains = Arrays.asList("dom1.cc","dom2.cc", "dom3.cc");
        if(notAllowDomains.contains(getEmailName().split("@")[1])) {
            throw new IllegalArgumentException("Domain Email is not allow");
        }
        System.out.println("Domain Email is allow");
    }
}
