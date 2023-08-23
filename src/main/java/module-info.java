module com.example.typing_gave_in_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.typing_gave_in_javafx to javafx.fxml;
    exports com.example.typing_gave_in_javafx;
}