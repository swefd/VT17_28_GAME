package com.robocode.vt17_28;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class HelloController {
    private boolean flag = true;
    private int[][] map = new int[3][3];

    boolean theme = false; // false = White, true = Dark

    @FXML
    private VBox mainBox;
    @FXML
    private Label labelWinner;
    @FXML
    private Label labelSet;
    @FXML
    private Button buttonStart;

    @FXML
    private Button button_0_0;
    @FXML
    private Button button_0_1;
    @FXML
    private Button button_0_2;
    @FXML
    private Button button_1_0;
    @FXML
    private Button button_1_1;
    @FXML
    private Button button_1_2;
    @FXML
    private Button button_2_0;
    @FXML
    private Button button_2_1;
    @FXML
    private Button button_2_2;


    public void button_0_0_click(){
        button_0_0.setText(flag?"X":"O");
        button_0_0.setDisable(true);
        map[0][0] = flag?1:-1;
        flag = !flag;
        winner();
    }

    public void button_0_1_click(){
        button_0_1.setText(flag?"X":"O");
        button_0_1.setDisable(true);
        map[0][1] = flag?1:-1;
        flag = !flag;
        winner();
    }
    public void button_0_2_click(){
        button_0_2.setText(flag?"X":"O");
        button_0_2.setDisable(true);
        map[0][2] = flag?1:-1;
        flag = !flag;
        winner();
    }
    public void button_1_0_click(){
        button_1_0.setText(flag?"X":"O");
        button_1_0.setDisable(true);
        map[1][0] = flag?1:-1;
        flag = !flag;
        winner();
    }
    public void button_1_1_click(){
        button_1_1.setText(flag?"X":"O");
        button_1_1.setDisable(true);
        map[1][1] = flag?1:-1;
        flag = !flag;
        winner();
    }
    public void button_1_2_click(){
        button_1_2.setText(flag?"X":"O");
        button_1_2.setDisable(true);
        map[1][2] = flag?1:-1;
        flag = !flag;
        winner();
    }
    public void button_2_0_click(){
        button_2_0.setText(flag?"X":"O");
        button_2_0.setDisable(true);
        map[2][0] = flag?1:-1;
        flag = !flag;
        winner();
    }
    public void button_2_1_click(){
        button_2_1.setText(flag?"X":"O");
        button_2_1.setDisable(true);
        map[2][1] = flag?1:-1;
        flag = !flag;
        winner();
    }
    public void button_2_2_click(){
        button_2_2.setText(flag?"X":"O");
        button_2_2.setDisable(true);
        map[2][2] = flag?1:-1;
        flag = !flag;
        winner();

//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(map[i][j]+ " ");
//            }
//            System.out.println("");
//        }
    }

    public void buttonStartClick(){
        labelSet.setText("SET: X");
        labelWinner.setText("Winner: ?");
        flag = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                map[i][j] = 0;
            }
        }

        button_0_0.setDisable(false);
        button_0_0.setText("");

        button_0_1.setDisable(false);
        button_0_1.setText("");

        button_0_2.setDisable(false);
        button_0_2.setText("");

        button_1_0.setDisable(false);
        button_1_0.setText("");

        button_1_1.setDisable(false);
        button_1_1.setText("");

        button_1_2.setDisable(false);
        button_1_2.setText("");

        button_2_0.setDisable(false);
        button_2_0.setText("");

        button_2_1.setDisable(false);
        button_2_1.setText("");

        button_2_2.setDisable(false);
        button_2_2.setText("");
    }

    public void gameOver(){
        button_0_0.setDisable(true);
        button_0_1.setDisable(true);
        button_0_2.setDisable(true);
        button_1_0.setDisable(true);
        button_1_1.setDisable(true);
        button_1_2.setDisable(true);
        button_2_0.setDisable(true);
        button_2_1.setDisable(true);
        button_2_2.setDisable(true);
    }

    public void checkWinner(int sum){
        if (sum == 3){
            labelWinner.setText("Winner: X");
            gameOver();
        }else if (sum == -3){
            labelWinner.setText("Winner: O");
            gameOver();
        }
    }


    public void winner(){
        int sum = 0;

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                sum += map[i][j];
            }
            checkWinner(sum);
            sum = 0;
        }


        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                sum += map[j][i];
            }
            checkWinner(sum);
            sum = 0;
        }



        for (int i = 0; i < map.length; i++) {
            sum += map[i][i];
        }
        checkWinner(sum);
        sum = 0;

        for (int i = 0, j = map.length - 1; i < map.length; i++, j--) {
            sum += map[i][j];
        }
        checkWinner(sum);
        sum = 0;

    }

    public void buttonThemeClick(){

        if (theme){
            theme = false;

            mainBox.setStyle("-fx-background-color: #ffffff#ffffff;");

            buttonStart.setStyle("-fx-background-color: #ffffff#ffffff;");
            buttonStart.setStyle("-fx-text-fill: #000000");

            button_0_0.setStyle("-fx-background-color: #ffffff#ffffff;");
            button_0_0.setStyle("-fx-text-fill: #000000");
            button_0_1.setStyle("-fx-background-color: #ffffff#ffffff;");
            button_0_1.setStyle("-fx-text-fill: #000000");
            button_0_2.setStyle("-fx-background-color: #ffffff#ffffff;");
            button_0_2.setStyle("-fx-text-fill: #000000");

            button_1_0.setStyle("-fx-background-color: #ffffff#ffffff;");
            button_1_0.setStyle("-fx-text-fill: #000000");
            button_1_1.setStyle("-fx-background-color: #ffffff#ffffff;");
            button_1_1.setStyle("-fx-text-fill: #000000");
            button_1_2.setStyle("-fx-background-color: #ffffff#ffffff;");
            button_1_2.setStyle("-fx-text-fill: #000000");


            button_2_0.setStyle("-fx-background-color: #ffffff#ffffff");
            button_2_0.setStyle("-fx-text-fill: #000000");
            button_2_1.setStyle("-fx-background-color: #ffffff#ffffff;");
            button_2_1.setStyle("-fx-text-fill: #000000");
            button_2_2.setStyle("-fx-background-color: #ffffff#ffffff;");
            button_2_2.setStyle("-fx-text-fill: #000000");
        }else{
            theme = true;

            buttonStart.setStyle("-fx-background-color: #757575#757575");
            buttonStart.setStyle("-fx-text-fill: #ffffff");

            button_0_0.setStyle("-fx-background-color: #757575#757575");
            button_0_0.setStyle("-fx-text-fill: #ffffff");
            button_0_1.setStyle("-fx-background-color: #757575#757575");
            button_0_1.setStyle("-fx-text-fill: #ffffff");
            button_0_2.setStyle("-fx-background-color: #757575#757575");
            button_0_2.setStyle("-fx-text-fill: #ffffff");

            button_1_0.setStyle("-fx-background-color: #757575#757575;");
            button_1_0.setStyle("-fx-text-fill: #ffffff");
            button_1_1.setStyle("-fx-background-color: #757575#757575;");
            button_1_1.setStyle("-fx-text-fill: #ffffff");
            button_1_2.setStyle("-fx-background-color: #757575#757575;");
            button_1_2.setStyle("-fx-text-fill: #ffffff");


            button_2_0.setStyle("-fx-background-color: #757575#757575");
            button_2_0.setStyle("-fx-text-fill: #ffffff");
            button_2_1.setStyle("-fx-background-color: #757575#757575;");
            button_2_1.setStyle("-fx-text-fill: #ffffff");
            button_2_2.setStyle("-fx-background-color: #757575#757575;");
            button_2_2.setStyle("-fx-text-fill: #ffffff");
        }

        




    }


    @FXML
    public void initialize() {

    }

}