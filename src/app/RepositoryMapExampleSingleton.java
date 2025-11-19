package app;

public class RepositoryMapExampleSingleton {

    private static class LazyHolder {

        private static final RepositoryMapExample INSTANCE = new RepositoryMapExampleImpl();
    }

    private RepositoryMapExampleSingleton() {

    }

    public static RepositoryMapExample getINSTANCE() {
        return LazyHolder.INSTANCE;
    }

}
