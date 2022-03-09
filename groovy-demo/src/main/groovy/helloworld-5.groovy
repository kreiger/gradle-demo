import groovy.transform.BaseScript
@BaseScript GreetScript baseScript
baseScript.setDelegate(new HelloWorldGreeting())


def greeting = salute() + who()

greet greeting // Hello World

