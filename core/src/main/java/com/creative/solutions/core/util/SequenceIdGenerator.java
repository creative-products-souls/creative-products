package com.creative.solutions.core.util;

public class SequenceIdGenerator {

    static Long current= System.currentTimeMillis();
    public static synchronized long getSequenceId(){
        return current++;
    }
}
