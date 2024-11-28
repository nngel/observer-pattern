public interface NewsAgencySubject {
    void notifySubscribers(String news);
    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);

}