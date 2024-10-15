package ad231.neryanov.carshop.cars;

/**
 * Класс Truck представляет грузовой автомобиль, который является подклассом Car.
 * Добавляет уникальное поле для веса автомобиля и переопределяет метод расчета цены на основе веса.
 *
 * @author [Vlad Neryanov]
 * @version 1.0 10 Oct 2024
 */
public class Truck extends Car {
    private int weight;  // Вес грузовика

    /**
     * Конструктор для создания экземпляра Truck.
     *
     * @param speed максимальная скорость грузовика
     * @param isSellOut флаг распродажи
     * @param regularPrice регулярная цена грузовика
     * @param color цвет грузовика
     * @param weight вес грузовика
     */
    public Truck(int speed, boolean isSellOut, double regularPrice, String color, int weight) {
        super(speed, isSellOut, regularPrice, color);
        this.weight = weight;
    }

    /**
     * Метод для получения итоговой цены грузовика.
     * Если вес грузовика больше 2000 кг, предоставляется скидка 10%.
     *
     * @return цена грузовика с учетом скидки по весу
     */
    @Override
    public double getSalePrice() {
        if (weight > 2000) {
            return regularPrice * 0.9;
        } else {
            return regularPrice;
        }
    }
}
