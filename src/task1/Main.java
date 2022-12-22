package task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        var cats = Cat.makeCats(10);
        Printer.print(cats);
        cats.sort(Comparator.comparing(Cat::getName));
        Printer.print(cats);

        cats.sort(Comparator.comparing(Cat::getAge));
        Printer.print(cats);

        cats.sort(Comparator.comparing(Cat::getBreed));
        Printer.print(cats);

        cats.sort(Comparator.comparing(Cat::getColor));
        cats.removeIf(cats1 -> cats1.getColor().equals(Cat.Color.GRAY));
        Printer.print(cats);
        
    }


}
