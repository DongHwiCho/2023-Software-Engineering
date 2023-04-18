public class KoreanSubscriber implements Subscriber{
    private String name;
    private int value;
    private Subject subject;

    public KoreanSubscriber(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
        subject.registerSubscriber(this);
    }

    @Override
    public void update() {
        this.value = subject.getPrice();
        System.out.println(name + "님 몬스터볼의 가격이 " + value + "으로 변경되었습니다.");
    }
}
