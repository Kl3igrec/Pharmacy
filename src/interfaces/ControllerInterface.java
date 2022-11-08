package controllers;

import java.util.List;

public interface ControllerInterface<E> {

    List<E> getAll();
    List<E> sortedByName();
    boolean add();
    boolean remove();
    boolean update();
}
