package ru.yrli.test.todoimage;

import javax.inject.Inject;


public interface SupplyMethods {

    void popSupply();

    void pushSupply(Object supply);

    void changeItemValue(Object Supply, int delta);
}
