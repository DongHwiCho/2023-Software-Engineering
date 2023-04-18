public class FireDecorator implements PokemonDecorator{
    private Pokemon pokemon;

    public FireDecorator(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public void attack() {
        System.out.println("불대문자를 사용합니다.");
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
