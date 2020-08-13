package br.com.semcodar.dinamic.text;

import br.com.semcodar.dinamic.stategy.HtmlStrategy;
import br.com.semcodar.dinamic.stategy.ListStrategy;
import br.com.semcodar.dinamic.stategy.MarkdownStrategy;

import java.util.List;

public class TextProcessor {

    private StringBuilder sb = new StringBuilder();
    private ListStrategy listStrategy;

    public TextProcessor(OutputFormat format) {
        setOutFormat(format);
    }

    public void setOutFormat(OutputFormat format) {
        switch (format){
            case  MARKDOWN:
                listStrategy = new MarkdownStrategy();
                break;
            case HTML:
                listStrategy = new HtmlStrategy();
                break;
        }
    }

    public void appendList(List<String> itens){
        listStrategy.start(sb);
        itens.forEach( item -> listStrategy.addListItem(sb, item));
        listStrategy.end(sb);
    }

    public void clear(){
        sb.setLength(0);
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}