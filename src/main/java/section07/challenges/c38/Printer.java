package section07.challenges.c38;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel >= 0 && tonerLevel <= 100 ? tonerLevel : -1;
        this.duplex = duplex;
        pagesPrinted = 0;
    }


    public int addToner(int tonerAmount) {
        if ((tonerAmount > 0 && tonerAmount <= 100) && (tonerLevel + tonerAmount <= 100)) {
            tonerLevel = tonerLevel + tonerAmount;
            return tonerLevel;
        }
        return -1;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int printPages(int pages) {
        int printPages = pages;
        if (duplex) {
            System.out.println("Printing in duplex mode");
            printPages = pages / 2 + pages % 2;
        }
        pagesPrinted += printPages;
        return printPages;
    }
}
