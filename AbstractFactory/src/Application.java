public class Application {
    public ThemeFactory getThemeFactory(THEME theme) {
        return switch (theme) {
            case LIGHT -> new LightThemeFactory();
            case DARK -> new DarkThemeFactory();
        };
    }

    public enum THEME {
        LIGHT,
        DARK
    }
}
