import java.util.function.*

Supplier<String> greeting = () -> "Hello World";



Consumer<Supplier<String>> greet = (Supplier<String> greetingSupplier) -> {
    System.out.println(greetingSupplier.get());
}



greet.accept(greeting);

greet.accept(() -> "Hello World");
