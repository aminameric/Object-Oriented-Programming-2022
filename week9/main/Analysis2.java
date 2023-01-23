package week9.main;

import java.io.File;

public class Analysis2 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\User\\IdeaProjects\\LABS\\src\\com\\Week9\\mooc\\testfile\\txt");
        Analysis analysis = new Analysis(file);
        System.out.println("Lines: " + analysis.lines());
        System.out.println("Lines: " + analysis.lines());
        System.out.println("Characters: " + analysis.characters());
    }
}
