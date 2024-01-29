package creational.abstractFactory.factories;

import creational.abstractFactory.*;

public class DarkThemeFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Input createInput() {
        return new DarkInput();
    }
}
