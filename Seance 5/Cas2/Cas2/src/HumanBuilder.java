import java.awt.Color;

public class HumanBuilder implements INPCBuilder {

    private NPC npc;

    @Override
    public void rest() {
        npc = new NPC();
    }

    @Override
    public NPC getResult() {
        return npc;
    }

    @Override
    public void setApparence(float tail) {
        npc.tail = tail;
        npc.yeuxColor = Color.blue;
        npc.peauColor = Color.pink;
    }

    @Override
    public void setStat(int i,int f, int d) 
    {
        npc.inteligence =i;
        npc.force = f;
        npc.dexterite = d;

    }

    @Override
    public void setRole() {
        npc.role = "Villageaux";
    }

    @Override
    public void setRole(String r, String arme) {
        npc.role = r;
        npc.arme = arme;
    }

    @Override
    public void setNameDesc(String nom) {
        npc.desc = "Un humain normal :)";
        npc.nom = nom;
    }
    
    
}
