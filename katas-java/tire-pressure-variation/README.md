# Tire Pressure Monitoring System Variation

## Goal
Be able to test `Alarm`'s `check` function without changing the method signature.

1. Test the code using test doubles created by you.

2. Test the code using test doubles created with a library.

## Tools
[Mockito](http://mockito.org/)

### Example of spying an interaction
```java
interface Collaborator {
  void collaborate();
}

class MyClass {
  private final Collaborator collaborator;

  public MyClass(Collaborator collaborator) {
    this.collaborator = collaborator;
  }

  public void run() {
    collaborator.collaborate();
  }
}

@Test
public void example_of_spying_an_interaction() {
  Collaborator collaborator = mock(Collaborator.class);
  MyClass myClass = new MyClass(collaborator);

  myClass.run();

  verify(collaborator).collaborate();
}
```

### Example of stubbing an interaction

```java
interface Collaborator {
  String collaborate();
}

class MyClass {
  private final Collaborator collaborator;

  public MyClass(Collaborator collaborator) {
    this.collaborator = collaborator;
  }

  public String run() {
    return collaborator.collaborate();
  }
}

@Test
public void example_of_stubbing_an_interaction() {
  Collaborator collaborator = mock(Collaborator.class);
  String collaboratorResponse = "some response";
  when(collaborator.collaborate()).thenReturn(collaboratorResponse);
  MyClass myClass = new MyClass(collaborator);

  String result = myClass.run();

  assertEquals(result, collaboratorResponse);
}
```

## Learnings
How to build a Spy and a Stub manually.

How to use Mockito to generate the test doubles.

## References

Based on an exercise from [Luca Minudel](https://twitter.com/lukadotnet?lang=en)'s [TDD with Mock Objects And Design Principles exercises](https://github.com/lucaminudel/TDDwithMockObjectsAndDesignPrinciples)

