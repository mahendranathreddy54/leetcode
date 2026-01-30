package com.leet.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SingleFunction {

    String[] solution(String[][] queries) {
        List<Integer> list = new ArrayList<>();
        String[] result = new String[queries.length];

        for(int i = 0; i < queries.length; i++){
            String operation = queries[i][0];
            int value = Integer.parseInt(queries[i][1]);

            switch(operation){
                case "ADD":
                    list.add(value);
                    result[i] = "";
                    break;
                case "EXISTS":
                    result[i] = list.contains(value) ? "true" : "false";
                    break;
                case "REMOVE":
                    result[i] = list.remove(Integer.valueOf(value)) ? "true" : "false";
                    break;
                case "GET_NEXT":
                    Collections.sort(list);
                    result[i] = "";
                    for(int num : list){
                        if(num > value){
                            result[i] = String.valueOf(num);
                            break;
                        }
                    }
                    break;
            }
        }
        return result;
    }
}
