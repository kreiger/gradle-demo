
// { Closure } instead of () -> lambda
def greeting = { "Hello World" }


// Closure can take parameters, in this case another closure
def greet = { greetingClosure ->
    println greetingClosure()
}


// Closures can be called just like methods
greet greeting

greet { "Hello World" }
