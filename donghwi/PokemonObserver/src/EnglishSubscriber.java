public class EnglishSubscriber implements Subscriber{
    private String name;
    private int value;
    private Subject subject;

    public EnglishSubscriber(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
        subject.registerSubscriber(this);
    }

    @Override
    public void update() {
        this.value = subject.getPrice();
        System.out.println("Mr/Mrs." + name + ", MonsterBall Price is " + value + " now.");
    }
}
