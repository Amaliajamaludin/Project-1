import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        runTest("window.txt");
    }

    public static void runTest(String configurationFile) {
        GenerationManager manager = GenerationManager.getInstance();

        try (BufferedReader reader = new BufferedReader(new FileReader(configurationFile))) {
            String generation;
            while ((generation = reader.readLine()) != null) {
                generation = generation.trim(); // Assuming the configuration file contains one generation per line

                if (manager.getInstance(generation)) {
                    AbstractFactoryGUI factory = createFactory(generation);
                    AbstractPanel panel = factory.createPanel();
                    AbstractButton button = factory.createButton();
                    AbstractTextbox textbox = factory.createTextbox();

                    System.out.println("Panel " + generation);
                    System.out.println("Button " + generation);
                    System.out.println("Textbox " + generation);

                } else {
                    System.out.println("Warning: Generation " + generation + " is asked to run more than twice.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static AbstractFactoryGUI createFactory(String generation) {
        switch (generation) {
            case "Word90":
                return new ConcreteFactoryWord90();
            case "Word00":
                return new ConcreteFactoryWord00();
            case "Word10":
                return new ConcreteFactoryWord10();
            case "Word24":
                return new ConcreteFactoryWord24();
            default:
                throw new IllegalArgumentException("Invalid generation: " + generation);
        }
    }
}
