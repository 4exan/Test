package C1.L007_Anonymous_classes_And_Enum;

import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

public class Interface {
    public static void main(String[] args) {

    }
}


class Test implements Printable{

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex < 0){
            return NO_SUCH_PAGE;
        }

        return 1;

    }
}
