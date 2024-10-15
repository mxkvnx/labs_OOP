package ad231.neryanov.carshop.cars;

/**
 * Класс Sedan представляет седан, который является подклассом Car.
 * Добавляет уникальное поле длины и переопределяет метод расчета
 * итоговой цены в зависимости от длины автомобиля.
 *
 * @author [Vlad Neryanov]
 * @version 1.0 10 Oct 2024
 */
public class Sedan extends Car {
    private int length;  // Длина автомобиля в футах

    /**
     * Конструктор для создания экземпляра седана.
     *
     * @param speed максимальная скорость автомобиля
     * @param isSellOut флаг распродажи автомобиля
     * @param regularPrice регулярная цена автомобиля
     * @param color цвет автомобиля
     * @param length длина автомобиля
     */
    public Sedan(int speed, boolean isSellOut, double regularPrice, String color, int length) {
        super(speed, isSellOut, regularPrice, color);
        this.length = length;
    }

    /**
     * Метод для получения итоговой цены автомобиля.
     * Если длина седана больше 20 футов, применяется скидка 5%.
     *
     * @return цена автомобиля с учетом скидки (если применимо)
     */
    @Override
    public double getSalePrice() {
        if (length > 20) {
            return regularPrice * 0.95;
        } else {
            return regularPrice;
        }
    }
}
