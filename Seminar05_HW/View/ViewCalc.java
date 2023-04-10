package Seminar05_HW.View;

import java.util.Scanner;

import Seminar05_HW.LogManager;
import Seminar05_HW.Controller.CalcController;
import Seminar05_HW.Model.ComplexNum;
import Seminar05_HW.Model.Num;
import Seminar05_HW.Model.RationalNum;

public class ViewCalc {

    private CalcController calcController;
    private LogManager logManager;

    public ViewCalc(CalcController userController, LogManager logManager ) {
        this.calcController = userController;
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
                        Num num1 = setNumber("Первое число (действ.часть): ", "Первое число (мним.часть): ");
                        printFirstNumber(num1);
                        Num num2 = setNumber("Второе число (действ.часть): ", "Второе число (мним.часть): ");
                        printSecondNumber(num2);
                        Num result1 = calcController.sum(num1, num2);
                        printResult(result1);
                        logManager.WriteLog().info(String.format("(%s) + (%s) = %s", num1, num2, result1));
                        break;
                    case MINUS:
                        Num num3 = setNumber("Первое число (действ.часть): ", "Первое число (мним.часть): ");
                        printFirstNumber(num3);
                        Num num4 = setNumber("Второе число (действ.часть): ", "Второе число (мним.часть): ");
                        printSecondNumber(num4);
                        Num result2 = calcController.sub(num3, num4);
                        printResult(result2);
                        logManager.WriteLog().info(String.format("(%s) - (%s) = %s", num3, num4, result2));
                        break;
                    case MULT:
                        Num num5 = setNumber("Первое число (действ.часть): ", "Первое число (мним.часть): ");
                        printFirstNumber(num5);
                        Num num6 = setNumber("Второе число (действ.часть): ", "Второе число (мним.часть): ");
                        printSecondNumber(num6);
                        Num result3 = calcController.mult(num5, num6);
                        printResult(result3);
                        logManager.WriteLog().info(String.format("(%s) * (%s) = %s", num5, num6, result3));
                        break;
                    case DIV:
                        Num num7 = setNumber("Первое число (действ.часть): ", "Первое число (мним.часть): ");
                        printFirstNumber(num7);
                        Num num8 = setNumber("Второе число (действ.часть): ", "Второе число (мним.часть): ");
                        printSecondNumber(num8);
                        Num result4 = calcController.div(num7, num8);
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

    private<T> Num <T> setNumber(String realSt, String imgSt) {
        return new ComplexNum(promptInt(realSt), promptInt(imgSt));
    }
    // @Override
    // private Num <RationalNum> setNumber(String realSt, String imgSt) {
    //     return new ComplexNum(promptInt(realSt), promptInt(imgSt));
    // }

    private void printFirstNumber(Num num) {
        System.out.printf("Первое число: %s\n", num);
    }

    private void printSecondNumber(Num num) {
        System.out.printf("Второе число: %s\n", num);
    }

    private void printResult(Num result) {
        System.out.printf("Результат: %s\n", result);
    }
}

