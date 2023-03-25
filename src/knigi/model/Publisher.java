package knigi.model;

public final class Publisher {
    private final int id;
    private final String name;

    private static int innerId;

    public Publisher(String name) {
        this.id = innerId++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
