public class App {
    public static void main(String[] args) throws Exception {
        
        NPCDirector monsterMaker = new NPCDirector(new MonsterBuilder());
        NPCDirector humanMaker = new NPCDirector(new HumanBuilder()); 

        System.out.println("-------------List de monstre-------------");
        monsterMaker.getWeak("Peiti loup").afficher();
        monsterMaker.getArcher("Archer Diabolique").afficher();
        monsterMaker.getMage("Mage Diabolique").afficher();
        monsterMaker.getStrong("Le Demon").afficher();
        System.out.println("");
        System.out.println("-------------List de hero-------------");
        humanMaker.getWeak("Tom").afficher();
        humanMaker.getArcher("Martin").afficher();
        humanMaker.getMage("Marque").afficher();
        humanMaker.getStrong("Lucas").afficher();

    }
}
