package view.main;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xlo on 15-6-16.
 *
 */
public class WindowManager {

    protected static Map<String, UIWindow> windows = new HashMap<>();

    public static void addWindow(UIWindow window) {
        windows.put(window.getClassName(), window);
    }

    public static void removeWindow(String name) {
        if (windows.containsKey(name)) {
            windows.remove(name);
        }
    }

    public static void removeWindow(UIWindow window) {
        removeWindow(window.getClassName());
    }

    public static void createWindow(String className, String windowName) {
        UIWindow window = windows.get(className);
        window.getInstance(windowName);
        window.createWindow();
    }

}
