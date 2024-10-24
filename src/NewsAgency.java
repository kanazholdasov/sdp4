import java.util.ArrayList;
import java.util.List;

class NewsAgency implements Observable {
    private List<Observer> observers = new ArrayList<>();
    private String latestHeadline;

    public void setLatestHeadline(String headline) {
        this.latestHeadline = headline;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(latestHeadline);
        }
    }
}
