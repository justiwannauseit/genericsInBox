package ru.tinkoff.fintech;

public class Box<T> {

    private T element;

    /**
     * @param value обьект, который возможно положить в коробку.
     */
    public void put(final T value) {
        this.element = value;
    }

    /**
     * @return содержисое коробки.
     */
    public T get() {
        return element;
    }

    /**
     * @return название типа и содержимого коробки.
     */
    @Override
    public String toString() {
        return "Box{" + "element=" + element + '}';
    }
}
