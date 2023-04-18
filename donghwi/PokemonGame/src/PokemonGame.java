public class PokemonGame {
    public static void main(String[] args) {
        System.out.println("포켓몬스터 인하 게임을 시작합니다.");

        Pokemon pikachu = new Pikachu("피카츄", 5, 30, new Thunderbolt(), new NoFly());
        Pokemon charizard = new Charizard("리자몽", 30, 125, new Flamethrower(), new Wings());
        Pokemon squirtle = new Squirtle("꼬북이", 5, 30, new BubbleBeam(), new NoFly());

        pikachu.performAttack(charizard);
        charizard.performAttack(pikachu);
        squirtle.performAttack(charizard);

        pikachu.performFly();

        charizard.performAttack(squirtle);
        charizard.evolve();
        charizard.performFly();

        charizard.performAttack(pikachu);
        squirtle.evolve();
        squirtle.performAttack(charizard);

        System.out.println("게임을 종료합니다!");
    }
}
