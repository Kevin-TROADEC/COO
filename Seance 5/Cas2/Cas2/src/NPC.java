import java.awt.Color;

public class NPC 
{
    public String nom;
    public int inteligence;
    public int dexterite;
    public int force;
    public String desc;
    public Color yeuxColor;
    public Color peauColor;
    public float tail;
    public String role;
    public String arme;

    public NPC()
    {
        nom = "Default name";

        inteligence = 10;
        dexterite = 10;
        force = 10;

        desc = "Description par defaut";
        yeuxColor = new Color(0f, 0f,0f,1f);
        peauColor = new Color(0f, 0f,0f,1f);

        role = "N/A";
        arme = "";
    }
    public void afficher()
    {
        System.out.println(nom + " : ");
        System.out.println("    Stat : Int("+inteligence+"), Dex("+dexterite+"), For("+force+")");
        System.out.println("    Apparence : Yeux"+yeuxColor.toString()+" , Peaux : "+peauColor.toString()+", Tail : "+tail);
        System.out.println("    Role:"+role+" Arme : "+arme);
        System.out.println(desc);
        System.out.println("");
    }

}
