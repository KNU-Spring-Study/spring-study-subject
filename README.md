# Week 1

**객체 지향 5가지 원칙**을 공부하고 코드에서 **어떻게 적용해 보면 좋을지**에 대해 이야기를 나눴다.

**SRP(단일 책임 원칙), OCP(개방 폐쇄 원칙), DIP(의존성 역전 원칙)** 등을 준수하기 위해 코드를 변경했다.

`ListRepository`와 `MapRepository`가 `Repository` 인터페이스의 구현체가 되어,
`Service` 코드에서 인터페이스 객체가 구현체 인스턴스를 참조하도록 변경했다.

<br/>

### 다형성을 활용

```java
public class Service {

    private final Repository repository = new ListRepository();
    
}
```

SRP, OCP, DIP를 준수하는 코드가 되었을까?

아니다.

만약 `ListRepository`가 아닌 `MapRepository`를 사용해야 한다면, **`Service` 코드에 아래와 같이 변경이 발생**한다.

<br/>

### `ListRepository` -> `MapRepository`

```java
public class Service {
                                       // new ListRepository();
    private final Repository repository = new MapRepository();
    
}
```
<br/>

### `Repository`에 의존하는 모든 객체에 변경이 필요하다.

이렇게만 보면 원칙을 위배하지 않는 코드 같을 수 있다. 하지만 `ListRepository`를 사용하고 있던 `Service`와 같은 객체들이 수십 개가 있다고 해 보자.
그럼 그 **수십 개가 되는 객체에 모두 코드 수정이 필요**하다.

이때 **의존관계를 주입해 주는 친구**를 사용하면 그럴 필요가 없어진다.

<br/>

### 의존관계 주입
```java
public class AppConfig {
    
    public Repository repository() {
        return new MapRepository();
    }
}
```
`AppConfig` 친구를 사용하여 의존관계를 주입하자.
```java
public class Service {

    AppConfig appConfig = new AppConfig();
    private final Repository repository = appConfig.repository();
    
    ...
}
```

**`Repository`를 의존하는 모든 객체가 처음부터 의존관계를 주입받는 형식이라면,
`Repository` 구현체를 변경해야 하는 상황이 와도, `AppConfig`의 코드만 수정하면 된다.**

생성자를 통해 주입받는 방법은 코드를 참고하자.