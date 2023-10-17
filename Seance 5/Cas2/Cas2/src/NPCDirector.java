public class NPCDirector 
{
    private INPCBuilder builder;
    public NPCDirector(INPCBuilder builder)
    {
        this.builder = builder;

    }
    public NPC getWeak(String nom)
    {
        builder.rest();
        builder.setApparence(1.5f);
        builder.setStat(9,9 , 9);
        builder.setRole();
        builder.setNameDesc(nom);

        return builder.getResult();
    }

    public NPC getStrong(String nom)
    {
        builder.rest();
        builder.setApparence(2.5f);
        builder.setStat(15,15 , 15);
        builder.setRole();
        builder.setNameDesc(nom + " elite");

        return builder.getResult();  
    }
    public NPC getMage(String nom)
    {
        builder.rest();
        builder.setApparence(1.5f);
        builder.setStat(18,12 , 5);
        builder.setRole("Mage","Baquette");
        builder.setNameDesc(nom + " le formidable");

        return builder.getResult(); 
    }
    public NPC getArcher(String nom)
    {
        builder.rest();
        builder.setApparence(1.8f);
        builder.setStat(10,14 , 13);
        builder.setRole("Archer","Arc");
        builder.setNameDesc(nom + " l' intrepide");

        return builder.getResult(); 
    }
}
