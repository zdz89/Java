import java.io.IOException;
import java.net.URL;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.*;

public class CyclingRace {

    final int raceSize = 15;
    static int loop = 0;
    Set<String> _cyclistsNames = new HashSet<>();
    PriorityQueue<Cyclist> _sortedCyclists = new PriorityQueue<>();
    Logger logger = MyLogger.logger;

    void StartRace() {
        logger.info("Wyścig rozpoczęty");
        ScheduledExecutorService execService = Executors.newScheduledThreadPool(5);

        Runnable task = () -> {

            Cyclist c = new Cyclist(_cyclistsNames.toArray()[loop].toString(),CountTime());

            _sortedCyclists.add(c);
            System.out.println("Zawodnik (" + _sortedCyclists.size() + ") ukończył wyścig: " + c._Surname + " " + c._Time + "s");
            logger.info("Zawodnik (" + _sortedCyclists.size() + ") ukończył wyścig: " + c._Surname + " " + c._Time + "s");

            int t = _sortedCyclists.size() > 3 ? 3 : _sortedCyclists.size();

            System.out.println("Aktualna czołówka:");

            for (int i = 0; i < t; i++) {

                Cyclist cyclist = (Cyclist)_sortedCyclists.toArray()[i];
                System.out.println(cyclist._Surname + " " + cyclist._Time + "s");
            }

            System.out.println("--------------------");
            loop++;

            if(loop == 15) {
                execService.shutdown();
                logger.info("Wyścig zakończony");
            }
        };

        ScheduledFuture f = execService.scheduleWithFixedDelay(task, 0, 1, TimeUnit.SECONDS);
    }

    private int CountTime() {
        double temp = new Random().nextGaussian()*100+300;
        return (int)temp > 370 ? 370 : (int)temp < 250 ? 250 : (int)temp;
    }

    void GetCyclists()
    {
        try
        {
            URL url = new URL("http://szgrabowski.kis.p.lodz.pl/zpo17/nazwiska.txt");
            Scanner s = new Scanner(url.openStream());

            List<String> uniqueList = new ArrayList<>();

            while (s.hasNext())
            {
                uniqueList.add(s.next());
            }

            while (_cyclistsNames.size() < raceSize) {
                _cyclistsNames.add(uniqueList.get(new Random().nextInt(uniqueList.size()))
                );
            }

            logger.info("Pobrano listę zawodników");
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
