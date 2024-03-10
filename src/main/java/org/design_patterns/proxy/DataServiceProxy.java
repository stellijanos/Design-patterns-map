package org.design_patterns.proxy;

public class DataServiceProxy implements DataService{

    private DataService realDataService;
    private boolean isAdmin;

    public DataServiceProxy(boolean isAdmin) {
        this.realDataService = new DataServiceImpl();
        this.isAdmin = isAdmin;
    }

    @Override
    public String getData() {
        if (isAdmin) {
            return this.realDataService.getData();
        }
        return "Unauthprized access";
    }
}
