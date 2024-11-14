/*
 * @(#)MyCalc.java 1.0 2024/11/15
 *
 * Copyright (c) 2024 [Vlad Neryanov], Inc.
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of [Vlad Neryanov].
 * You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into.
 */
package ad231.neryanov.lab7;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.util.Stack;

/**
 * Класс MyCalc реализует калькулятор.
 * Реализует графический интерфейс.
 *
 * @author [Vlad Neryanov]
 * @version 1.0 [2024/11/15]
 */

public class MyCalc extends Application {

    private String currentExpression = "";
    private Text resultText = new Text("");
    private double memory = 0.0;

    /**
     * Запуск графического приложения.
     *
     * @param primaryStage основное окно приложения
     * @throws Exception возможные исключения
     */
    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox root = new VBox();
        root.setStyle("-fx-background-color: #EDF0F2");

        Scene scene = new Scene(root);
        root.getChildren().add(configureMenu());
        HBox box = configureResultView();
        root.getChildren().add(box);
        VBox.setMargin(box, new Insets(20, 10, 2, 10));

        root.getChildren().add(configureButtons());

        primaryStage.setTitle("My calc");
        primaryStage.setResizable(false);
        primaryStage.setWidth(500);
        primaryStage.setHeight(380);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Класс для создания кнопок с максимальными размерами.
     */
    private class MyButton extends Button {
        MyButton(String text) {
            super(text);
            this.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        }
    }

    /**
     * Метод для настройки кнопок калькулятора.
     *
     * @return GridPane с кнопками калькулятора
     */
    private GridPane configureButtons() {
        GridPane pane = new GridPane();

        // 1ый ряд
        pane.add(createButton("MC"), 0, 0);
        pane.add(createButton("MR"), 1, 0);
        pane.add(createButton("MS"), 2, 0);
        pane.add(createButton("M+"), 3, 0);
        pane.add(createButton("M-"), 4, 0);

        // 2ой ряд
        pane.add(createButton("<-"), 0, 1);
        pane.add(createButton("CE"), 1, 1);
        pane.add(createButton("C"), 2, 1);
        pane.add(createButton("±"), 3, 1);
        pane.add(createButton("√"), 4, 1);

        // 3ий ряд
        pane.add(createButton("7"), 0, 2);
        pane.add(createButton("8"), 1, 2);
        pane.add(createButton("9"), 2, 2);
        pane.add(createButton("/"), 3, 2);
        pane.add(createButton("%"), 4, 2);

        // 4ый ряд
        pane.add(createButton("4"), 0, 3);
        pane.add(createButton("5"), 1, 3);
        pane.add(createButton("6"), 2, 3);
        pane.add(createButton("*"), 3, 3);
        pane.add(createButton("1/х"), 4, 3);

        // 5ый ряд
        pane.add(createButton("1"), 0, 4);
        pane.add(createButton("2"), 1, 4);
        pane.add(createButton("3"), 2, 4);
        pane.add(createButton("-"), 3, 4);
        pane.add(createButton("="), 4, 4, 1, 2);

        // 6ой ряд
        pane.add(createButton("0"), 0, 5, 2, 1);
        pane.add(createButton("."), 2, 5);
        pane.add(createButton("+"), 3, 5);

        // Свойства колонок
        ColumnConstraints cc = new ColumnConstraints();
        cc.setFillWidth(true);
        cc.setHgrow(Priority.ALWAYS);
        pane.getColumnConstraints().addAll(cc, cc, cc, cc, cc);

        pane.setStyle("-fx-padding: 2 10 4 10");
        pane.setHgap(6);
        pane.setVgap(6);
        return pane;
    }

    /**
     * Метод для создания кнопки.
     *
     * @param text текст, который будет отображаться на кнопке
     * @return созданная кнопка
     */
    private Button createButton(String text) {
        Button button = new MyButton(text);
        button.setOnAction(e -> handleButtonPress(text));
        return button;
    }

