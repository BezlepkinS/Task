package Exception;

public class ThrowsDemo1 {
    public void getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        } catch (NullPointerException e) {
            System.out.println("You get Exception");
        }
    }
}

