package ru.gb.bullsandcows;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.Optional;

public class GameController {


    private Game game;

    private int step;

    @FXML
    private TextArea messageArea;

    @FXML
    private TextField messageField;

    public GameController() {
        this.game = new Game();
        step = 0;
    }

    @FXML
    private void checkButtonClick(ActionEvent actionEvent) {
        String playerNumber = messageField.getText();
        if (playerNumber.isEmpty()) {
            return;
        }
        Game.BullCowCount count = game.calcBullsAndCows(playerNumber);
        String text = String.format("%d. Введено число %s. Быков %d, коров %d", ++step, playerNumber, count.getBulls(), count.getCows());
        messageArea.appendText(text + "\n");
        messageField.clear();
        messageField.requestFocus();
        if (count.getBulls() == 4) {
            if (isWantToPlayAgain()) {
                step = 0;
                messageArea.clear();
                this.game = new Game();
            } else {
                System.exit(0);
            }
        }
    }

    private boolean isWantToPlayAgain() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION,
                "Поздравляю, вы выйграли!\n" +
                        "Загаданное число: " + game.getGuessNumber() + "\n" +
                        "Вы потратили " + step + " ходов\n" +
                        "Желаете сыграть ещё раз?",
                new ButtonType("Да", ButtonBar.ButtonData.YES),
                new ButtonType("Нет", ButtonBar.ButtonData.NO));
        alert.setTitle("Вопросец");
        ButtonType answer = alert.showAndWait().get();
        return answer.getButtonData() == ButtonBar.ButtonData.YES;
    }

    public void menuExitSelect(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void menuNewGameSelect(ActionEvent actionEvent) {

    }
}