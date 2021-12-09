package Exception;

public class ThrowsDemo2 {

    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println( message );
    }

    public String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException( "null key in getDetails" );
        }
        return "data for " + key; }
}
