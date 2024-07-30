public class Logger {
    
    private static Logger instance;

    
    private Logger() {
        
        {
            System.out.println("Singleton is Instantiated.");
        }
    }

    
    public static Logger getInstance() {
        if (instance == null)
            instance = new Logger();
        return instance;
    }

    public static void doSomething() {
        System.out.println("Something is Done.");
    }
}

public class GFG {
    public static void main(String[] args)
    {
        Logger.getInstance().doSomething();
    }
}