# JAVA 세팅

> Zulu와 Eclipse EE를 기본으로 사용한다.

## JAVA_HOME & PATH

- 시스템 환경 변수 설정에서 
  - JAVA_HOME = 자바가 설치된 최상위 경로
  - PATH = %JAVA_HOME%\bin
- **`java -version`** 명령어로 자바 버전 확인



## ECLIPSE 같은 IDE의 장점

> IDE = Intergrated Development Environment, 통합 개발 환경

**Coding >> Compile >> Run >> Build >> Deploy** 의 과정을 편리하고 일관성있게 관리할 수 있다.



## Java의 Primitive Type

> 메모리 할당량이 정해져 있다 <<>> Reference Type (가변적)
>
> 2진법의 숫자 표현에서 맨 앞이 1이면 음수로 계산된다

- 문자형
  - char : 16 bit
- 실수형
  - float : 32 bit (뒤에 F를 붙여준다, float f = 1.234F;)
  - double : 64 bit (뒤에 d를 붙여준다(생략 가능), double d = 1.234d;)
- 논리형
  - boolean : 1bit
- 정수형
  - byte : 8 bit
  - short : 16 bit
  - int : 32 bit
  - long : 64 bit (뒤에 L을 붙여준다, long l = 123456789L;)



**변수의 초기화** : 초기 값을 부여하는 것

큰 type 의 변수는 작은 type 의 변수에 바로 할당할 수 없다.

명시적 형변환이 가능하나 값이 손실될 수 있다.



## 형변환(Type-Casting)

- 서로 다른 Type의 변수 할당
- 작은 Type >> 큰 Type : **자동 형변환**
- 큰 Type >> 작은 Type : **명시적 형변환**
  - 큰 type 의 변수는 작은 type 의 변수에 바로 할당할 수 없다.
  - 명시적 형변환이 가능하나 값이 손실될 수 있다.



## Java 연산자

- 대부분의 연산자는 python 과 비슷하다.

- Bit 연산자 : `<<, >>(부호 유지), >>>(부호 유지 안함), ~, &, |, ^`
  - 처리 속도가 훨씬 빠르기에 자주 활용된다.

 



## Java 조건문

```java
// 자바의 조건문은 if, else if, else 를 사용하여 나타낸다
if (조건) {
    // 조건이 맞을 경우 수행
    // 아닐 경우 다음 블록
} else if(조건){
    // 위 조건이 안 맞고 해당 조건이 맞을 경우 수행
} else {
    // 위 조건이 모두 안 맞을 때 수행
}

// switch를 이용하여 표현도 가능하다
switch(변수){
    case 변수의 값 : // 작업 수행
        break; // 끝나는 지점 표시
    default:
        // 위 조건이 다 안 맞을 경우 수행
}

// 삼항 연산자로도 표현이 가능하다
// 조건 ? 조건이 맞다면 : 틀리다면
(조건) ? (if true) : (if false) 
```



## Java 반복문

```java
/*
for 를 이용한 반복문은 몇가지 조건이 필요하다
시작 인자, 인자의 반복조건, 증감조건
여러개의 초기값, 조건, 증감을 한번에 쓸 수 있다.
*/
for(시작하는 변수 선언; 변수의 조건 지정; 변수의 증감){
    수행 작업
}
/*
i는 1로 시작해서(int i = 1;) 1씩 증가하며(i++) 
i 가 10 미만일 동안 작업을 수행한다.(i<10;)
*/
for(int i = 1; i<10; i++){
    // somthing
}

// while 혹은 do-while 도 사용 가능하다
// while은 조건 우선확인, do-while은 한번 수행 후 확인
while(조건){
    //작업
} // 조건이 맞으면 작업 이후 다시 조건 확인

do{
    // 작업
} while(조건) // 작업 이후 조건 확인, 조건이 참이면 작업 재시작
```



### break vs continue

- **`break`** : 반복문을 종료하고 즉각 나감
- **`continue`** : 이 시점까지 작업을 수행하고 반복문을 이어 나감(재시작)