package app.service;

public class QueryServiceSingleton {

    private static class LazyHolder {

        private static final QueryService INSTANCE = new QueryServiceImpl();
    }

    private QueryServiceSingleton() {

    }

    public static QueryService getINSTANCE() {
        return LazyHolder.INSTANCE;
    }
}
