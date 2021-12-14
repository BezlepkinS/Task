package Immutable.OrdersManager;

import Immutable.MenuItems.MenuItem;
import Immutable.Orders.Order;

public interface OrdersManager {
    int itemsQuantity();
    int itemsQuantity(String itemName);
    int itemsQuantity(MenuItem item);
    Order[] getOrders();
    int ordersCostSummary();
    int ordersQuantity();
}
