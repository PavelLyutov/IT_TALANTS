package main;

import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Demo {

    public static void main(String[] args) {

        BookReader bookReader = new BookReader("Lev_Tolstoj_Vojna_i_mir.txt");
        bookReader.readBook();
    }
}


