# OOP : Object Oriented Programming

## OOP의 특징

- Encapsulation : 캡슐화
  - 클래스 안에 정의하고, 숨기는 것
- Inheritance : 상속
  - 객체의 속성 및 기능을 받아서 사용
- Polymorphism : 다형성
  - 하나의 형태가 다양한 기능을 하는 것
- Abstraction : 추상화
  - 현실을 객체화

**Object(객체) -> Class(클래스) -> 특성(Attribute(정적), Behavior(동적))**



## Class

> Object의 분류를 통해 Class를 도출하고, 필요한 attribute와 behavior를 도출한 후 생성한다.

### 클래스 생성

```java
// public 은 Modifier 이다.
public class 클래스명(대문자시작){
    public 변수type 변수명;	// attribute
    ...
        
    public returnType 함수명(){	// behavior
        
    }
}
```



### 클래스 사용

```java
클래스명 변수명 = new 클래스명();		// 클래스명을 함수처럼 하여 생성자(Constructor)로 쓴다
선언한변수명.내부에있는변수명 = "something";
클래스로선언한변수명.내부함수()
```



### 생성자 : Constructor

```java
public class 클래스명{
    public 클래스명(변수도 입력 가능하다){
        // 해당 클래스의 변수 값을 생성자로 입력받은 변수로 할당
        this.변수명 = 생성자로 입력받은 변수명
    }
}
```

위와 같이 생성자를 추가하면 추가된 생성자만 사용가능하다.

즉, 기본 생성자는 이제 사용할수 없다.(아니면 기본 생성자 형식으로 새로 만들어줘야한다.)



### 클래스의 변수 할당

- 클래스 안에 값 부여
- 생성자로 값 부여
- 클래스 선언 이후 `변수.내부변수` 형태로 값 부여

마지막 방법인 직접 값을 변경하는 경우 OOP에 어긋나게 된다. 클래스 외부가 아닌 내부에서 제어하게끔 만들어줘야한다.

이러한 이유로 **Setters**를 사용하게 된다.

### Setters

```java
// 클래스 내부 함수
public void setSomething(입력받을변수){
    this.변수 = 입력받은변수
}

클래스객체.setSomething("something")
```

### Getters

```java
// 클래스 내부 함수
public 타입 getSomething(){
    return 변수;
}

// 클래스 내부의 값을 가져온다.
클래스객체.getSomething()
```

### Private

**Getters**와 **Setters**가 있다고 해도 여전히 번수에 직접 접근이 가능하다.

그렇기 때문에 `private 변수타입 변수명` 을 이용해서 직접 접근을 막는다.



## 배열과의 조합

임의로 선언한 클래스 역시 배열로 선언할 수 있다.

```java
// 정수의 배열 선언하듯이
int[] intArray = new int(배열크기);
// 클래스도 배열 선언할 수 있다.
클래스명[] somethingArray = new 클래스명[배열크기];
// 해당 배열에는 클래스의 객체만 들어갈수 있다.
```



## JVM 메모리

자바는 메모리 관리로부터 비교적 자유로운 언어이지만 그래도 기본은 알고 있어야 한다.

- **Class Area(Method Area)** : Class, Static, Method
- **Heap** : Object(객체)와 그의 주소
- **Stack** : 함수 및 변수가 호출되는대로 만들어지고 사라진다.

## Garbage Collection

자바는 new 를 통해서 메모리에 입력을 한다. 이후 Heap에 만들어진 객체 중 더이상 참조되지 않는 것은 자동으로 Garbage Collection 작업을 수행한다.



# String

> 자바의 Primitive 타입이 아닌 문자열을 표현하기 위한 내장 클래스이다.

다른 클래스와 동일하게 취급되어 Heap 메모리로 관리된다.

## toString()

> 객체를 문자화하여 표현하는 방법

클래스에 `toString()` 메서드를 추가 및 재정의해서 객체를 표현하게끔 한다.



# Package

> 전체적인 자바 Class를 관리하기 위해 Package를 사용한다. (마치 폴더처럼)
>
> 보통 도메인의 역순을 사용한다.(com.something.some)

java.lang 패키지는 자동으로 들어온다.

## 패키지의 접근 권한

> 앞에 붙는 Access Modifier에 따라 권한이 다르다.

| 구분      | 같은 클래스 | 같은 패키지 | 다른 클래스(상속) |  전체  |
| --------- | :---------: | :---------: | :---------------: | :----: |
| private   |    가능     |   불가능    |      불가능       | 불가능 |
| 기본값    |    가능     |    가능     |      불가능       | 불가능 |
| protected |    가능     |    가능     |       가능        | 불가능 |
| public    |    가능     |    가능     |       가능        |  가능  |

## import

다른 Package에 있는 Java 클래스(혹은 모듈)을 가져오기 위해선 `import 가져올모듈경로` 를 사용한다.



