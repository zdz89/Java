import java.text.DecimalFormat;
import java.util.*;
import static java.lang.Math.round;

public class PolEngTest
{
    Scanner scanner = new Scanner(System.in);

    public Set<Question> questions = new HashSet<Question>();
    public double time;
    public int score;

    public PolEngTest()
    {
        time = 0;
        score = 0;
        List<Question> temp = JsonHelper.GetQuestions();

        while(questions.size() < 5)
        {
            questions.add(temp.get(new Random().nextInt(temp.size())));
        }
    }

    public void Start()
    {
        long start = System.nanoTime();

        for (Question q:questions)
        {
            System.out.println(q.Pol);
            String answer = scanner.nextLine();

            for (String e:q.Eng)
            {
                if(e.equals(answer.toLowerCase()))
                {
                    score++;
                    continue;
                }
            }
        }

        time = (System.nanoTime() - start)/1000000000.0;
        Stop();

        System.out.println("Wynik: " + score);
        DecimalFormat df = new DecimalFormat("##.0");
        System.out.println("Czas: " + df.format(time) + "s");
    }

    private void Stop()
    {
        JsonHelper.WriteJson(questions);
    }
}
