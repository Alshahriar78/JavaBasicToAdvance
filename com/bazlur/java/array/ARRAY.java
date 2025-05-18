package com.bazlur.java.array;

public class ARRAY {

        public static void main(String[] args) {
            String[] names = {"Alice", "Bob", "Charlie"};

            for (int i = 0; i < names.length; i++) {
                System.out.println("names[" + i + "] hashcode: " + System.identityHashCode(names[i]));
            }
        }


}
