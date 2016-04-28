public class Player {
    private String name;
    private Classes heroClass;
    private String heroName;
    private String color;

    public Player(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Classes getHeroClass() {
        return heroClass;
    }

    public void setHeroClass(Classes heroClass) {
        this.heroClass = heroClass;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getColor() {
        return color;
    }
}
