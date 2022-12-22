//public class Main {
//
//    public static void main2(String[] args) {
//        Basket basket_0 = new Basket();
//        basket_0.printBasket("\nПеречень товаров корзины №0:");
//        System.out.println("- Стоимость корзины: " + basket_0.getTotalPriceBasket() + " руб.");
//        System.out.println("- Общий вес корзины: " + basket_0.getTotalWeightBasket() + " кг.");
//
//        Basket basket_1 = new Basket();
//        basket_1.addItems("Хлеб", 50, 2);
//        basket_1.addItems("Молоко", 40, 1, 2.0);
//        basket_1.addItems("Яблоко", 35, 3, 0.6);
//        basket_1.addItems("Морковь", 15, 5, 1.4);
//        basket_1.printBasket("\nПеречень товаров корзины №1:");
//        System.out.println("- Стоимость корзины: " + basket_1.getTotalPriceBasket() + " руб.");
//        System.out.println("- Общий вес корзины: " + basket_1.getTotalWeightBasket() + " кг.");
//
//        Basket basket_2 = new Basket();
//        basket_2.addItems("Капуста", 27, 2, 2.5);
//        basket_2.addItems("Морковь", 15, 2, 0.6);
//        basket_2.printBasket("\nПеречень товаров корзины №2:");
//        System.out.println("- Стоимость корзины: " + basket_2.getTotalPriceBasket() + " руб.");
//        System.out.println("- Общий вес корзины: " + basket_2.getTotalWeightBasket() + " кг.");
//
//        Basket basket_3 = new Basket(500);
//        basket_3.addItems("Малина", 200);
//        basket_3.addItems("Малина", 200);
//        basket_3.addItems("Клубника", 250);
//        basket_3.addItems("Клубника", 350);
//
//        basket_3.printBasket("\nПеречень товаров корзины №3:");
//        System.out.println("- Стоимость корзины: " + basket_3.getTotalPriceBasket() + " руб.");
//        System.out.println("- Общий вес корзины: " + basket_3.getTotalWeightBasket() + " кг.");
//
//        System.out.println("\nСтатистическая информация:");
//        System.out.println("Всего корзин: " + Basket.getBasketsCreated() + ";");
//        System.out.println("Всего товаров: " + Basket.getTotalItemsAllBaskets());
//        System.out.println("Всего стоимость: " + Basket.getTotalPriceAllBaskets());
//        System.out.println("\nСредняя стоимость одного товара: " + Basket.averageItemPrice() + " руб.");
//        System.out.println("Средняя стоимость одной корзины: " + Basket.averageBasketPrice() + " руб.");
//    }
//}


public class Main {
    public static void main(String[] args) {
        CPU cpu_01 = new CPU(1.2,
                4,
                "Китай",
                0.155);

        RAM ram_01 = new RAM("DDR4",
                8,
                0.120);

        Carrier carrier_01 = new Carrier(
                CarrierType.HDD,
                4.2,
                0.450);

        Monitor monitor_01 = new Monitor(
                MonitorType.IPS,
                21,
                5.540);

        Keyboard keyboard_01 = new Keyboard(KeyboardType.беспроводная,
                false,
                0.350);

        Computer computer_01 = new Computer("РФ",
                "PC",
                cpu_01,
                ram_01,
                carrier_01,
                monitor_01,
                keyboard_01);

        CPU cpu_02 = cpu_01.setFrequency(1.7);
        cpu_02 = cpu_02.setCore(8);
        cpu_02 = cpu_02.setCpuWeight(0.206);

        RAM ram_02 = ram_01.setRamWeight(0.15);

        Carrier carrier_02 = carrier_01.setCarrierType(CarrierType.SSD);
        carrier_02 = carrier_02.setCarrierWeight(0.65);

        Monitor monitor_02 = monitor_01.setMonitorType(MonitorType.VA);
        monitor_02 = monitor_02.setMonitorWeight(6.54);

        Keyboard keyboard_02 = keyboard_01.setKeyboardWeight(0.364);


        Computer computer_02 = computer_01.setName("NoteBook");
        computer_02 = computer_02.setVendor("Китай");
        computer_02 = computer_02.setCpu(cpu_02);
        computer_02 = computer_02.setRam(ram_02);
        computer_02 = computer_02.setCarrier(carrier_02);
        computer_02 = computer_02.setMonitor(monitor_02);
        computer_02 = computer_02.setKeyboard(keyboard_02);

        CPU cpu_03 = cpu_01.setFrequency(2.1);
        cpu_03 = cpu_03.setCore(4);
        cpu_03 = cpu_03.setProduce("Тайвань");
        cpu_03 = cpu_03.setCpuWeight(0.215);

        RAM ram_03 = ram_01.setRamType("DDR4");
        ram_03 = ram_03.setMemoryVolume(4);
        ram_03 = ram_03.setRamWeight(0.255);

        Carrier carrier_03 = carrier_01.setCarrierType(CarrierType.SSD);
        carrier_03 = carrier_03.setMemoryVolume(10.2);
        carrier_03 = carrier_03.setCarrierWeight(0.855);

        Monitor monitor_03 = monitor_01.setMonitorType(MonitorType.TN);
        monitor_03 = monitor_03.setDiagonal(25);
        monitor_03 = monitor_03.setMonitorWeight(5.45);

        Keyboard keyboard_03 = keyboard_01.setKeyboardType(KeyboardType.проводная);
        keyboard_03 = keyboard_03.setBackLight(true);
        keyboard_03 = keyboard_03.setKeyboardWeight(0.25);

        Computer computer_03 = computer_01.setName("NoteBook");
        computer_03 = computer_03.setVendor("Китай");
        computer_03 = computer_03.setCpu(cpu_03);
        computer_03 = computer_03.setRam(ram_03);
        computer_03 = computer_03.setCarrier(carrier_03);
        computer_03 = computer_03.setMonitor(monitor_03);
        computer_03 = computer_03.setKeyboard(keyboard_03);

        System.out.println("Информация о компьютере (сборка №01)");
        System.out.println(computer_01);
        System.out.println("Информация о компьютере (сборка №02)");
        System.out.println(computer_02);
        System.out.println("Информация о компьютере (сборка №03)");
        System.out.println(computer_03);
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