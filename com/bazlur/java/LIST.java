package com.bazlur.java;

import java.util.ArrayList;
import java.util.List;

public class LIST {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>() {
            {
                add("Sourov");
                add("Shaon");
                add("saikat");
            }
        };

        System.out.println(names);
    }
}