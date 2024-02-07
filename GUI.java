
// Abstract Factory
interface AbstractFactoryGUI {
    AbstractPanel createPanel();
    AbstractButton createButton();
    AbstractTextbox createTextbox();
}

// Concrete Factories for each Word generation
class ConcreteFactoryWord90 implements AbstractFactoryGUI {
    public AbstractPanel createPanel() {
        return new Word90Panel();
    }

    public AbstractButton createButton() {
        return new Word90Button();
    }

    public AbstractTextbox createTextbox() {
        return new Word90Textbox();
    }
}

class ConcreteFactoryWord00 implements AbstractFactoryGUI {
    public AbstractPanel createPanel() {
        return new Word00Panel();
    }

    public AbstractButton createButton() {
        return new Word00Button();
    }

    public AbstractTextbox createTextbox() {
        return new Word00Textbox();
    }
}

class ConcreteFactoryWord10 implements AbstractFactoryGUI {
    public AbstractPanel createPanel() {
        return new Word10Panel();
    }

    public AbstractButton createButton() {
        return new Word10Button();
    }

    public AbstractTextbox createTextbox() {
        return new Word10Textbox();
    }
}

class ConcreteFactoryWord24 implements AbstractFactoryGUI {
    public AbstractPanel createPanel() {
        return new Word24Panel();
    }

    public AbstractButton createButton() {
        return new Word24Button();
    }

    public AbstractTextbox createTextbox() {
        return new Word24Textbox();
    }
}

// Abstract GUI Components
interface AbstractPanel {}

interface AbstractButton {}

interface AbstractTextbox {}

// Concrete GUI Components for each Word generation
class Word90Panel implements AbstractPanel {}

class Word90Button implements AbstractButton {}

class Word90Textbox implements AbstractTextbox {}

class Word00Panel implements AbstractPanel {}

class Word00Button implements AbstractButton {}

class Word00Textbox implements AbstractTextbox {}

class Word10Panel implements AbstractPanel {}

class Word10Button implements AbstractButton {}

class Word10Textbox implements AbstractTextbox {}

class Word24Panel implements AbstractPanel {}

class Word24Button implements AbstractButton {}

class Word24Textbox implements AbstractTextbox {}

// Singleton variation to ensure at most two instances of each generation in each test run
class GenerationManager {
    private static final GenerationManager instance = new GenerationManager();
    private final java.util.Map<String, Integer> instances = new java.util.HashMap<>();

    private GenerationManager() {}

    public static GenerationManager getInstance() {
        return instance;
    }

    public boolean getInstance(String generation) {
        instances.putIfAbsent(generation, 0);
        if (instances.get(generation) < 2) {
            instances.put(generation, instances.get(generation) + 1);
            return true;
        } else {
            return false;
        }
    }
}

// Client
class Client {
    private AbstractPanel abstractPanel;
    private AbstractButton abstractButton;
    private AbstractTextbox abstractTextbox;

    // Constructor
    public Client(AbstractFactoryGUI factory) {
        abstractPanel = factory.createPanel();
        abstractButton = factory.createButton();
        abstractTextbox = factory.createTextbox();
    }

    public void run() {
        // Use abstractPanel, abstractButton, and abstractTextbox as needed
    }
}

