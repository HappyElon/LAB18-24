package ru.mirea.goncharov.LAB23.task4;

class Divide extends BinaryOperation {
    public Divide(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    int evaluate(int x) {
        return left.evaluate(x) / right.evaluate(x);
    }
}
