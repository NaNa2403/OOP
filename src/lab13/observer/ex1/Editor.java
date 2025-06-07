package lab13.observer;

// Application-specific Publisher
class Editor {
    public EventManager events;
    private String filename;

    public Editor() {
        this.events = new EventManager("open", "save");
    }

    public void openFile(String filename) {
        this.filename = filename;
        events.notify("open", filename);
    }

    public void saveFile() {
        events.notify("save", filename);
    }
}
