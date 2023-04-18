public class ElectricDecorator implements PokemonDecorator{
    private Pokemon pokemon;

    public ElectricDecorator(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public void attack() {
        System.out.println("100만 볼트를 사용합니다!");
    }

    @Override
    public int getLevel() {
        return 0;
    }

    @Override
    public int getHP() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
}
