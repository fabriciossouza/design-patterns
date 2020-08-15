package br.com.semcodar.app;

import br.com.semcodar.button.Button;
import br.com.semcodar.checkboxes.Checkbox;
import br.com.semcodar.factories.GUIFactory;
import br.com.semcodar.factories.MacOSFactory;
import br.com.semcodar.factories.WindowsFactory;

import static java.lang.System.getProperty;

public class Application {

    private Button button;
    private Checkbox checkbox;

    private Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }

    public static Application getApplication() {

        final String osName = getProperty("os.name").toLowerCase();
        if (osName.contains("mac"))
            return new Application(new MacOSFactory());

        return new Application(new WindowsFactory());
    }
}
