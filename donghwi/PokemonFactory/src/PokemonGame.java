public class PokemonGame {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon();
        Trainer ash = new Trainer(pikachu);

        ash.catchPokemon();
        ash.battle();
    }
}
