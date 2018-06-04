import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class FileReader
{
    public void Read() throws IOException
    {
        File currentDirFile = new File("dane.txt");
        String path = currentDirFile.getAbsolutePath();

        /*List<Person> personsMin = Files.lines(Paths.get(path))
                .map(mapLineToPerson)
                .filter(p->p.getNationality().equals("PL"))
                //.peek(p -> System.out.println(p.getName()))
                .sorted(Comparator.comparing(Person::getSalary))
                .limit(2)
                .collect(Collectors.toList());*/

        int max = Files.lines(Paths.get(path))
                .map(this::apply)
                .filter(p->p.getNationality().equals("PL"))
                //.peek(p -> System.out.println(p.getName()))
                .sorted(Comparator.comparing(Person::getSalary).reversed())
                .limit(2)
                .mapToInt(Person::getSalary)
                .sum();

        int min = Files.lines(Paths.get(path))
                .map(this::apply)
                .filter(p->p.getNationality().equals("PL"))
                //.peek(p -> System.out.println(p.getName()))
                .sorted(Comparator.comparing(Person::getSalary))
                .limit(2)
                .mapToInt(Person::getSalary)
                .sum();

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    public Person apply(String line)
    {
        List<String> PersonPieces = Arrays.asList(line.split(" "));
        return new Person(PersonPieces.get(0),PersonPieces.get(1),PersonPieces.get(2),Integer.parseInt(PersonPieces.get(3)));
    }
}
