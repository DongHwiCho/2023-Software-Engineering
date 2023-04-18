import java.util.ArrayList;
import java.util.List;

public class LandCh implements Subject{
    private int price;

    List<Subscriber> subscribers;

    public LandCh() {
        subscribers = new ArrayList<>();
    }

    @Override
    public void registerSubscriber(Subscriber s) {
        subscribers.add(s);
    }

    @Override
    public void removeSubscriber(Subscriber s) {
        subscribers.remove(s);
    }

    @Override
    public void notifySubscriber() {
        subscribers.forEach(s -> s.update());
        System.out.print("\n");
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
        notifySubscriber();
    }
}
