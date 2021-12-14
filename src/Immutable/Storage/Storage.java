package Immutable.Storage;

import Immutable.OrdersManager.InternetOrdersManager.InternetOrdersManager;
import Immutable.OrdersManager.TableOrdersManager.TableOrdersManager;

public class Storage {
    private static InternetOrdersManager internetInstance;
    private static TableOrdersManager tableInstance;

    private Storage() {
    }

    public static InternetOrdersManager getInternetOrdersManager() {
        if (internetInstance == null) {
            internetInstance = new InternetOrdersManager();
        }
        return internetInstance;
    }

    public static TableOrdersManager getTableOrdersManager() {
        if (tableInstance == null) {
            tableInstance = new TableOrdersManager();
        }
        return tableInstance;
    }
}