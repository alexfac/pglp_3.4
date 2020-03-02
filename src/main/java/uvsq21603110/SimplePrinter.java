package uvsq21603110;

import java.util.ArrayList;

public class SimplePrinter implements faxPrinter, copyPrinter, scanPrinter, printPrinter, ListfaxPrinter {

    @Override
    public void fax(){throw new UnsupportedOperationException();}

    @Override
    public void copy(){throw new UnsupportedOperationException();}

    @Override
    public void scan(){throw new UnsupportedOperationException();}

    @Override
    public void print(){
        System.out.println("Print a document");
    }

    @Override
    public void Listfax(ArrayList<Document> Doc){}
}
