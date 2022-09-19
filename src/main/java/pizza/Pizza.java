package pizza;

import java.util.HashMap;
import java.util.Map;

    public class Pizza {
        // Создадим хеш-таблицу для хранения заказов.
        // В качестве ключа будет имя клиента.
        // В качестве значения — количество заказов от этого клиента.
        private Map<String, Integer> orders = new HashMap<>();

        public static void main(String[] args) {
            Pizza pizzeria = new Pizza();
            pizzeria.openPizzeria();
            pizzeria.printStatistics();
        }

        // Начинаем принимать заказы! 🍕
        private void openPizzeria() {
            newOrder("Леонардо");
            newOrder("Донателло");
            newOrder("Рафаэль");
            newOrder("Леонардо");
            newOrder("Микеланджело");
            newOrder("Шреддер");
            newOrder("Донателло");
        }

        private void newOrder(String clientName) {
            int order = 1;
            if (orders.containsKey(clientName)) {
                int orderCount = orders.get(clientName);
                order += orderCount;
            }
            orders.put(clientName, order);



            // Сохраните новый заказ в хеш-таблицу. При обновлении счётчика заказов
            // не забудьте учесть заказы, которые уже были сделаны ранее.
        }

        private void printStatistics() {
            int allOrders = 0;
            for (Map.Entry<String, Integer> entry : orders.entrySet()) {
                allOrders += entry.getValue();
                System.out.println("Заказов от " + entry.getKey() + ": " + entry.getValue());

                
            }
            System.out.println("Всего заказов: " + allOrders);

            // Выведите собранную статистику в консоль и посчитайте общее количество заказов.
            //
            // Формат для вывода данных в консоль:
            //     Заказов от Микеланджело: 15
            //     Заказов от Леонардо: 4
            //     Всего заказов: 19
        }
    }

