package lab13.observer;// Publisher class
import java.util.*;

class EventManager {
    private Map<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager(String... operations) {
        for (String op : operations) {
            listeners.put(op, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener listener) {
        listeners.get(eventType).add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        listeners.get(eventType).remove(listener);
    }

    public void notify(String eventType, String filename) {
        for (EventListener listener : listeners.get(eventType)) {
            listener.update(eventType, filename);
        }
    }
}