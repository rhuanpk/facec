package view;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private static final String DEFAULT_TITLE = "===== MENU =====";
    private static final String DEFAULT_PROMPT = "Option: ";

    private String title;
    private String prompt;
    private ArrayList<String> options;

    public Menu() {
        title = DEFAULT_TITLE;
        prompt = DEFAULT_PROMPT;
        options = new ArrayList<>();
    }

    public Menu(String title, String prompt) {
        this.title = title;
        this.prompt = prompt;
        options = new ArrayList<>();
    }

    public Menu(String... options) {
        title = DEFAULT_TITLE;
        prompt = DEFAULT_PROMPT;
        this.options = new ArrayList<>(List.of(options));
    }

    public Menu(String title, String prompt, String... options) {
        this.title = title;
        this.prompt = prompt;
        this.options = new ArrayList<>(List.of(options));
    }

    public void print() {
        IO.println(title);
        options.forEach(IO::println);
        IO.print(prompt);
    }

    public void print(String title, String prompt) {
        IO.println(title);
        options.forEach(IO::println);
        IO.print(prompt);
    }

    public void print(String... options) {
        IO.println(title);
        if (options != null) {
            for (String option : options) {
                IO.println(option);
            }
        }
        IO.print(prompt);
    }

    public void print(String title, String prompt, String... options) {
        IO.println(title);
        if (options != null) {
            for (String option : options) {
                IO.println(option);
            }
        }
        IO.print(prompt);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

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
