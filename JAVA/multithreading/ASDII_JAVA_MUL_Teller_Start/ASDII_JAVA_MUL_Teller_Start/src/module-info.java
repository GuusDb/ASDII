module OOPIII_MUL_lab_Teller {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.base;
	requires javafx.fxml;
	opens gui to javafx.graphics, javafx.fxml;
	opens main to javafx.graphics;
}