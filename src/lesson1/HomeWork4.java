package lesson1;

public class HomeWork4 {
    /*
    * Даны переменные:
- деньги которые у нас есть - 1000 рублей
- стоимость пиццы - 230 рублей
- стоимость жвачки - 26 рублей
- стоимость конфеты - 2,5 рубля
Задача: представим себе что мы зашли в магазин, и наша задача: купить максимум возможных пиц, затем на сдачу купить максимум жвачек,
затем на оставшуюся сдачу купить конфет.
В результате нам нужно сделать математический просчет и вывести на консоль примерно вот такую информацию:
На эти деньги мы можем купить:
- 4 пиццы
- 3 жвачки
- 0 конфет
Сдача с магазина: 2 рубля.*/
    public static void main(String[] args) {
        double money = 1000.0;
        double pizzaPrice = 230.0;
        double gumPrice = 26.0;
        double candyPrice = 2.5;

        /*
        Расчет количества каждого из товаров на сумму 1000 рублей
         */
        int pizzaCount = (int) (money / pizzaPrice);
        int gumCount = (int) ((money % pizzaPrice) / gumPrice);
        int candyCount = (int) (((money % pizzaPrice) % gumPrice) / candyPrice);

        //Расчет сдачи после покупки всех товаров
        double changeMoney = ((money % pizzaPrice) % gumPrice) % candyPrice;

        //Вывод информации о количестве купленных товаров на консоль
        System.out.println("На эти деньги мы можем купить:");
        System.out.println(pizzaCount + " пиццы");
        System.out.println(gumCount + " жвачки");
        System.out.println(candyCount + " конфет");
        System.out.println("Сдача с магазина: " + changeMoney + " рублей.");
    }


}
