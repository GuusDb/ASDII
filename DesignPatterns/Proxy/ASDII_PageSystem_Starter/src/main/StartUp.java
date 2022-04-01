package main;

import domein.Report;
import domein.Resume;
import java.util.ArrayList;
import java.util.List;
import domein.Document;
import domein.*;
import java.util.*;

public class StartUp {

    private List<Document> documents;

    public static void main(String[] args) {
        new StartUp().run();
    }

    private void run() {
        documents = new ArrayList<>();
//Uncomment
//        documents.add(new Report());
//        documents.add(new Resume());
//        documents.forEach(doc -> System.out.printf("\n%s:\n%s\n",
//                doc.getClass().getSimpleName(),
//                doc.print())
//        );
    }

}
