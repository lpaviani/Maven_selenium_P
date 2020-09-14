package common;
public final class ResourceData {
//The ResourceData file will contain all the testing data that will be used against the tests. There is room for the creation of multiple resources files that can run different environments or set of test data.

    //Main Page resources
    public static final String MAINPAGE_URL = "https://www.podium.com";
    public static final String MAINPAGE_SOCIAL_FACEBOOK = "https://www.facebook.com/Podium/";
    //SignUp Page resources
    public static final String SIGNUPPAGE_URL = "https://signup.podium.com/";
    public static final String SIGNUPPAGE_FIRSTNAME = "Luciano"; //This resource can be used to test the max length of the field or as a simple input
    public static final String SIGNUPPAGE_LASTNAME = "Paviani"; //This resource can be used to test the max length of the field or as a simple input
    public static final String SIGNUPPAGE_EMAIL = "abc@test.com"; //This resource can be used to test the max length of the field or as a simple input
    public static final String SIGNUPPAGE_PHONE = "5555912345678";
    public static final String SIGNUPPAGE_BNAME = "Tester Luciano"; //This resource can be used to test the max length of the field or as a simple input
    public static final int SIGNUPPAGE_FIRSTNAME_MAXCHAR = 100;
    public static final int SIGNUPPAGE_LASTNAME_MAXCHAR = 100;
    public static final int SIGNUPPAGE_EMAIL_MAXCHAR = 100;
    public static final int SIGNUPPAGE_BNAME_MAXCHAR = 100;
    //WebChat resources
    public static final String WEBCHAT_NAME = "Luciano Paviani";
    public static final String WEBCHAT_PHONE = "5555123456789";
    public static final String WEBCHAT_MESSAGE = "Hi, My name is Luciano Paviani. You can find more about me at www.linkedin.com/in/lucianopaviani";

    private ResourceData() { }
}