package com.wind.study.collection.set;

import java.util.EnumSet;

enum Season{
    /**
     * 季节
     */
    SPRING,SUMMER,AUTUMN,WINTER
}

/**
 * @author hsc
 */
public class EnumsetTest {
    public static void main(String[] args) {
        EnumSet  e = EnumSet.allOf(Season.class);
        System.out.println(e);
        EnumSet<Season> seasons = EnumSet.noneOf(Season.class);
        seasons.add(Season.SPRING);
        System.out.println("seasons = " + seasons);
        EnumSet<Season> spring = EnumSet.of(Season.SPRING, Season.SUMMER);
        System.out.println("spring = " + spring);
    }
}
