public abstract class Authenticator {
         public boolean authenticate(String username, String password)
         {
            return (getLogin(username) != null && getPassword(username).equals(password));
         }
         public abstract String getLogin(String username);
         public abstract String getPassword(String username);       
}
