module mainpkg.testproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens mainpkg.testproject to javafx.fxml;
    exports mainpkg.testproject;
}