import java.awt.Color;
public interface INPCBuilder {
    public void rest();
    public NPC getResult();
    public void setApparence(float tail);
    public void setStat(int i, int d, int f);
    public void setRole();
    public void setRole(String r, String arme);
    public void setNameDesc(String nom );
}
