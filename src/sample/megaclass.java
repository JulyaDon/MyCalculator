package sample;

/**
 * Created by July on 05.08.2016.
 */
public class megaclass {
    static{
        /*String Path = "D:\\users\\andrew\\documents\\visual studio 2015\\Projects\\MathLibrary\\x64\\Debug\\MathLibrary.dll";
        System.load(Path);
        */
        System.loadLibrary("CalculatorDLL");

    }

    native public static double Multi(double a, double b);
    native public static double Del(double a, double b);
    native public static double Plus(double a, double b);
    native public static double Minus(double a, double b);
}
