package session15.challenges.enums;

public enum LightColor {

    RED("Stop", 30),
    YELLOW("Caution", 5),
    GREEN("Go", 45);

    private String description;
    private int durationInSeconds;

    LightColor(String description, int durationInSeconds) {
        this.description = description;
        this.durationInSeconds = durationInSeconds;
    }

    public String getDescription() {
        return description;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }
}