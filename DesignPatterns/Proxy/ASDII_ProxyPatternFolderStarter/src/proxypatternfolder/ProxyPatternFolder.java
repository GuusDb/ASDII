package proxypatternfolder;

import domein.DomeinController;
import domein.*;

public class ProxyPatternFolder {

    private DomeinController dc;

    public static void main(String[] args) {
        new ProxyPatternFolder().run();
    }

    public ProxyPatternFolder() {
        dc = new DomeinController();
    }

    private void run() {
        // Een gebruker met folder access
        System.out.println("Jan: " + dc.performFolderOperation("Jan", "JanPass"));
        // Een gebruiker zonder folder access
        System.out.println("Corneel: " + dc.performFolderOperation("Corneel", "CorneelPass"));
        // Een ongeldige gebruiker, incorrect user/password
        System.out.println("David: " + dc.performFolderOperation("David", "DavidPass"));
    }
}