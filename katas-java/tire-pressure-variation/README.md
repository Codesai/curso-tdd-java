# Tire Pressure Monitoring System Variation

## Goal
Be able to test `Alarm`'s `check` function without changing the method signature.

1. Test the code with doubles created by you.

2. Test the code with doubles from a library.

## Tools
[Mockito](http://mockito.org/)

### Example of mock
```java
@Test
public void should_interact_with_the_mock() {
  Collaborator collaborator = mock(Collaborator.class);
  MyClass myClass = new MyClass(collaborator);

  myClass.run();

  verify(collaborator).collaborate();
}
```

### Example of stub

```java
@Test
public void should_retrieve_the_stub_response(){
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

