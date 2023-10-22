package session15.challenges.enums.traffic_light_system;

public class LightSystem {

    public static void main(String[] args) {
        printLightsColor(LightColors.GREEN);
        printLightsColor(LightColors.RED);
        printLightsColor(LightColors.YELLOW);
    }

    private static void printLightsColor(LightColors color) {
        switch (color) {
            case GREEN -> System.out.println("Go");
            case RED -> System.out.println("Stop");
            case YELLOW -> System.out.println("Caution");
        }
    }
}