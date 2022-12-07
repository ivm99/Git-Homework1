package Seminar05_HW.View;

import java.util.Scanner;

import Seminar05_HW.LogManager;
import Seminar05_HW.Controller.UserController2;
import Seminar05_HW.Model.RationalNum;

public class ViewCalc2 {

    private UserController2 userController;
    private LogManager logManager;

    public ViewCalc2(UserController2 userController, LogManager logManager) {
        this.userController = userController;
        this.logManager = logManager;
    }

    public void run() {
        Commands com = Commands.NONE;
        while (true) {
            String command = promptStr("Введите операцию калькулятора (PLUS, MINUS, MULT, DIV): ");
            try {
                com = Commands.valueOf(command);
            } catch (IllegalArgumentException e) {
                System.out.println("Неопознанная команда");
                logManager.WriteLog().warning("Неопознанная команда");
            }
            if (com == Commands.EXIT)
                return;
            try {
                switch (com) {
                    case PLUS:
                        RationalNum num1 = setRatioanlNumber("Первое число (числитель): ",
                                "Первое число(знаменатель): ");
                        printFirstNumber(num1);
                        RationalNum num2 = setRatioanlNumber("Второе число (числитель): ",
                                "Второе число(знаменатель): ");
                        printSecondNumber(num2);
                        RationalNum result1 = userController.sum(num1, num2);
                        printResult(result1);
                        logManager.WriteLog().info(String.format("(%s) + (%s) = %s", num1, num2, result1));
                        break;
                    case MINUS:
                        RationalNum num3 = setRatioanlNumber("Первое число (числитель): ",
                                "Первое число (знаменатель): ");
                        printFirstNumber(num3);
                        RationalNum num4 = setRatioanlNumber("Второе число (числитель): ",
                                "Второе число (знаменатель): ");
                        printSecondNumber(num4);
                        RationalNum result2 = userController.sub(num3, num4);
                        printResult(result2);
                        logManager.WriteLog().info(String.format("(%s) - (%s) = %s", num3, num4, result2));
                        break;
                    case MULT:
                        RationalNum num5 = setRatioanlNumber("Первое число (числитель): ",
                                "Первое число (знаменатель): ");
                        printFirstNumber(num5);
                        RationalNum num6 = setRatioanlNumber("Второе число (числитель): ",
                                "Второе число (знаменатель): ");
                        printSecondNumber(num6);
                        RationalNum result3 = userController.mult(num5, num6);
                        printResult(result3);
                        logManager.WriteLog().info(String.format("(%s) * (%s) = %s", num5, num6, result3));
                        break;
                    case DIV:
                        RationalNum num7 = setRatioanlNumber("Первое число (числитель): ",
                                "Первое число (знаменатель): ");
                        printFirstNumber(num7);
                        RationalNum num8 = setRatioanlNumber("Второе число (числитель): ",
                                "Второе число (знаменатель): ");
                        printSecondNumber(num8);
                        RationalNum result4 = userController.div(num7, num8);
                        printResult(result4);
                        logManager.WriteLog().info(String.format("(%s) / (%s) = %s", num7, num8, result4));
                        break;

                }
            } catch (Exception e) {
                System.out.println("Нужно ввести целое число");
                logManager.WriteLog().warning("Нужно ввести целое число");
            }
        }
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextInt();
    }

    private String promptStr(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private RationalNum setRatioanlNumber(String nominator, String denominator) {
        int nom = promptInt(nominator);
        int denom = promptInt(denominator);
        if (denom == 0) {
            System.out.println("В знаменателе не может стоять ноль");
            return null;
        }
        return new RationalNum(nom, denom);

    }

    private void printFirstNumber(RationalNum num) {
        System.out.printf("Первое число: %s\n", num);
    }

    private void printSecondNumber(RationalNum num) {
        System.out.printf("Второе число: %s\n", num);
    }

    private void printResult(RationalNum result) {
        System.out.printf("Результат: %s\n", result);
    }
}
