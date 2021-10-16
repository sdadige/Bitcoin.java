package app;

import bitcoin.Bitcoin;
import checkboxes.Checkbox;
import factories.GUIFactory;

// Factory users work with factories and products through abstract interfaces.

public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}

