package knigi.model;

public final class Author {
    private final int id;
    private final String name;

    private static int innerId;

    public Author(String name) {
        this.id = innerId++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
