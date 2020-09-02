package br.com.semcodar.factories;

import br.com.semcodar.button.Button;
import br.com.semcodar.button.WindowsButton;
import br.com.semcodar.checkboxes.Checkbox;
import br.com.semcodar.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
