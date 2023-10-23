public class CSVAuthenticator extends Authenticator
{

    
    @Override
    public String getLogin(String username) {
        System.out.println("Opening csv for username");
        if(username.equals("ValidUsername") || username.equals("username"))
        {
            return username;
        }
        return null;
    }

    @Override
    public String getPassword(String username) {
        System.out.println("Opening csv for password");
        if(username.equals("ValidUsername") || username.equals("username"))
        {
            return "ValidPassword";
        }
        return "InvalidPassword";

    }
    
}
