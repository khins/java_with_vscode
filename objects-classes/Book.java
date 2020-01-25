public enum Book {

    TEST("test", "value1"),
    TEST2("test", " value 2");

    private final String title;
    private final String value;

    Book(String title, String value) {
        this.title = title;
        this.value = value;
    }

    public String getTitle() {
        return title;
    }

    public String getValue() {
        return value;
    }
}