public class AbstractFactoryDemo {
    public static void main(String[] args) {
        Application app = new Application();

        ThemeFactory darkFactory = app.getThemeFactory(Application.THEME.DARK);
        Button darkButton =  darkFactory.createButton();
        darkButton.paint();

        CheckBox darkCheckBox = darkFactory.createCheckbox();
        darkCheckBox.check();

    }
}
