public class User {

    protected int userId;
    protected String userName;
    protected String password;
    protected String loginStatus;
    protected Date registerDate;

    public User() {
    }

    public User(int userId, String userName, String password, String loginStatus, Date registerDate) {
       this.userId = userId;
       this.userName = userName;
       this.password = password;
       this.loginStatus = loginStatus;
       this.registerDate = registerDate;
   }

    public void verifyLogin() {
        System.out.println("Login was verified successfully!");
    }
}
