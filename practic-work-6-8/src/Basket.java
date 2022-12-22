public class Basket {
    /**
     * Статические переменные класса
     */
    private static int totalBasketsCreated = 0;
    private static int totalItemsAllBaskets = 0;
    private static int totalPriceAllBaskets = 0;

    /**
     * Локальные переменные объекта
     */
    private String items;
    private int totalPriceBasket = 0;
    private double totalWeightBasket = 0;
    private int limit;

    /**
     * Конструкторы
     */

    public Basket() {
        totalBasketsCreated();
        items = "";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPriceBasket) {
        this();
        this.items = this.items + items;
        this.totalPriceBasket = totalPriceBasket;
    }

    /**
     * Геттеры статических переменных
     */

    public static int getTotalItemsAllBaskets() {
        return totalItemsAllBaskets;
    }

    public static int getTotalPriceAllBaskets() {
        return totalPriceAllBaskets;
    }

    public static int getBasketsCreated() {
        return totalBasketsCreated;
    }

    /**
     * Геттеры локальных переменных
     */

    public int getTotalPriceBasket() {
        return totalPriceBasket;
    }

    public double getTotalWeightBasket() {
        return totalWeightBasket;
    }

    /**
     * Статические методы
     */

    public static void totalItemsInAllBaskets(int count) {
        totalItemsAllBaskets = getTotalItemsAllBaskets() + count;
    }

    public static void totalPriceOfAllBaskets(int count, int price) {
        totalPriceAllBaskets = getTotalPriceAllBaskets() + count * price;
    }

    public static void totalBasketsCreated() {
        totalBasketsCreated = totalBasketsCreated + 1;
    }

    public static int averageItemPrice() {
        return totalPriceAllBaskets / totalItemsAllBaskets;
    }

    public static int averageBasketPrice() {
        return totalPriceAllBaskets / totalBasketsCreated;
    }

    /**
     * Локальные методы
     */

    public void addItems(String name, int price) {
        addItems(name, price, 1, 0);
    }

    public void addItems(String name, int price, int count) {
        addItems(name, price, count, 0);
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void addItems(String name, int price, int count, double weight) {
        if (!contains(name) || totalPriceBasket + count * price <= limit) {
            items = items + "Товар: " + name + ":" +
                    "        Цена: " + price + " руб.; " +
                    "Кол-во: " + count + " шт.; " +
                    weight + " кг.\n";
            totalItemsInAllBaskets(count);
            totalPriceOfAllBaskets(count, price);
            totalPriceBasket = totalPriceBasket + count * price;
            totalWeightBasket = totalWeightBasket + weight;
        }
    }

    public void printBasket(String title) {
        System.out.println(title);
        String messagePrint = items.isEmpty() ? "Корзина пуста" : items;
        System.out.println(messagePrint);
    }

    public void clear() {
        items = "";
        totalPriceBasket = 0;
        totalWeightBasket = 0;
    }
}


//public class Basket {
//
//    private static int count = 0;
//    private String items;
//    private int totalPrice = 0;
//
//    private double totalWeight = 0;
//    private int limit;
//
//    public Basket() {
//        increaseCount(1);
//        items = "";
//        this.limit = 1000000;
//    }
//
//    public Basket(int limit) {
//        this();
//        this.limit = limit;
//    }
//
//    public Basket(String items, int totalPrice) {
//        this();
//        this.items = this.items + items;
//        this.totalPrice = totalPrice;
//    }
//
//    public static int getCount() {
//        return count;
//    }
//
//    public int getTotalPrice() {
//        return totalPrice;
//    }
//
//    public double getTotalWeight() {
//        return totalWeight;
//    }
//
//    public static void increaseCount(int count) {
//        Basket.count = Basket.count + count;
//    }
//
//    public void add(String name, int price) {
//        add(name, price, 1, 0);
//    }
//
//    public void add(String name, int price, int count) {
//        add(name, price, count, 0);
//    }
//
//    public void add(String name, int price, int count, double weight) {
//        boolean error = false;
//        if (contains(name)) {
//            error = true;
//        }
//        if (totalPrice + count * price >= limit) {
//            error = true;
//        }
//        if (error) {
//            System.out.println("Error occurred :(");
//            return;
//        }
//        items = items + "Товар: " + name +
//                "; Кол-во: " + count + " шт.; - " +
//                "Цена: " + price + "; \n";
//        totalPrice = totalPrice + count * price;
//        totalWeight = totalWeight + weight;
//    }
//
//    public void clear() {
//        items = "";
//        totalPrice = 0;
//        totalWeight = 0;
//    }
//
//    public boolean contains(String name) {
//        return items.contains(name);
//    }
//
//    public void print(String title) {
//        System.out.println(title);
//        if (items.isEmpty()) {
//            System.out.println("Корзина пуста");
//        } else {
//            System.out.println(items);
//        }
//    }
//}
