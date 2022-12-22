package task2;

import task2.ActiveCat;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // исправьте код так, что бы на экран выводилось что-то вроде.
        // Я Misty. Я прыгаю!
        // Я Tibbles. Я сплю!
        // Я Ginger. Я кушаю!
        // для решения примените лямбда-выражения, 
        
        // каждый кот должен уметь выполнять что-то своё
        var cats = new ArrayList<ActiveCat>();


        cats.add(new ActiveCat(???));
        cats.add(new ActiveCat(???));
        cats.add(new ActiveCat(???));
        // добавьте ещё два-три кота, с совершенно другими действиями
        cats.forEach(ActiveCat::doAction);
    }
    public static String sleep(){
        return "Я сплю ";
    }

    public static String ran(){
        return "Я бегаю";
    }

    public static String play(){
        return "Я играю";
    }

}
