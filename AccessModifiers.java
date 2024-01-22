class Account {
    // public
    public String name;
    protected String email;
    private String password;

    // getters and setters
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Arif Ali";
        account1.email = "arif@gmail.com";
        // account1.password = "1402";
        account1.setPassword("1402786");
        System.out.println(account1.getPassword());
    }
}
