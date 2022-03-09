
// String interpolation
def greet(String salute, Closure<String> who) {
    def greeting = "$salute ${who()}"

    println greeting
}


greet "Hello", { "World" }



// Closure as last argument
// can go outside parentheses

greet("Hello") {
    "World"
}

