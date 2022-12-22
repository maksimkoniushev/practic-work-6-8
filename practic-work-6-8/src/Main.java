public class Main {

    public static void main(String[] args) {
        Basket basket_0 = new Basket();
        basket_0.printBasket("\nПеречень товаров корзины №0:");
        System.out.println("- Стоимость корзины: " + basket_0.getTotalPriceBasket() + " руб.");
        System.out.println("- Общий вес корзины: " + basket_0.getTotalWeightBasket() + " кг.");

        Basket basket_1 = new Basket();
        basket_1.addItems("Хлеб", 50, 2);
        basket_1.addItems("Молоко", 40, 1, 2.0);
        basket_1.addItems("Яблоко", 35, 3, 0.6);
        basket_1.addItems("Морковь", 15, 5, 1.4);
        basket_1.printBasket("\nПеречень товаров корзины №1:");
        System.out.println("- Стоимость корзины: " + basket_1.getTotalPriceBasket() + " руб.");
        System.out.println("- Общий вес корзины: " + basket_1.getTotalWeightBasket() + " кг.");

        Basket basket_2 = new Basket();
        basket_2.addItems("Капуста", 27, 2, 2.5);
        basket_2.addItems("Морковь", 15, 2, 0.6);
        basket_2.printBasket("\nПеречень товаров корзины №2:");
        System.out.println("- Стоимость корзины: " + basket_2.getTotalPriceBasket() + " руб.");
        System.out.println("- Общий вес корзины: " + basket_2.getTotalWeightBasket() + " кг.");

        Basket basket_3 = new Basket(500);
        basket_3.addItems("Малина", 200);
        basket_3.addItems("Малина", 200);
        basket_3.addItems("Клубника", 250);
        basket_3.addItems("Клубника", 350);

        basket_3.printBasket("\nПеречень товаров корзины №3:");
        System.out.println("- Стоимость корзины: " + basket_3.getTotalPriceBasket() + " руб.");
        System.out.println("- Общий вес корзины: " + basket_3.getTotalWeightBasket() + " кг.");

        System.out.println("\nСтатистическая информация:");
        System.out.println("Всего корзин: " + Basket.getBasketsCreated() + ";");
        System.out.println("Всего товаров: " + Basket.getTotalItemsAllBaskets());
        System.out.println("Всего стоимость: " + Basket.getTotalPriceAllBaskets());
        System.out.println("\nСредняя стоимость одного товара: " + Basket.averageItemPrice() + " руб.");
        System.out.println("Средняя стоимость одной корзины: " + Basket.averageBasketPrice() + " руб.");
    }
}


//public class Main {
//
//    public static void main(String[] args) {
//        Basket basket = new Basket();
//        basket.add("Молоко", 40);
//        basket.add("Хлеб", 50, 2);
//        basket.add("Яблоко", 35, 3, 0.6);
//        basket.add("Морковь", 15, 5, 1.3);
//
//        basket.print("\nПеречень товаров:");
//        System.out.println("  - Стоимость корзины: " + basket.getTotalPrice() + " руб.");
//        System.out.println("  - Общий вес корзины: " + basket.getTotalWeight() + " кг.");
//
//        basket.clear();
//        System.out.println("\n Корзина освобождена.");
//        System.out.println("  - Стоимость корзины: " + basket.getTotalPrice() + " руб.");
//        System.out.println("  - Общий вес корзины: " + basket.getTotalWeight() + " кг.");
//
//        basket.add("Капуста", 27, 2, 2.5);
//        basket.print("\nПеречень товаров:");
//        System.out.println("  - Стоимость корзины: " + basket.getTotalPrice() + " руб.");
//        System.out.println("  - Общий вес корзины: " + basket.getTotalWeight() + " кг.");
//    }
//}