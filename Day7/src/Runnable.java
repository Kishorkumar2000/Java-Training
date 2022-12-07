////1. Write a Java program to perform a runnable interface, take two threads t1 and t2 ,
//// set their names and fetch the names of the thread.
//import java.io.*;
//
//public class Runnable
//{
//        // Class 1
//        // Helper class extending Thread class
//        // run() method for thread which is called
//        // as soon as start() is called over threads
//        @Override
//        public void run()
//        {
//            // Print statement when run() is called over thread
//            System.out.println("Thread is running.....");
//        }
//    }
//           // Class 2
//           // Main class
//    class Threadname implements Thread
//    {
//           // Main driver method
//        public static void main(String[] args)
//        {
//            // Creating two threads via above class
//            // as it is extending Thread class
//            Runnable t1 = new Runnable();
//            Runnable t2 = new Runnable();
//            // Fetching the above created threads names
//            // using getName() method
//            System.out.println("Thread 1: " + t1.getName());
//            System.out.println("Thread 2: " + t2.getName());
//            // Starting threads using start() method
//            t1.start();
//            t2.start();
//            // Now changing the name of threads
//            t1.setName("Kishorkumar");
//            t2.setName("QA");
//            // Again getting the new names of threads
//            System.out.println("Thread names after changing the names");
//            // Printing the above names
//            System.out.println("New Thread 1 name: "+ t1.getName());
//            System.out.println("New Thread 2 name: "+ t2.getName());
//        }
//    }
//
