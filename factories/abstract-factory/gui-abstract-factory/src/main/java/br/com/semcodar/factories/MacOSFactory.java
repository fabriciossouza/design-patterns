package br.com.semcodar.factories;

import br.com.semcodar.button.Button;
import br.com.semcodar.button.MacOSButton;
import br.com.semcodar.checkboxes.Checkbox;
import br.com.semcodar.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
