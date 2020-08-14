package br.com.semcodar.dialog;

import br.com.semcodar.button.Button;
import br.com.semcodar.button.ButtonMac;

public class DialogMacFactory extends Dialog {

    @Override
    protected Button createButton() {
        return new ButtonMac();
    }
}
