package javaf.basics;

public enum Countries {
    JAPAN("Japan", "Japanese", 220_000_000),
    GREECE("Greece", "Greek", 100_000_000),
    RUSSIA("Russia", "Russian", 144_000_000);
    private final String name;
    private final String language;
    private final long countOfPeople;

    Countries(String name, String language, long countOfPeople) {
        this.name = name;
        this.language = language;
        this.countOfPeople = countOfPeople;
    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }

    public long getCountOfPeople() {
        return countOfPeople;
    }
}