package br.com.semcodar.factories;

import br.com.semcodar.button.Button;
import br.com.semcodar.checkboxes.Checkbox;

public interface GUIFactory {

    Button createButton();
    Checkbox createCheckbox();
}
