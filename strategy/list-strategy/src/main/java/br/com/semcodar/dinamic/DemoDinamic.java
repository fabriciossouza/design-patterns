package br.com.semcodar.dinamic;

import br.com.semcodar.dinamic.text.TextProcessor;

import java.util.List;

import static br.com.semcodar.dinamic.text.OutputFormat.HTML;
import static br.com.semcodar.dinamic.text.OutputFormat.MARKDOWN;

public class DemoDinamic {

    public static void main(String...args) {

        final var textProcessor = new TextProcessor(MARKDOWN);

        textProcessor.appendList(List.of("text1", "text2", "text3"));
        System.out.println(textProcessor);

        textProcessor.clear();
        textProcessor.setOutFormat(HTML);
        textProcessor.appendList(List.of("text1", "text2", "text3"));
        System.out.println(textProcessor);


    }
}
