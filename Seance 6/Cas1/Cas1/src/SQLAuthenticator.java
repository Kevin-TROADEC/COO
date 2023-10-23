public class SQLAuthenticator extends Authenticator 
{

    @Override
    public String getLogin(String username) {
        System.out.println("Sending SQL for username");
        if(username.equals("ValidUsername") || username.equals("username"))
        {
            return username;
        }
        return null;
    }

    @Override
    public String getPassword(String username) {
        System.out.println("Sending SQL request for password");
        if(username.equals("ValidUsername") || username.equals("username"))
        {
            return "ValidPassword";
        }
        return "InvalidPassword";
    }
        
}
