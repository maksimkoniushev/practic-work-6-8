public class Keyboard {
    private final KeyboardType keyboardType;
    private final boolean isBackLight;
    private final double keyboardWeight;

    public Keyboard(KeyboardType keyboardType, boolean isBackLight, double keyboardWeight) {
        this.keyboardType = keyboardType;
        this.isBackLight = isBackLight;
        this.keyboardWeight = keyboardWeight;
    }

    public KeyboardType getKeyboardType() {
        return keyboardType;
    }

    public boolean isBackLight() {
        return isBackLight;
    }

    public double getKeyboardWeight() {
        return keyboardWeight;
    }

    public Keyboard setKeyboardType(KeyboardType keyboardType) {
        return new Keyboard(keyboardType, isBackLight, keyboardWeight);
    }

    public Keyboard setBackLight(boolean isBackLight) {
        return new Keyboard(keyboardType, isBackLight, keyboardWeight);
    }

    public Keyboard setKeyboardWeight(double keyboardWeight) {
        return new Keyboard(keyboardType, isBackLight, keyboardWeight);
    }

    public String toString() {
        String isBackLightMessage = isBackLight ? "есть;" : "нет;";
        return "5. Клавиатура:\n" +
                "  - тип: " + keyboardType + ";\n" +
                "  - наличие подсветки: " + isBackLightMessage + "\n" +
                "  - вес: " + keyboardWeight + " кг.\n";
    }
}