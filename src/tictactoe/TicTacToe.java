/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.Optional;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Stas
 */
public class TicTacToe extends Application {
    
    static String[][] matrix = {{"","",""},{"","",""},{"","",""}};
    static int counter;
    static Alert alert = new Alert(AlertType.CONFIRMATION);
    static Button button1 = new Button();
    static Button button2 = new Button();
    static Button button3 = new Button();
    static Button button4 = new Button();
    static Button button5 = new Button();
    static Button button6 = new Button();
    static Button button7 = new Button();
    static Button button8 = new Button();
    static Button button9 = new Button();
    
    
    @Override
    public void start(Stage primaryStage) {                    

        
        
        MenuBar menuBar = new MenuBar();
        Menu onePlayer = new Menu("Play vs Computer");
        Menu twoPlayers = new Menu("Play vs Player");
        
        onePlayer.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                button1.setOnAction(new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent event){
                        if(button1.getText().equals(""))
                            if(counter %2 == 0){
                                matrix[0][0] = "X";
                                button1.setText("X");
                                counter++;
                                check();

                            }
                            else {
                                button1.setText("O");
                                matrix[0][0] = "O";
                                counter++;
                                check();
                            }
                    }
                });

                button2.setOnAction(new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent event){
                        if(button2.getText().equals(""))
                            if(counter %2 == 0){
                                matrix[0][1] = "X";
                                button2.setText("X");
                                counter++;
                                check();
                            }
                            else {
                                button2.setText("O");
                                matrix[0][1] = "O";
                                counter++;
                                check();
                            }
                    }
                });
                button3.setOnAction(new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent event){
                        if(button3.getText().equals(""))
                            if(counter %2 == 0){
                                matrix[0][2] = "X";
                                button3.setText("X");
                                counter++;
                                check();
                            }
                            else {
                                button3.setText("O");
                                matrix[0][2] = "O";
                                counter++;
                                check();
                            }
                    }
                });
                button4.setOnAction(new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent event){
                        if(button4.getText().equals(""))
                            if(counter %2 == 0){
                                button4.setText("X");
                                matrix[1][0] = "X";
                                counter++;
                                check();
                            }
                            else {
                                button4.setText("O");
                                matrix[1][0] = "O";
                                counter++;
                                check();
                            }
                    }
                });
                button5.setOnAction(new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent event){
                        if(button5.getText().equals(""))
                            if(counter %2 == 0){
                                button5.setText("X");
                                matrix[1][1] = "X";
                                counter++;
                                check();
                            }
                            else {
                                button5.setText("O");
                                matrix[1][1] = "O";
                                counter++;
                                check();
                            }
                    }
                });
                button6.setOnAction(new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent event){
                        if(button6.getText().equals(""))
                            if(counter %2 == 0){
                                button6.setText("X");
                                matrix[1][2] = "X";
                                counter++;
                                check();
                            }
                            else {
                                button6.setText("O");
                                matrix[1][2] = "O";
                                counter++;
                                check();
                            }
                    }
                });
                button7.setOnAction(new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent event){
                        if(button7.getText().equals(""))
                            if(counter %2 == 0){
                                button7.setText("X");
                                matrix[2][0] = "X";
                                counter++;
                                check();
                            }
                            else {
                                button7.setText("O");
                                matrix[2][0] = "O";
                                counter++;
                                check();
                            }
                    }
                });
                button8.setOnAction(new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent event){
                        if(button8.getText().equals(""))
                            if(counter %2 == 0){
                                button8.setText("X");
                                matrix[2][1] = "X";
                                counter++;
                                check();
                            }
                            else {
                                button8.setText("O");
                                matrix[2][1] = "O";
                                counter++;
                                check();
                            }
                        }
                });
                button9.setOnAction(new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent event){
                        if(button9.getText().equals(""))
                            if(counter %2 == 0){
                                button9.setText("X");
                                matrix[2][2] = "X";
                                counter++;
                                check();
                            }
                            else {
                                button9.setText("O");
                                matrix[2][2] = "O";
                                counter++;
                                check();
                            }
                        }
                });
            }
        });
        
        twoPlayers.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                button1.setOnAction(new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent event){
                        if(button1.getText().equals(""))
                            if(counter %2 == 0){
                                matrix[0][0] = "X";
                                button1.setText("X");
                                counter++;
                                check();

                            }
                            else {
                                button1.setText("O");
                                matrix[0][0] = "O";
                                counter++;
                                check();
                            }
                    }
                });

                button2.setOnAction(new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent event){
                        if(button2.getText().equals(""))
                            if(counter %2 == 0){
                                matrix[0][1] = "X";
                                button2.setText("X");
                                counter++;
                                check();
                            }
                            else {
                                button2.setText("O");
                                matrix[0][1] = "O";
                                counter++;
                                check();
                            }
                    }
                });
                button3.setOnAction(new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent event){
                        if(button3.getText().equals(""))
                            if(counter %2 == 0){
                                matrix[0][2] = "X";
                                button3.setText("X");
                                counter++;
                                check();
                            }
                            else {
                                button3.setText("O");
                                matrix[0][2] = "O";
                                counter++;
                                check();
                            }
                    }
                });
                button4.setOnAction(new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent event){
                        if(button4.getText().equals(""))
                            if(counter %2 == 0){
                                button4.setText("X");
                                matrix[1][0] = "X";
                                counter++;
                                check();
                            }
                            else {
                                button4.setText("O");
                                matrix[1][0] = "O";
                                counter++;
                                check();
                            }
                    }
                });
                button5.setOnAction(new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent event){
                        if(button5.getText().equals(""))
                            if(counter %2 == 0){
                                button5.setText("X");
                                matrix[1][1] = "X";
                                counter++;
                                check();
                            }
                            else {
                                button5.setText("O");
                                matrix[1][1] = "O";
                                counter++;
                                check();
                            }
                    }
                });
                button6.setOnAction(new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent event){
                        if(button6.getText().equals(""))
                            if(counter %2 == 0){
                                button6.setText("X");
                                matrix[1][2] = "X";
                                counter++;
                                check();
                            }
                            else {
                                button6.setText("O");
                                matrix[1][2] = "O";
                                counter++;
                                check();
                            }
                    }
                });
                button7.setOnAction(new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent event){
                        if(button7.getText().equals(""))
                            if(counter %2 == 0){
                                button7.setText("X");
                                matrix[2][0] = "X";
                                counter++;
                                check();
                            }
                            else {
                                button7.setText("O");
                                matrix[2][0] = "O";
                                counter++;
                                check();
                            }
                    }
                });
                button8.setOnAction(new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent event){
                        if(button8.getText().equals(""))
                            if(counter %2 == 0){
                                button8.setText("X");
                                matrix[2][1] = "X";
                                counter++;
                                check();
                            }
                            else {
                                button8.setText("O");
                                matrix[2][1] = "O";
                                counter++;
                                check();
                            }
                        }
                });
                button9.setOnAction(new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent event){
                        if(button9.getText().equals(""))
                            if(counter %2 == 0){
                                button9.setText("X");
                                matrix[2][2] = "X";
                                counter++;
                                check();
                            }
                            else {
                                button9.setText("O");
                                matrix[2][2] = "O";
                                counter++;
                                check();
                            }
                        }
                    });
            }
        });
        StackPane root = new StackPane();
        
        
        menuBar.getMenus().addAll(onePlayer,twoPlayers);
        // adding to root all buttons
        root.getChildren().add(button1);
        root.getChildren().add(button2);
        root.getChildren().add(button3);
        root.getChildren().add(button4);
        root.getChildren().add(button5);
        root.getChildren().add(button6);
        root.getChildren().add(button7);
        root.getChildren().add(button8);
        root.getChildren().add(button9);
        root.getChildren().add(menuBar);
        
        //setting alignments to all buttons
        root.setAlignment(menuBar,Pos.TOP_CENTER);
        root.setAlignment(button1,Pos.TOP_LEFT);
        root.setAlignment(button2,Pos.TOP_CENTER);
        root.setAlignment(button3,Pos.TOP_RIGHT);
        root.setAlignment(button4,Pos.CENTER_LEFT);
        root.setAlignment(button5,Pos.CENTER);
        root.setAlignment(button6,Pos.CENTER_RIGHT);
        root.setAlignment(button7,Pos.BOTTOM_LEFT);
        root.setAlignment(button8,Pos.BOTTOM_CENTER);
        root.setAlignment(button9,Pos.BOTTOM_RIGHT);
        
        //setting size to all buttons   
        button1.setMinSize(100, 100);
        button2.setMinSize(100, 100);
        button3.setMinSize(100, 100);
        button4.setMinSize(100, 100);
        button5.setMinSize(100, 100);
        button6.setMinSize(100, 100);
        button7.setMinSize(100, 100);
        button8.setMinSize(100, 100);
        button9.setMinSize(100, 100);
        
        
        Scene scene = new Scene(root, 300, 300);
        primaryStage.setTitle("TicTacToe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    public static boolean compare(String el1,String el2){
        return el1.equals(el2);
    }
    public static void check(){
        if(
            (compare(matrix[0][0],matrix[0][1]) && compare(matrix[0][0],matrix[0][2])) && compare(matrix[0][0],"X") ||
            (compare(matrix[1][0],matrix[1][1]) && compare(matrix[1][0],matrix[1][2])) && compare(matrix[1][0],"X") ||
            (compare(matrix[2][0],matrix[2][1]) && compare(matrix[2][0],matrix[2][2])) && compare(matrix[2][0],"X") ||
                
            (compare(matrix[0][1],matrix[1][1]) && compare(matrix[0][1],matrix[2][1])) && compare(matrix[0][1],"X") ||
            (compare(matrix[0][2],matrix[1][2]) && compare(matrix[0][2],matrix[2][2])) && compare(matrix[0][2],"X") ||
            (compare(matrix[0][0],matrix[1][0]) && compare(matrix[0][0],matrix[2][0])) && compare(matrix[0][0],"X") ||
                
            (compare(matrix[1][1],matrix[0][0]) && compare(matrix[1][1],matrix[2][2])) && compare(matrix[1][1],"X") ||
            (compare(matrix[1][1],matrix[2][0]) && compare(matrix[1][1],matrix[0][2])) && compare(matrix[1][1],"X") ){
            
            alert.setContentText("X -winners. Do you  want to play again?");
            
            Optional<ButtonType> result = alert.showAndWait();
            if(result.get() == ButtonType.OK){
                for (int i = 0; i < 3; ++i)
                    for (int j = 0; j < 3; ++j)
                        matrix[i][j] = "";
                counter = 0;
                button1.setText("");
                button2.setText("");
                button3.setText("");
                button4.setText("");
                button5.setText("");
                button6.setText("");
                button7.setText("");
                button8.setText("");
                button9.setText("");
            }else
                System.exit(0);      
        }
        else if(
            (compare(matrix[0][0],matrix[0][1]) && compare(matrix[0][0],matrix[0][2])) && compare(matrix[0][0],"O") ||
            (compare(matrix[1][0],matrix[1][1]) && compare(matrix[1][0],matrix[1][2])) && compare(matrix[1][0],"O") ||
            (compare(matrix[2][0],matrix[2][1]) && compare(matrix[2][0],matrix[2][2])) && compare(matrix[2][0],"O") ||
                
            (compare(matrix[0][1],matrix[1][1]) && compare(matrix[0][1],matrix[2][1])) && compare(matrix[0][1],"O") ||
            (compare(matrix[0][2],matrix[1][2]) && compare(matrix[0][2],matrix[2][2])) && compare(matrix[0][2],"O") ||
            (compare(matrix[0][0],matrix[1][0]) && compare(matrix[0][0],matrix[2][0])) && compare(matrix[0][0],"O") ||
                
            (compare(matrix[1][1],matrix[0][0]) && compare(matrix[1][1],matrix[2][2])) && compare(matrix[1][1],"O") ||
            (compare(matrix[1][1],matrix[2][0]) && compare(matrix[1][1],matrix[0][2])) && compare(matrix[1][1],"O") ){
            
            alert.setContentText("Y -winners. Do you  want to play again?");
            
            Optional<ButtonType> result = alert.showAndWait();
            if(result.get() == ButtonType.OK){
                for (int i = 0; i < 3; ++i)
                    for (int j = 0; j < 3; ++j)
                        matrix[i][j] = "";
                counter = 0;
                button1.setText("");
                button2.setText("");
                button3.setText("");
                button4.setText("");
                button5.setText("");
                button6.setText("");
                button7.setText("");
                button8.setText("");
                button9.setText("");
            }else
                System.exit(0);      
        }else
            if(counter == 9){
                alert.setContentText("Draw. Do you  want to play again?");
                Optional<ButtonType> result = alert.showAndWait();
                if(result.get() == ButtonType.OK){
                    for (int i = 0; i < 3; ++i)
                        for (int j = 0; j < 3; ++j)
                            matrix[i][j] = "";
                    counter = 0;
                    button1.setText("");
                    button2.setText("");
                    button3.setText("");
                    button4.setText("");
                    button5.setText("");
                    button6.setText("");
                    button7.setText("");
                    button8.setText("");
                    button9.setText("");
                }else
                    System.exit(0);  
            }
    }
    
    public static void compCheck(){
        
    }
}
