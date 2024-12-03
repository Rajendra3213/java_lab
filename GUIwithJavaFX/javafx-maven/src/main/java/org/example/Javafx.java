package org.example;

// import javafx.application.Application;
// import javafx.scene.Scene;
// import javafx.scene.control.Button;
// import javafx.scene.layout.FlowPane;
// import javafx.stage.Stage;

// public class Javafx extends Application {
//     @Override
//     public void start(Stage stage) {
//         FlowPane flowPane = new FlowPane();
//         flowPane.getChildren().addAll(new Button("Button 1"), new Button("Button 2"), new Button("Button 3"));
//         Scene scene = new Scene(flowPane, 300, 200);
//         stage.setTitle("FlowPane Example");
//         stage.setScene(scene);
//         stage.show();
//     }

//     public static void main(String[] args) {
//         launch(args);
//     }
// }
//import javafx.application.Application;
// import javafx.scene.Scene;
// import javafx.scene.control.Button;
// import javafx.scene.layout.BorderPane;
// import javafx.stage.Stage;

// public class Javafx extends Application {
//     @Override
//     public void start(Stage stage) {
//         BorderPane borderPane = new BorderPane();
//         borderPane.setTop(new Button("Top"));
//         borderPane.setBottom(new Button("Bottom"));
//         borderPane.setLeft(new Button("Left"));
//         borderPane.setRight(new Button("Right"));
//         borderPane.setCenter(new Button("Center"));

//         Scene scene = new Scene(borderPane, 300, 200);
//         stage.setTitle("BorderPane Example");
//         stage.setScene(scene);
//         stage.show();
//     }

//     public static void main(String[] args) {
//         launch(args);
//     }
// }

// import javafx.application.Application;
// import javafx.scene.Scene;
// import javafx.scene.control.Button;
// import javafx.scene.layout.HBox;
// import javafx.stage.Stage;

// public class Javafx extends Application {
//     @Override
//     public void start(Stage stage) {
//         HBox hbox = new HBox(10);
//         hbox.getChildren().addAll(new Button("Button 1"), new Button("Button 2"), new Button("Button 3"));

//         Scene scene = new Scene(hbox, 300, 100);
//         stage.setTitle("HBox Example");
//         stage.setScene(scene);
//         stage.show();
//     }

//     public static void main(String[] args) {
//         launch(args);
//     }
// }

// import javafx.application.Application;
// import javafx.scene.Scene;
// import javafx.scene.control.Button;
// import javafx.scene.layout.VBox;
// import javafx.stage.Stage;

// public class Javafx extends Application {
//     @Override
//     public void start(Stage stage) {
//         VBox vbox = new VBox(10);
//         vbox.getChildren().addAll(new Button("Button 1"), new Button("Button 2"), new Button("Button 3"));

//         Scene scene = new Scene(vbox, 200, 150);
//         stage.setTitle("VBox Example");
//         stage.setScene(scene);
//         stage.show();
//     }

//     public static void main(String[] args) {
//         launch(args);
//     }
// }
// import javafx.application.Application;
// import javafx.scene.Scene;
// import javafx.scene.control.Button;
// import javafx.scene.layout.GridPane;
// import javafx.stage.Stage;

// public class Javafx extends Application {
//     @Override
//     public void start(Stage stage) {
//         GridPane grid = new GridPane();
//         grid.add(new Button("Button 1"), 0, 0);
//         grid.add(new Button("Button 2"), 1, 0);
//         grid.add(new Button("Button 3"), 0, 1);
//         grid.add(new Button("Button 4"), 1, 1);

//         Scene scene = new Scene(grid, 300, 200);
//         stage.setTitle("GridPane Example");
//         stage.setScene(scene);
//         stage.show();
//     }

//     public static void main(String[] args) {
//         launch(args);
//     }
// }
// import javafx.application.Application;
// import javafx.scene.Scene;
// import javafx.scene.control.Label;
// import javafx.scene.control.TextField;
// import javafx.scene.layout.VBox;
// import javafx.stage.Stage;

// public class Javafx extends Application {
//     @Override
//     public void start(Stage stage) {
//         Label label = new Label("Enter your name:");
//         TextField textField = new TextField();

//         VBox vbox = new VBox(10, label, textField);
//         Scene scene = new Scene(vbox, 300, 100);
//         stage.setTitle("Label and TextField Example");
//         stage.setScene(scene);
//         stage.show();
//     }

//     public static void main(String[] args) {
//         launch(args);
//     }
// }
// import javafx.application.Application;
// import javafx.scene.Scene;
// import javafx.scene.control.Button;
// import javafx.scene.control.CheckBox;
// import javafx.scene.control.RadioButton;
// import javafx.scene.layout.VBox;
// import javafx.stage.Stage;

// public class Javafx extends Application {
//     @Override
//     public void start(Stage stage) {
//         Button button = new Button("Click Me");
//         RadioButton radioButton = new RadioButton("Option 1");
//         CheckBox checkBox = new CheckBox("Accept terms");

//         VBox vbox = new VBox(10, button, radioButton, checkBox);
//         Scene scene = new Scene(vbox, 300, 150);
//         stage.setTitle("Button, RadioButton, and CheckBox Example");
//         stage.setScene(scene);
//         stage.show();
//     }

//     public static void main(String[] args) {
//         launch(args);
//     }
// }
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Javafx extends Application {
    @Override
    public void start(Stage stage) {
        Menu fileMenu = new Menu("File");
        fileMenu.getItems().addAll(new MenuItem("New"), new MenuItem("Open"), new MenuItem("Exit"));

        Menu editMenu = new Menu("Edit");
        editMenu.getItems().addAll(new MenuItem("Cut"), new MenuItem("Copy"), new MenuItem("Paste"));

        MenuBar menuBar = new MenuBar(fileMenu, editMenu);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(menuBar);

        Scene scene = new Scene(borderPane, 400, 200);
        stage.setTitle("Menu Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
