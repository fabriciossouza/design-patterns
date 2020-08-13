package br.com.semcodar.nodinamic;

import br.com.semcodar.dinamic.stategy.HtmlStrategy;
import br.com.semcodar.dinamic.stategy.MarkdownStrategy;
import br.com.semcodar.nodinamic.text.TextProcessor;

import java.util.List;

import static java.lang.System.out;

public class DemoNodinamic {

    public static void main(String...args) {

        final var textProcessor1 = new TextProcessor<>(MarkdownStrategy::new);
        textProcessor1.appendList(List.of("text1", "text2", "text3"));
        out.println(textProcessor1);

        final var textProcessor2 = new TextProcessor<>(HtmlStrategy::new);
        textProcessor2.appendList(List.of("text1", "text2", "text3"));
        out.println(textProcessor2);

    }
}
