class GreetScript extends DelegatingScript {
    def greet(greeting) {
        println greeting
    }

    @Override
    Object run() {
        return null
    }
}