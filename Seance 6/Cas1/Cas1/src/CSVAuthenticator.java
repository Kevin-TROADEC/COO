import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class CSVAuthenticator extends Authenticator
{

    private File f;
    public CSVAuthenticator(File f)
    {
        this.f =f;
    }
    
    @Override
    public String getLogin(String username) {
        System.out.println("Opening csv for username");
        try(
            BufferedReader reader = new BufferedReader(new FileReader(f));
        ){
        String line;
        while((line = reader.readLine())!=null )
        {
            String[] info = line.split(";");
            if(info[0].equals(username))
            {
                return username;
            }
        }
        }catch(Exception e)
        {
            System.out.println(e);
            System.exit(-1);
        }
        return null;
    }

    @Override
    public String getPassword(String username) {
        System.out.println("Opening csv for password");
        try(
            BufferedReader reader = new BufferedReader(new FileReader(f));
        ){
            String line;
            while((line = reader.readLine())!=null )
            {
                String[] info = line.split(";");
                if(info[0].equals(username))
                {
                    return info[1];
                }
            }
            
        }catch(Exception e)
        {
            System.out.println("");
            System.exit(-1);
        }
        return null;
    }
    
}
