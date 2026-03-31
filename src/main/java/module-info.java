module com.example.studentmanagerp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.studentmanagerp to javafx.fxml;
    exports com.example.studentmanagerp;
}