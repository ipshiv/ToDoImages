package ru.yrli.test.todoimage;

import javax.inject.Inject;

public class FifoSupplyMethod implements SupplyMethods {
    @Inject
    public void popSupply() {

    }
    @Inject
    public void pushSupply(Object supply) {

    }
    @Inject
    public void changeItemValue(Object Supply, int delta) {

    }
}
