package br.com.semcodar.dialog;

import br.com.semcodar.button.Button;
import br.com.semcodar.button.ButtonHtml;

public class DialogHtmlFactory extends Dialog {

    @Override
    protected Button createButton() {
        return new ButtonHtml();
    }
}
