import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;
import java.util.stream.Collectors;

public class Sami003 {
    public static void explore(String dir) throws IOException {
        Set<Path> children = Files.list(Paths.get(dir)).collect(Collectors.toSet());
        children.forEach(entry -> System.out.println(entry.getFileName()));
    }
    public static void tree(String dir) throws IOException {
        Sami003.printChildrenRec(dir, "");
    }

    private static void printChildrenRec(String dir, String prefix) throws IOException {
        Set<Path> children = Files.list(Paths.get(dir)).collect(Collectors.toSet());
        children.forEach(entry -> {
            System.out.println(prefix + entry.getFileName());
            if (entry.toFile().isDirectory()) {
                try {
                    printChildrenRec(entry.toString(), prefix+"\t");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
