package by.dmitrykyz.tasks1.logic.sort;

import by.dmitrykyz.tasks1.factory.entity.Flower;

import java.util.Comparator;

/**
 * Created by Dmitry on 10/11/2016.
 */
public class SortByColor implements Comparator<Flower> {
    @Override
    public int compare(Flower o1, Flower o2) {
        return o1.getColor().compareTo(o2.getColor());
    }
}
