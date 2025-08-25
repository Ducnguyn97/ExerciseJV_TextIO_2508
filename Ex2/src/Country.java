public class Country {
    private int index;
    private String symbol;
    private String nameCountry;

    public Country(){};
    public Country(int index, String symbol, String nameCountry) {
        this.index = index;
        this.symbol = symbol;
        this.nameCountry = nameCountry;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    @Override
    public String toString() {
        return "Country{" +
                "index=" + index +
                ", symbol='" + symbol + '\'' +
                ", nameCountry='" + nameCountry + '\'' +
                '}';
    }
}
