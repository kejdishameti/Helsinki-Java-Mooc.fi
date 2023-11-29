import static java.lang.Math.abs;

public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        return (this.squares < compared.squares ? false : true);
    }

    public int priceDifference(Apartment compared) {
        int apPrice, comparedPrice;

        apPrice = this.princePerSquare * this.squares;
        comparedPrice = compared.princePerSquare * compared.squares;

        return abs(apPrice - comparedPrice);

    }

    public boolean moreExpensiveThan(Apartment compared) {
        int apaPrice = this.princePerSquare * this.squares;
        int comparedApt = compared.princePerSquare * compared.squares;
        return apaPrice > comparedApt;
    }
}
