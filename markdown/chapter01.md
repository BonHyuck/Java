# Chapter 01

> 자바의 기본 이해

## 자바의 특징

> 자바는 1995년 발표된 언어로 여러가지 특징이 있지만 그 중 대표 특징은 다음과 같다.

- **객체 지향**
  - 클래스와 상속으로 인해 **확장성이 우수**하며 **재사용성** 역시 높다.
- **플랫폼 독립성**
  - 리눅스, 윈도우 등 다양한 OS에서 개발 및 실행이 가능하다.
  - **자바 가상 머신 (Java Virtual Machine)** 을 통해 하나의 프로그램을 어디서든 실행 가능하다
- **뛰어난 에코 시스템**
  - 이용자가 많은 언어이기에 우수한 라이브러리, 미들웨어, 정보가 많다.

## 자바의 실행 순서

1. 자바 코드 작성
2. javac 커맨드를 통해 소스 코드를 컴파일 하고 **클래스 파일**이라 하는 중간 코드 생성
3. java 커맨드를 통해 JVM이 클래스 파일을 해석하여 처리한다.

중간 코드의 존재때문에 Java는 C언어보다 느리다고 여겨지나 현재 여러 기술로 속도가 많이 향상되었다고 한다.



## 자바 설치 및 세팅

> 기본적인 설치와 기본적인 세팅이므로 해당 마크다운에서는 생략한다.



## Hello Project

[실습 코드]([https://github.com/BonHyuck/Java/blob/master/practice/chapter01/Hello%20Project/src/HelloWorld.java](https://github.com/BonHyuck/Java/blob/master/practice/chapter01/Hello Project/src/HelloWorld.java))

1. File -> New -> Java Project

2. src -> New -> Class

3. ```java
   public class HelloWorld {
   	public static void main(String... args) {
   		System.out.println("Hello Java World!");
   	}
   }
   ```

4. Save -> Run As -> Java Application

5. Hello Java World!