import java.util.ArrayList;
import java.util.List;

public class Menu {
    // constants
    private final String DEFAULT_PROMPT = "Answer: ";

    // attributes
    private String prompt;
    private ArrayList<String> options;

    // constructors
    public Menu() {
        prompt = DEFAULT_PROMPT;
        options = new ArrayList<>();
    }

    public Menu(String prompt) {
        this.prompt = prompt;
        options = new ArrayList<>();
    }

    public Menu(String... options) {
        prompt = DEFAULT_PROMPT;
        this.options = new ArrayList<>(List.of(options));
    }

    public Menu(String prompt, String... options) {
        this.prompt = prompt;
        this.options = new ArrayList<>(List.of(options));
    }

    // methods
    public void print() {
        options.forEach(IO::println);
        IO.println(prompt);
    }

    public void print(String prompt) {
        options.forEach(IO::println);
        IO.println(prompt);
    }

    public void print(String... options) {
        if (options != null) {
            for (String option : options) {
                IO.println(option);
            }
        }
        IO.println(prompt);
    }

    public void print(String prompt, String... options) {
        if (options != null) {
            for (String option : options) {
                IO.println(option);
            }
        }
        IO.println(prompt);
    }

    // constructors
    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public void setOptions(String... options) {
        this.options = new ArrayList<>(List.of(options));
    }
}
