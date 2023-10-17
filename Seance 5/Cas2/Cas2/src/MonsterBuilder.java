import java.awt.Color;

public class MonsterBuilder implements INPCBuilder {

    private NPC npc;

    @Override
    public void rest() 
    {
        npc = new NPC();    
    }

    @Override
    public NPC getResult() {
        return npc;
    }

    @Override
    public void setApparence(float tail) {
        npc.tail = tail;
        npc.yeuxColor = Color.red;
        npc.peauColor = Color.green;
    }


    @Override
    public void setStat(int i,int f, int d) {
        npc.inteligence = i;
        npc.dexterite = f;
        npc.force = d;
    }


    @Override
    public void setRole() {
        npc.role = "Monstre";
        npc.arme = "";
    }

    @Override
    public void setRole(String r, String arme) {
        npc.role = r;
        npc.arme = arme;
    }
    @Override
    public void setNameDesc(String nom) {
        npc.desc = "Un monstre mechant >:[";
        npc.nom = nom;
    }

    
}
