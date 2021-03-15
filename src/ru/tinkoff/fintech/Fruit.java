package ru.tinkoff.fintech;

public class Fruit {
    private boolean fresh = true;

    /**
     * @return свежесть фрукта.
     */
    public boolean isFresh() {
        return fresh;
    }

    /**
     * @param fresh свежесть фрукта.
     */
    public void setFresh(final boolean fresh) {
        this.fresh = fresh;
    }


    /**
     * @return название фрукта.
     */
    @Override
    public String toString() {
        return "Different Fruit";
    }


}
