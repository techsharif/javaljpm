package section07.challenges.c38;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrinterTest {

    @Test
    public void testAddToner() {
        Printer printer = new Printer(50, true);
        assertEquals(100, printer.addToner(50));
    }

    @Test
    public void testInitialPageCount() {
        Printer printer = new Printer(50, true);
        printer.addToner(50);
        assertEquals(0, printer.getPagesPrinted());
    }

    @Test
    public void testPagePrinted() {
        Printer printer = new Printer(50, true);
        printer.addToner(50);
        int pagesPrinted = printer.printPages(4);
        assertEquals(2, pagesPrinted);
    }

    @Test
    public void testPageCount() {
        Printer printer = new Printer(50, true);
        printer.addToner(50);
        int pagesPrinted = printer.printPages(4);
        assertEquals(2, printer.getPagesPrinted());
    }

    @Test
    public void testPagePrinted2() {
        Printer printer = new Printer(50, true);
        printer.addToner(50);
        int pagesPrinted = printer.printPages(4);
        pagesPrinted = printer.printPages(2);

        assertEquals(1, pagesPrinted);
    }

    @Test
    public void testPageCount2() {
        Printer printer = new Printer(50, true);
        printer.addToner(50);
        int pagesPrinted = printer.printPages(4);
        pagesPrinted = printer.printPages(2);

        assertEquals(3, printer.getPagesPrinted());
    }

}
