package me.ups3t.leetcodestuffs.learning.bitwise_operator;

public class BitwiseOperators {

    public int bitwise(OperatorType type, int a, int b) {
        switch(type) {

            case AND:
                return a & b;

            case OR:
                return a | b;

            case XOR:
                return a ^ b;
        }

        return -1;
    }

    public int complement(int i) {return ~i;};

    public static void main(String[] args) {

        BitwiseOperators operators = new BitwiseOperators();

        int ex1 = 5;
        int ex2 = 7;

        System.out.println("-- Bitwise Operators --");

        System.out.println("\n(Numbers being used: " + ex1 + ", " + ex2 + ")\n");

        System.out.println("-> Bitwise and: " + operators.bitwise(OperatorType.AND, ex1, ex2));
        System.out.println("-> Bitwise or: " + operators.bitwise(OperatorType.OR, ex1, ex2));
        System.out.println("-> Bitwise xor: " + operators.bitwise(OperatorType.XOR, ex1, ex2));

        System.out.println("-> Complement: " + operators.complement(ex1));

    }

}
