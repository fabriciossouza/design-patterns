package br.com.semcodar;

import br.com.semcodar.product.IHotDrink;
import br.com.semcodar.product.enums.AvailableDrink;
import br.com.semcodar.product.factory.IHotDrinkFactory;
import org.javatuples.Pair;
import org.reflections.Reflections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.server.ExportException;
import java.util.*;

import static br.com.semcodar.product.enums.AvailableDrink.values;
import static java.lang.Class.forName;
import static java.lang.Integer.parseInt;
import static java.lang.String.format;
import static java.lang.System.out;
import static org.apache.commons.lang3.StringUtils.capitalize;

public class HotDrinkMachine {

    private final static String PACKAGE_FACTORY = "br.com.semcodar.product.factory";

    private Map<AvailableDrink, IHotDrinkFactory> factories = new HashMap<>();

    private List<Pair<String, IHotDrinkFactory>> namedFactories = new ArrayList<>();

    public HotDrinkMachine() throws Exception {

        // option 1: use an enum
        for (AvailableDrink availableDrink : values()) {

            var name = availableDrink.toString().toLowerCase();
            var nameFactory = capitalize(name);

            var factory = forName(format("%s.%sFactory",PACKAGE_FACTORY, nameFactory));
            var drink = (IHotDrinkFactory) factory.getDeclaredConstructor().newInstance();

            factories.put(availableDrink, drink);
        }

        // option 2: find all implementors of IHotDrinkFactory
        var types = new Reflections(PACKAGE_FACTORY)
                .getSubTypesOf(IHotDrinkFactory.class);

        for (Class<? extends IHotDrinkFactory> type : types) {

            var drink = type.getSimpleName().replace("Factory", "");
            var drinkFactory = type.getDeclaredConstructor().newInstance();

            var map = new Pair<>(drink, drinkFactory);

            namedFactories.add(map);
        }
    }

    public IHotDrink makeDrink(AvailableDrink drink, int ammout) {
        return factories.get(drink).prepare(ammout);
    }

    public IHotDrink makeDrink() throws IOException {

        int drinkSize = namedFactories.size();

        var reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {

            out.println("Available drinks");

            for (int i = 0; i < namedFactories.size(); i++) {
                var item = namedFactories.get(i);
                out.println(format("%d: %s", i, item.getValue0()));
            }

            try {

                var command = reader.readLine();
                int drink = parseInt(command);
                int amout;

                if (command != null && drink >= 0 && drink < drinkSize) {

                    out.println("Spacify amount:");

                    command = reader.readLine();
                    amout = parseInt(command);

                    if (command != null && amout > 0) {

                        return namedFactories.get(drink)
                                .getValue1()
                                .prepare(amout);

                    }

                    throw new ExportException("Incorrect input, try again.");
                }

                throw new ExportException("Incorrect input, try again.");

            } catch (Exception e) {
                out.println(e.getMessage());
            }
        }
    }
}
