package br.com.semcodar.nodinamic.text;

import br.com.semcodar.dinamic.stategy.ListStrategy;

import java.util.List;
import java.util.function.Supplier;

public class TextProcessor<LS extends ListStrategy> {

    private StringBuilder sb = new StringBuilder();
    private LS listStrategy;

    public TextProcessor(Supplier<? extends LS> ctor) {
        listStrategy = ctor.get();
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