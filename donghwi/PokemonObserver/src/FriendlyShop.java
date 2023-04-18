public class FriendlyShop {
    public static void main(String[] args) {
        LandCh monsterBall = new LandCh();

        Subscriber pikachu = new KoreanSubscriber("피카츄", monsterBall);
        Subscriber squirtle = new KoreanSubscriber("꼬북이", monsterBall);

        monsterBall.setPrice(5000);

        Subscriber Charizard = new EnglishSubscriber("Charizard", monsterBall);

        monsterBall.setPrice(7000);

        monsterBall.removeSubscriber(squirtle);

        monsterBall.setPrice(3000);
    }
}
