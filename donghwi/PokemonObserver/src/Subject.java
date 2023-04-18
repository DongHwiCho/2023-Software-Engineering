public interface Subject {
    public void registerSubscriber(Subscriber s);
    public void removeSubscriber(Subscriber s);
    public void notifySubscriber();
    int getPrice();
}
