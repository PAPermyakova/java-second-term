public class Administrator extends User {

    private int adminID;
    private String adminName;
    private String email;

    public Administrator(int adminID, String adminName, String email, String password, String loginStatus, Date registerDate) {
        super(adminID, adminName, password, loginStatus, registerDate); // теперь поля админа имеют значения юзера
        this.adminName = adminName;
        this.adminID = adminID;
        this.email = email;
    }

    public int getID() {
        return adminID;
    }

    public String getName() {
        return adminName;
    }

    public String getEmail() {
        return email;
    }

    public void appear() {
        System.out.println("The administrator " + adminName + " - " + email + " - " + adminID + " entered the system");
    }

    public void updateCatalog() {
        System.out.println("Product catalog has been updated by administrator " + adminName);
    }
}
