package Arguments;

public class Arguments {
    String [] args;

    public Arguments(String[] args) {
        this.args=args;
    }

    public void printArguments() {
        for (int i = args.length - 1; i >= 0; i--)
            System.out.println("Reverse: " + args[i]);
    }
}
