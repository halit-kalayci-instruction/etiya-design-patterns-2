package creational.abstractFactory;

import creational.abstractFactory.factories.DarkThemeFactory;
import creational.abstractFactory.factories.LightThemeFactory;
import creational.abstractFactory.factories.UIFactory;

public class Main {
    public static void main(String[] args) {
        UIFactory uiFactory = new DarkThemeFactory();

        Button button = uiFactory.createButton();

        Input input = uiFactory.createInput();

        uiFactory = new LightThemeFactory();

        Button button1 = uiFactory.createButton();

        System.out.println("**");
    }
}
