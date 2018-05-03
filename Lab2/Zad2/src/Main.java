import java.io.IOException;
import java.net.URL;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args)
    {
        MyLogger myLogger = new MyLogger("MyLogger.txt");

        CyclingRace race = new CyclingRace();
        race.GetCyclists();
        race.StartRace();
    }
}
