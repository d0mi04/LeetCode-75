package org.example.StringCompression;

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.compress(new char[]{'a', 'a', 'b', 'b', 'b'}));
        System.out.println(Solution.compress(new char[]{'a'}));
        System.out.println(Solution.compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'}));
    }
}
