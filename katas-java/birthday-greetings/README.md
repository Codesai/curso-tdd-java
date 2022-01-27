# Birthday Greetings Service Kata Variation

## Goal
Create a _BirthdayGreetingsService_ with a _greet_ method to greet all the users of your company for its birthday. The method shall
not receive any parameter or return anything.

1. We should create the class from scratch using TDD. We should create all the logic related of greeting a user, but not
real implementations of repository and sender are needed, only unit behaviour. 

2. As we do not want to send emails or use real user data we should focus on collaborating with other elements of our system.
   to retrieve canned users with data to test the logic of greeting a user if today its it's birthday.

## Tools
[Mockito](http://mockito.org/)

### Birthday Greetings Skeleton
```java
class BirthdayGreetingsService {
   ...
   public void greet() {
      ...
   }
   ...
}
```

## Learnings

How to use Mockito to generate the test doubles.

## References

Based on an exercise from [Mateo Vaccari](https://github.com/xpmatteo)'s [Birthday Greeting Refactoring Kata](https://github.com/xpmatteo/birthday-greetings-kata)

