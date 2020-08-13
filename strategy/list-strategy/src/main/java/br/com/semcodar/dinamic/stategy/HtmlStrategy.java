package br.com.semcodar.dinamic.stategy;

import static java.lang.System.lineSeparator;

public class HtmlStrategy implements ListStrategy {

    @Override
    public void start(StringBuilder sb) {
        sb.append("<ul>")
            .append(lineSeparator());
    }

    @Override
    public void addListItem(StringBuilder sb, String item) {
        sb.append(" <li>")
            .append(item)
            .append("</li>")
            .append(lineSeparator());
    }

    @Override
    public void end(StringBuilder sb) {
        sb.append("</ul>")
            .append(lineSeparator());
    }
}
