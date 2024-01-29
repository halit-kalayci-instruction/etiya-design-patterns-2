package creational.abstractFactory.factories;

import creational.abstractFactory.Button;
import creational.abstractFactory.DefaultButton;
import creational.abstractFactory.DefaultInput;
import creational.abstractFactory.Input;

public interface UIFactory {
    Button createButton();
    Input createInput();
}
