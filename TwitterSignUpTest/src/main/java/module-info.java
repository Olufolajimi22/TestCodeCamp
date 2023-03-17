module com.example.twittersignuptest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.twittersignuptest to javafx.fxml;
    exports com.example.twittersignuptest;
}