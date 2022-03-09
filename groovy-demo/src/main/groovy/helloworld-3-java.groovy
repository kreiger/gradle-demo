import java.util.function.Supplier

void greet(String salute, Supplier<String> who) {
    String greeting = salute + " " + who.get();

    System.out.println(greeting);
}


greet("Hello", () -> "World");






greet("Hello", () -> {
    "World"
});
