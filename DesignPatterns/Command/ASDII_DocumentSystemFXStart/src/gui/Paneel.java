package gui;

import domein.DomeinController;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.*;
import domein.*;
import javafx.scene.control.*;


public class Paneel extends VBox {

    private String[] menuItemNaam = {"Concat", "Delete","undo"};
    private DomeinController domeinController;

    private MenuBar menuBar = new MenuBar();
    private Menu menuEdit = new Menu("Edit");
    private MenuItem[] menuItemAr = new MenuItem[menuItemNaam.length];
    private TextArea txaClipboard;
    private TextArea txaDocument;

    public Paneel(DomeinController dc) {
        domeinController = dc;
        initGui();
    }
   
    private void initGui() {
        for (int index = 0; index < menuItemAr.length; index++) {
            menuItemAr[index] = new MenuItem(menuItemNaam[index]);
            menuItemAr[index].setOnAction(action -> 
                {   String commando = (String) ((MenuItem)action.getSource()).getUserData();
                    domeinController.execute(txaClipboard.getText(), commando);
                    txaDocument.setText(domeinController.readDocument());
                }
            );
            menuItemAr[index].setAccelerator(
                    KeyCombination.keyCombination("Ctrl+Alt+" + menuItemNaam[index].charAt(0)));
            menuItemAr[index].setUserData(menuItemNaam[index]);
            menuEdit.getItems().add(menuItemAr[index]);
        }
        menuBar.getMenus().add(menuEdit);
        getChildren().add(menuBar);

        BorderPane pnlDocl = new BorderPane();
        txaDocument = new TextArea();
        txaDocument.setEditable(false);
        pnlDocl.setTop(new Label("Document"));
        pnlDocl.setCenter(txaDocument);
        getChildren().add(pnlDocl);

        BorderPane pnlClip = new BorderPane();
        txaClipboard = new TextArea();
        pnlClip.setTop(new Label("ClipBoard"));
        pnlClip.setCenter(txaClipboard);
        getChildren().add(pnlClip);
    }
}
