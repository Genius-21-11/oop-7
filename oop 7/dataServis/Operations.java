package dataServis;

import data.Komplex;
import data.Numbers;
import data.Rational;

public interface Operations {
    Rational sum(Rational num, Rational num2);
    Komplex sum(Komplex num, Komplex num2);
    Rational raznoct(Rational number, Rational number2);
    Komplex raznoct(Komplex number, Komplex number2);
    Rational multy(Rational number, Rational number2);
    Komplex multy(Komplex number, Komplex number2);
    Rational div(Rational number, Rational number2);
    Komplex div(Komplex number, Komplex number2);
}