    /**
     * Метод для обработки нажатий кнопок.
     *
     * @param text текст кнопки
     */
    private void handleButtonPress(String text) {
        if (text.equals("=")) {
            // Вычисление результата
            try {
                double result = evaluateExpression(currentExpression);
                resultText.setText(String.format("%.2f", result));
                currentExpression = String.valueOf(result);
            } catch (Exception e) {
                resultText.setText("Ошибка");
                currentExpression = "";
            }
        } else if (text.equals("C")) {
            currentExpression = "";
            resultText.setText("");
        } else if (text.equals("MC")) {
            memory = 0;
            resultText.setText("Память очищена");
        } else if (text.equals("MR")) {
            currentExpression = String.valueOf(memory);
            resultText.setText(currentExpression);
        } else if (text.equals("MS")) {
            try {
                memory = Double.parseDouble(currentExpression);
                resultText.setText("Сохранено в память");
            } catch (NumberFormatException e) {
                resultText.setText("Ошибка");
                currentExpression = "";
            }
        } else if (text.equals("M+")) {
            try {
                memory += Double.parseDouble(currentExpression);
                resultText.setText("Прибавлено к памяти");
            } catch (NumberFormatException e) {
                resultText.setText("Ошибка");
                currentExpression = "";
            }
        } else if (text.equals("M-")) {
            try {
                memory -= Double.parseDouble(currentExpression);
                resultText.setText("Вычитано из памяти");
            } catch (NumberFormatException e) {
                resultText.setText("Ошибка");
                currentExpression = "";
            }
        } else if (text.equals("√")) {
            if (!currentExpression.isEmpty()) {
                try {
                    double number = Double.parseDouble(currentExpression);
                    if (number < 0) {
                        resultText.setText("Ошибка");
                        currentExpression = "";
                    } else {
                        double result = Math.sqrt(number);
                        currentExpression = String.valueOf(result);
                        resultText.setText(currentExpression);
                    }
                } catch (NumberFormatException e) {
                    resultText.setText("Ошибка");
                    currentExpression = "";
                }
            } else {
                resultText.setText("Ошибка");
                currentExpression = "";
            }
        } else if (text.equals("%")) {
            if (!currentExpression.isEmpty()) {
                try {
                    double number = Double.parseDouble(currentExpression);
                    double result = number / 100;
                    currentExpression = String.valueOf(result);
                    resultText.setText(currentExpression);
                } catch (NumberFormatException e) {
                    resultText.setText("Ошибка");
                    currentExpression = "";
                }
            } else {
                resultText.setText("Ошибка");
                currentExpression = "";
            }
        } else {
            currentExpression += text;
            resultText.setText(currentExpression);
        }
    }

    /**
     * Метод для вычисления выражения.
     *
     * @param expression строка выражения
     * @return результат вычисления
     */
    private double evaluateExpression(String expression) {
        Stack<Double> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();
        StringBuilder numberBuilder = new StringBuilder();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (Character.isDigit(ch) || ch == '.') {
                numberBuilder.append(ch);
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                if (numberBuilder.length() > 0) {
                    numbers.push(Double.parseDouble(numberBuilder.toString()));
                    numberBuilder.setLength(0);
                }
                while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(ch)) {
                    double b = numbers.pop();
                    double a = numbers.pop();
                    char operator = operators.pop();
                    numbers.push(operate(operator, a, b));
                }
                operators.push(ch);
            }
        }

        if (numberBuilder.length() > 0) {
            numbers.push(Double.parseDouble(numberBuilder.toString()));
        }

        while (!operators.isEmpty()) {
            double b = numbers.pop();
            double a = numbers.pop();
            char operator = operators.pop();
            numbers.push(operate(operator, a, b));
        }

        return numbers.pop();
    }

    /**
     * Метод для вычисления операции между двумя числами.
     *
     * @param b второй операнд
     * @param a первый операнд
     * @param operator операция
     * @return результат вычисления
     */
    private double operate(char operator, double b, double a) {
        switch (operator) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
            default: return 0;
        }
    }

    /**
     * Метод для определения приоритета операции.
     *
     * @param operator операция
     * @return приоритет операции
     */
    private int precedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        }
        if (operator == '*' || operator == '/') {
            return 2;
        }
        return 0;
    }

    /**
     * Настройка текстового поля для отображения результата.
     *
     * @return HBox с результатом
     */
    private HBox configureResultView() {
        HBox box = new HBox();
        box.setStyle("-fx-border-style: solid inside;" +
                "-fx-border-width: 1;" +
                "-fx-border-radius: 3;" +
                "-fx-border-color: gray;" +
                "-fx-padding: 25 2 6 30;" +
                "-fx-background-color: linear-gradient(to bottom," +
                " #d3eefb 0%,#f4f8f9 59%);");

        resultText.setTextAlignment(TextAlignment.RIGHT);
        resultText.setFont(new Font(40));
        box.getChildren().add(resultText);
        box.setAlignment(Pos.BOTTOM_RIGHT);

        return box;
    }

    /**
     * Настройка меню.
     *
     * @return bar
     */
    private MenuBar configureMenu() {
        MenuBar bar = new MenuBar();

        Menu view = new Menu("_Вид");
        Menu edit = new Menu("_Правка");
        Menu help = new Menu("_Справка");

        bar.getMenus().addAll(view, edit, help);

        return bar;
    }

    /**
     * Точка входа в программу.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        launch(args);
    }
}


