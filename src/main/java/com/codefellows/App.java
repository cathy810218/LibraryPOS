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
        System.out.println(dev1.toString() + " job title: " + dev1.jobTitle() + " with salary: " + dev1.salary());
        dev1.doWork();
        System.out.println();

        Designer designer1 = new Designer("Shelly", "Oun", 26);
        System.out.println(designer1.toString() + " job title: " + designer1.jobTitle() + " with salary: " + designer1.salary());
        designer1.doWork();
        System.out.println();

        Boss myBoss = new Boss("Daddy","Big",60);
        System.out.println(myBoss.toString() + " job title: " + myBoss.jobTitle() + " with salary: " + myBoss.salary());


    }

}
