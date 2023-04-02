package knigi.model;

public enum Binding {
    HARDCOVER,
    SOFTCOVER;

    public static Binding getBindingFromString(String str) {
        switch (str.toLowerCase()) {
            case "мягкий":
                return SOFTCOVER;
            case "твердый":
                return HARDCOVER;
            default:
                return null;
        }
    }
}
