package org.design_patterns.singleton;

public class Admin {

    private static Admin instance;

    private Admin() {}

    public static synchronized Admin getInstance() {
        if (instance == null) {
            instance = new Admin();
        }
        return instance;
    }
}
