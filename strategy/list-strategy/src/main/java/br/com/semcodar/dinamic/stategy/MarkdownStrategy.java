package br.com.semcodar.dinamic.stategy;

import static java.lang.System.lineSeparator;

public class MarkdownStrategy implements ListStrategy {

    @Override
    public void addListItem(StringBuilder sb, String item) {
        sb.append(" * ")
            .append(item)
            .append(lineSeparator());
    }
}
