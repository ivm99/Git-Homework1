package Seminar05_HW.View;

import java.util.Scanner;

import Seminar05_HW.LogManager;
import Seminar05_HW.Controller.UserController;
import Seminar05_HW.Model.ComplexNum;

public class ViewCalc {

    private UserController userController;
    private LogManager logManager;

    public ViewCalc(UserController userController, LogManager logManager ) {
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
                        ComplexNum num1 = setComplexNumber("Первое число: действ.часть: ", "Первое число: мним.часть: ");
                        printFirstNumber(num1);
                        ComplexNum num2 = setComplexNumber("Второе число: действ.часть: ", "Второе число: мним.часть: ");
                        printSecondNumber(num2);
                        ComplexNum result1 = userController.sum(num1, num2);
                        printResult(result1);
                        logManager.WriteLog().info(String.format("(%s) + (%s) = %s", num1, num2, result1));
                        break;
                    case MINUS:
                        ComplexNum num3 = setComplexNumber("Первое число: действ.часть: ", "Первое число: мним.часть: ");
                        printFirstNumber(num3);
                        ComplexNum num4 = setComplexNumber("Второе число: действ.часть: ", "Второе число: мним.часть: ");
                        printSecondNumber(num4);
                        ComplexNum result2 = userController.sub(num3, num4);
                        printResult(result2);
                        logManager.WriteLog().info(String.format("(%s) - (%s) = %s", num3, num4, result2));
                        break;
                    case MULT:
                        ComplexNum num5 = setComplexNumber("Первое число: действ.часть: ", "Первое число: мним.часть: ");
                        printFirstNumber(num5);
                        ComplexNum num6 = setComplexNumber("Второе число: действ.часть: ", "Второе число: мним.часть: ");
                        printSecondNumber(num6);
                        ComplexNum result3 = userController.mult(num5, num6);
                        printResult(result3);
                        logManager.WriteLog().info(String.format("(%s) * (%s) = %s", num5, num6, result3));
                        break;
                    case DIV:
                        ComplexNum num7 = setComplexNumber("Первое число: действ.часть: ", "Первое число: мним.часть: ");
                        printFirstNumber(num7);
                        ComplexNum num8 = setComplexNumber("Второе число: действ.часть: ", "Второе число: мним.часть: ");
                        printSecondNumber(num8);
                        ComplexNum result4 = userController.mult(num7, num8);
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

    private ComplexNum setComplexNumber(String realSt, String imgSt) {
        return new ComplexNum(promptInt(realSt), promptInt(imgSt));
    }

    private void printFirstNumber(ComplexNum num) {
        System.out.printf("Первое число: %s\n", num);
    }

    private void printSecondNumber(ComplexNum num) {
        System.out.printf("Второе число: %s\n", num);
    }

    private void printResult(ComplexNum result) {
        System.out.printf("Результат: %s\n", result);
    }
}

