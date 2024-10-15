package ad231.neryanov.carshop.cars;

/**
 * Класс Ford представляет автомобиль марки Ford, который является подклассом Car.
 * Добавляет уникальные поля для года выпуска и скидки производителя, а также переопределяет метод расчета цены.
 *
 * @author [Vlad Neryanov]
 * @version 1.0 10 Oct 2024
 */
public class Ford extends Car {
    private int year;  // Год выпуска автомобиля
    private int manufacturerDiscount;  // Скидка производителя в денежных единицах

    /**
     * Конструктор для создания экземпляра Ford.
     *
     * @param speed максимальная скорость автомобиля
     * @param isSellOut флаг распродажи автомобиля
     * @param regularPrice регулярная цена автомобиля
     * @param color цвет автомобиля
     * @param year год выпуска автомобиля
     * @param manufacturerDiscount скидка производителя
     */
    public Ford(int speed, boolean isSellOut, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, isSellOut, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    /**
     * Метод для получения итоговой цены автомобиля.
     * Цена уменьшается на сумму скидки производителя.
     *
     * @return цена автомобиля с учетом скидки производителя
     */
    @Override
    public double getSalePrice(){
        return regularPrice - manufacturerDiscount;
    }
}
