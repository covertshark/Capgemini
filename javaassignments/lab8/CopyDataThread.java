package com.javaassignments.lab8;

import java.io.*;

public class CopyDataThread implements Runnable {

    private BufferedReader bReader;
    private PrintWriter writer;

    public CopyDataThread(BufferedReader bReader, PrintWriter writer){
         this.bReader = bReader;
         this.writer = writer;
    }

    @Override
    public void run() {
        try {
            String readable = bReader.readLine(); //Reading the whole line in the Source
            int count = 0;
            while (count <= readable.length()) { //Loop executes until the count value surpasses the length of char in Source
                 String nextRead = null;
                 if(count+10 <= readable.length()) { //Print 10 characters when 10 or more characters are available in the buffer
                        nextRead = readable.substring(count, count + 10);
                        System.out.println("10 Characters Copied");
                 }
                else{ //For the last set if 10 characters are not available, print whatever remains in the buffer
                    nextRead = readable.substring(count);
                    System.out.println("Copied All Characters");
                }
                System.out.println(nextRead); //Debug purpose
                writer.write(nextRead); //Writes to the writable file
                count = count + 10; //Increment the count value to get next 10 characters in the substring
                Thread.sleep(5000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
             if(writer!=null){
                 writer.close(); //Close the writer to flush anything that remains(Mandatory step)
            }
        }
}
}
