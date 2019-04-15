package com.company;

import com.company.task_1.IntegerConvert;
import com.company.task_10.PointMutators;
import com.company.task_11_12.Employee;
import com.company.task_11_12.LargestAndAverage;
import com.company.task_11_12.SetEmployer;
import com.company.task_13.FileSorting;
import com.company.task_14_15.LabeledPoint;
import com.company.task_14_15.PointTask;
import com.company.task_2.AngleNormalizer;
import com.company.task_3.ThreeIntegersComparison;
import com.company.task_4.FactorialComputing;
import com.company.task_5.AllNonemptySubstrings;
import com.company.task_6.RandomString;
import com.company.task_7.NotASCII;
import com.company.task_8.SwapContent;
import com.company.task_9.Point;
import org.omg.CORBA.IntHolder;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int task;
        System.out.println("Choose task ");
        do {
            System.out.println();
            System.out.print("Task = ");
            task = sc.nextInt();
            System.out.println();
            switch (task) {
                case 0:
                    break;
                case 1:
                    IntegerConvert.convert(4452);
                    break;
                case 2:
                    AngleNormalizer.normalize(360);
                    AngleNormalizer.mathNormalize(360);
                    break;
                case 3:
                    ThreeIntegersComparison.compare(4, 5, 6);
                    ThreeIntegersComparison.mathCompare(4, 5, 6);
                    break;
                case 4:
                    FactorialComputing.showFactorial(-52);
                    break;
                case 5:
                    AllNonemptySubstrings.printAllSubstrings("Hello    Worfld ! ");
                    break;
                case 6:
                    RandomString.showRandomString();
                    break;
                case 7:
                    NotASCII.printNotASCII(" grewg rewg erewgg șâțșțșp  汉字 Tra      dition al Chinese 漢字漢字漢字漢字 \u00A9");
                    break;
                case 8:
                    IntHolder num1 = new IntHolder(5);
                    IntHolder num2 = new IntHolder(7);
                    SwapContent.swap(num1, num2);
                    break;
                case 9:
                    Point p = new Point(3, 4).translate(1, 4).scale(0.5);
                    System.out.println(p.getX() + " " + p.getY());
                    System.out.println(p.getX() + " " + p.getY());
                    break;
                case 10:
                    PointMutators pointMutators = new PointMutators();
                    System.out.println(pointMutators.getX() + " " + pointMutators.getY());
                    pointMutators.translate(5, 8);
                    System.out.println(pointMutators.getX() + " " + pointMutators.getY());
                    pointMutators.scale(2);
                    System.out.println(pointMutators.getX() + " " + pointMutators.getY());
                    break;
                case 11:
                    System.out.println("The average salary in the company = " + LargestAndAverage.average(SetEmployer.setEmployer()) + " $");
                    break;
                case 12:
                    System.out.println("The largest salary has " + ((Employee) LargestAndAverage.largest(SetEmployer.setEmployer())).getName());
                    break;
                case 13:
                    FileSorting.sorting(new File("D:\\IntelliJ\\laborator\\task_13"));
                    break;
                case 14:
                    PointTask pointTask = new PointTask(4, 5);
                    System.out.println("Point coordinates are : " + pointTask.getX() + " " + pointTask.getY());
                    LabeledPoint labeledPoint = new LabeledPoint("Name", 4, 5);
                    System.out.println("LabelPoint name is : " + labeledPoint.getLabel() + " \nLabelPoint coordinates are : " + pointTask.getX() + " " + pointTask.getY());
                    break;
                case 15:
                    PointTask pointTask1 = new PointTask(4, 5);
                    PointTask pointTask2 = new PointTask(44, 5);
                    System.out.println(pointTask1.hashCode());
                    System.out.println(pointTask1.equals(pointTask2));
                    System.out.println(pointTask1.toString());
                    LabeledPoint labeledPoint1 = new LabeledPoint("Name", 4, 5);
                    LabeledPoint labeledPoint2 = new LabeledPoint("anotherName", 4, 5);
                    System.out.println(labeledPoint1.hashCode());
                    System.out.println(labeledPoint1.equals(labeledPoint2));
                    System.out.println(labeledPoint1.toString());
                    break;
                default:
                    System.out.println("Insert correct task");
                    break;
            }
        } while (task != 0);
    }
}

