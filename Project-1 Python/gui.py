from abc import ABC, abstractmethod

# Abstract Factory
class AbstractFactoryGUI(ABC):
    @abstractmethod
    def create_panel(self):
        pass

    @abstractmethod
    def create_button(self):
        pass

    @abstractmethod
    def create_textbox(self):
        pass

# Concrete Factories for each Word generation
class ConcreteFactoryWord90(AbstractFactoryGUI):
    def create_panel(self):
        return Word90Panel()

    def create_button(self):
        return Word90Button()

    def create_textbox(self):
        return Word90Textbox()

class ConcreteFactoryWord00(AbstractFactoryGUI):
    def create_panel(self):
        return Word00Panel()

    def create_button(self):
        return Word00Button()

    def create_textbox(self):
        return Word00Textbox()

class ConcreteFactoryWord10(AbstractFactoryGUI):
    def create_panel(self):
        return Word10Panel()

    def create_button(self):
        return Word10Button()

    def create_textbox(self):
        return Word10Textbox()

class ConcreteFactoryWord24(AbstractFactoryGUI):
    def create_panel(self):
        return Word24Panel()

    def create_button(self):
        return Word24Button()

    def create_textbox(self):
        return Word24Textbox()

# Abstract GUI Components
class AbstractPanel(ABC):
    pass

class AbstractButton(ABC):
    pass

class AbstractTextbox(ABC):
    pass

# Concrete GUI Components for each Word generation
class Word90Panel(AbstractPanel):
    pass

class Word90Button(AbstractButton):
    pass

class Word90Textbox(AbstractTextbox):
    pass

class Word00Panel(AbstractPanel):
    pass

class Word00Button(AbstractButton):
    pass

class Word00Textbox(AbstractTextbox):
    pass

class Word10Panel(AbstractPanel):
    pass

class Word10Button(AbstractButton):
    pass

class Word10Textbox(AbstractTextbox):
    pass

class Word24Panel(AbstractPanel):
    pass

class Word24Button(AbstractButton):
    pass

class Word24Textbox(AbstractTextbox):
    pass

# Singleton variation to ensure at most two instances of each generation in each test run
class GenerationManager:
    _instances = {}

    def get_instance(self, generation):
        if generation not in self._instances:
            self._instances[generation] = 0

        if self._instances[generation] < 2:
            self._instances[generation] += 1
            return True
        else:
            return False

# Example usage
def run_test(configuration_file):
    manager = GenerationManager()

    with open(configuration_file, 'r') as file:
        for line in file:
            generation = line.strip()  # Assuming the configuration file contains one generation per line

            if manager.get_instance(generation):
                factory = globals()[f'ConcreteFactory{generation}']()
                panel = factory.create_panel()
                button = factory.create_button()
                textbox = factory.create_textbox()

                print(f"Panel {generation}")
                print(f"Button {generation}")
                print(f"Textbox {generation}")

            else:
                print(f"Warning: Generation {generation} is asked to run more than twice.")

# Example test run
run_test("configuration.txt")
