public enum Classes {
    Druid("Malfurion Stormrage"),
    Hunter("Rexxar", "Alleria Windrunner"),
    Mage("Jaina Proudmoor", "Medivh","Khadgar"),
    Paladin("Uther Lightbringer", "Lady Liadrin"), 
    Priest("Anduin Wrynn"), 
    Rogue("Valeera Sanguinar"), 
    Shaman("Thrall"), 
    Warlock("Gul'dan"), 
    Warrior("Garrosh Hellscream", "Magni Bronzebeard");

    private String[] heroNames;

    Classes(String... heroNames) {
        this.heroNames = heroNames;
    }

    public String [] getHeroNames() {
        return this.heroNames;
    }
}
