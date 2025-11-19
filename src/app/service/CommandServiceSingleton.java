package app.service;

public class CommandServiceSingleton {

    private static class LazyHolder {

        private static final CommandService INSTANCE = new CommandServiceImpl();
    }

    private CommandServiceSingleton() {

    }

    public static CommandService getINSTANCE() {
        return LazyHolder.INSTANCE;
    }
}
