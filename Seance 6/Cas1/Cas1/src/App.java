import java.util.Scanner;
import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Give password and username (CSV)");
        Authenticator AuCSV = new CSVAuthenticator(new File("Cas1/src/Passwd.csv"));
        String passwd,user;
        do{
        System.out.print("Username : ");
        Scanner scan = new Scanner(System.in);
        user = scan.nextLine();

        System.out.print("Password : ");
        passwd = scan.nextLine();
        }while(!AuCSV.authenticate(user, passwd));

        System.out.println("Give password and username (SQL)");
        Authenticator AuSQL = new SQLAuthenticator();
        do{
        System.out.print("Username : ");
        Scanner scan = new Scanner(System.in);
        user = scan.nextLine();

        System.out.print("Password : ");
        passwd = scan.nextLine();
        }while(!AuSQL.authenticate(user, passwd));
    }
}
