package com.codefellows;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Developer dev1 = new Developer("Cathy","Oun",25);
        dev1.doWork();
        dev1.eat();
        dev1.drink();
        System.out.println();

        Designer designer1 = new Designer("Shelly", "Oun", 26);
        designer1.doWork();
        System.out.println();

        Boss myBoss = new Boss("Daddy","Big",60);

    }

}
