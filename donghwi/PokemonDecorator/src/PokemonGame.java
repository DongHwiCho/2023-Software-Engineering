public class PokemonGame {
    public static void main(String[] args) {
        Pokemon rotomoo = new BasicPokemon("로토무", 5, 30);

        rotomoo.attack();
        rotomoo = new FireDecorator(rotomoo);
        rotomoo.attack();
        rotomoo = new ElectricDecorator(rotomoo);
        rotomoo.attack();
    }
}
