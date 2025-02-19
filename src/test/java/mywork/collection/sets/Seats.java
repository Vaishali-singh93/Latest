package mywork.collection.sets;

public class Seats {
   private String  row;
   private int seatNumber;
   private boolean seatReserved;

    public Seats(String row, int seatNumber) {
        this.row = row;
        this.seatNumber = seatNumber;
    }

    @Override
    public String toString() {
        return "%s%-8d".formatted(row,seatNumber);
    }
}
