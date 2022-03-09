def greetClosure = {
    def greeting = salute() + who()

    println greeting
}

// a delegate is a third party object where methods calls or properties are resolved in the closure
greetClosure.delegate = new HelloWorldGreeting()

greetClosure() // Hello World


