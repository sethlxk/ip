package duke.entity;

public class Event extends Task {
    protected String at;
    public Event(String description, String at) {
        super(description);
        this.at = at;
    }
    public String toString() {
        return "[E]" + super.toString() + " (at: " + at + ")";
    }
}
