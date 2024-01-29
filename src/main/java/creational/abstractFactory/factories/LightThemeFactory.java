package creational.abstractFactory.factories;

import creational.abstractFactory.Button;
import creational.abstractFactory.DefaultButton;
import creational.abstractFactory.DefaultInput;
import creational.abstractFactory.Input;

public class LightThemeFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new DefaultButton();
    }

    @Override
    public Input createInput() {
        return new DefaultInput();
    }
}
