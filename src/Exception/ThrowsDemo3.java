package Exception;

public class ThrowsDemo3 {

    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println( message );
    }

    public String getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        } catch (NullPointerException e) {
            System.out.println("You get Exception <NULL?>");
        }
        return "data for " + key;
    }
}

