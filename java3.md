# JAVA OOP : Object Oriented Programming

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

