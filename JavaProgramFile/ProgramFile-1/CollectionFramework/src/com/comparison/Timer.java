package com.comparison;
public class Timer{
static long startTime,endTime;
public static void startTimer()
{
startTime=System.nanoTime();
}
public static void stopTimer()
{
endTime=System.nanoTime();
System.out.println("Execution time:"+(endTime-startTime));
}

}
