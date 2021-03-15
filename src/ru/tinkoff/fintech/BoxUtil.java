package ru.tinkoff.fintech;

public class BoxUtil {

    /*
     * №1
     * Скопировать содержимое из одной коробки в другую
     * Box(dest) в которую будем копировать может быть типизирована любым родителем объекта содержащимся в Box(src)
     */
    public static <T> void copyFromBoxToBox(final Box<T> src, final Box<? super T> dest) {
        dest.put(src.get());
    }

    /*
     * №2
     * Скопировать содержимое из Box(src) которая может быть типизирована только классом Fruit и его наследниками,
     * при условии, что содержащийся фрукт свежий (fresh == true).
     * Box(dest) в которую будем копировать может быть типизирована любым родителем объекта содержащимся в Box(src)
     */

    public static <T extends Fruit> void copyFreshFruitFromBoxToBox(final Box<T> src, final Box<? super T> dest) {
        if (src.get() != null && src.get().isFresh()) {
            dest.put(src.get());
        }
    }

    /*
     * №3
     * Вывести в консоль (toString()) объект второй коробки
     */
    public static <T> void printElementFromTwoBoxes(final Box<T> box) {
        System.out.println(((Box<T>) box.get()).get().toString());
    }

    /*
     * №4
     * Вывести в консоль (toString()) объект последней коробки
     * <p>
     * box Box, которая содержит в себе любое кол-во вложенных Box, в последней из которых может быть любой объект.
     */
    public static <T> void printElementFromBoxes(final Box<T> box) {
        Box<T> tmp = box; //сделал так из-за CheckStyle
        while (tmp.get() instanceof Box) {
            tmp = (Box<T>) tmp.get();
        }
        System.out.println(tmp.get().toString());
    }
}
