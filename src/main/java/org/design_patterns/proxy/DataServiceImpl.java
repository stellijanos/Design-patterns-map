package org.design_patterns.proxy;

public class DataServiceImpl implements DataService {

    private final String data = "This is forbidden admin data";

    @Override
    public String getData() {
        return this.data;
    }
}
