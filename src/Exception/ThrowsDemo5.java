package Exception;

import java.util.Scanner;

public class ThrowsDemo5 {
    public void getKey()  {
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter Key ");
        boolean flag = false;
        while(!flag) {
            String key = myScanner.nextLine();
        try {
            printDetails(key);
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
            }
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message );
    }

    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }
}