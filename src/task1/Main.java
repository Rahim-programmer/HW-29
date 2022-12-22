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
        System.out.println("В данной таблице выполнена сортировка по имени. \n\n");

        cats.sort(Comparator.comparing(Cat::getAge));
        Printer.print(cats);
        System.out.println("В данной таблице выполнена сортировка по возрасту. \n\n");

        cats.sort(Comparator.comparing(Cat::getBreed));
        Printer.print(cats);
        System.out.println("В данной таблице выполнена сортировка по -Breed-\n\n");

        cats.sort(Comparator.comparing(Cat::getColor));
        cats.removeIf(cats1 -> cats1.getColor().equals(Cat.Color.GRAY));
        Printer.print(cats);

        cats.removeIf(cats2 -> cats2.getName().length()==5);
        System.out.println("В данной таблице показаны коты у которых длина имени меньше 5 символов:\n\n");
        Printer.print(cats);

    }
}
