public class Trainer {
    private Battleable battleable;

    public Trainer(Battleable battleable) {
        this.battleable = battleable;
    }

    public void catchPokemon() {
        System.out.println("신난다! 포켓몬을 잡았다!");
    }

    public void battle() {
        battleable.attack();
    }
}
