public class BasicPokemon implements Pokemon{
    private String name;
    private int level;
    private int hp;

    public BasicPokemon(String name, int level, int hp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
    }

    @Override
    public void attack() {
        System.out.println("공격 개시");
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public int getHP() {
        return hp;
    }

    @Override
    public String getName() {
        return name;
    }
}
