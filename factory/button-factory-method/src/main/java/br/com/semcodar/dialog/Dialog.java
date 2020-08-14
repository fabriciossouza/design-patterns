package br.com.semcodar.dialog;

import br.com.semcodar.button.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button button = createButton();
        button.render();

    }

    protected abstract Button createButton();

}
