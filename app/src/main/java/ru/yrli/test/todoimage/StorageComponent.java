package ru.yrli.test.todoimage;

import dagger.Component;

@Component
public interface StorageComponent {

    Storage getStorage();
}
