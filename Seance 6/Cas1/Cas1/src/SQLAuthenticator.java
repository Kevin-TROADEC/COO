import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SQLAuthenticator extends Authenticator 
{

    @Override
    public String getLogin(String username) {
        System.out.println("Sending SQL for username");
        List<String> sql = SQLRequest();

        for (String i : sql) 
        {
            if(i.split(",")[0].equals(username))
            {
                return username;
            }
        }
        return null;
    }

    @Override
    public String getPassword(String username) {
        System.out.println("Sending SQL request for password");
        List<String> sql = SQLRequest();
        for (String i : sql) 
        {
            if(i.split(",")[0].equals(username))
            {
                return i.split(",")[1];
            }    
        }
        return null;
    }
    private List<String> SQLRequest()
    {
        List<String> ret = new ArrayList<String>();
        try(
        Connection conn = DriverManager.getConnection(
               "jdbc:mysql://localhost:3306/password?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
               "root", "hepl"); 
        ){
            ResultSet res = (conn.createStatement()).executeQuery("select * from password");

            
            while(res.next())
            {
                ret.add(res.getString("username")+","+res.getString("password"));
            }
        }catch(SQLException e)
        {
            System.out.println(e);
            System.exit(-1);
        }
        return ret;

    }
        
}
