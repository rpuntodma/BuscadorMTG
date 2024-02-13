module ramon.del.moral.buscadormtg {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.json;

    opens ramon.del.moral.buscadormtg to javafx.fxml, org.json;
    exports ramon.del.moral.buscadormtg;
}