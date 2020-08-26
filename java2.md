# Array

여러 개의 값을 저장하기 위해 변수를 할당하면 

- 변수의 수 증가
- 코드 길이 증가
- 반복문 적용 불가
- 변수의 개수 동적 할당 불가

이는 굉장히 비효율적이고 컴퓨터 메모리에 좋지 않다.

**그래서 우리는 Array를 사용한다**(동일 Type 변수일 때)

- 변수의 수 감소
- 코드 길이 감소
- 반복문 적용 가능
- 변수의 개수 동적 사용 가능



## How to make Array

```java
변수type[] 배열명 = new 변수type[배열크기];
변수type 배열명 [] = new 변수type[배열크기];
// 할당은 Index 사용 (0부터 시작)
배열명[index] = 값;

// 배열 선언과 값 할당 동시에 하기
변수type[] 배열명 = {값1, 값2, ... 원하는 만큼}

// 배열의 길이를 알기 위해선 .length를 사용한다.
배열명.length;
```

- 배열을 만들 때 값을 할당하지 않는다면 기본값(Default value)을 갖는다.



#### Primitive Type은 Stack에 Reference Type(ex. Array)은 Heap 에 저장이 된다.



## for-each

> `:` 를 사용해서 index가 아닌 요소에 직접 접근한다.

```java
for(변수type 변수명 : 해당 변수type을 가진 배열){
    배열 내 변수를 1개씩 꺼내서 작업을 수행한다.
}
```



#### System.arraycopy를 이용해 배열을 복사할 수 있다.

```java
System.arraycopy(원본, 원본index, 복사본을 넣을 배열, 복사본index, 개수)
```



## 배열은 변경이 불가능하다

- 개별 요소는 다른 값으로 변경이 가능하나 삭제는 불가능하다
- 크기를 늘리거나 줄일 수 없다.
- 변경이 필요하다면 **새로 작성하는 편이 낫다**
- 최초 Memory Allocation 이후 변경이 안된다



## 2차원 배열

```java
변수type[][] 배열명 = new 변수type[행개수(row)][열개수(col)];
```



2차원 배열에서 안에 위치하는 배열은 나중에 생성이 가능하다

```java
변수type[][] 배열이름 = new 변수type[행개수][];
// 추후에 생성함으로써 다양한 크기의 2차 배열을 만들 수 있다.
배열명[index1] = new 변수type[number1];
배열명[index2] = new 변수type[number2];
			...
```



# java.util.Scanner

> 사용자에게 입력을 받기위해 필요한 클래스(Primitive types and String)
>
> Scanner 외 다른 것도 많지만 Scanner를 우선적으로 다룰줄 알아야한다.
>
> Java official doc 확인

```java
import java.util.Scanner
Scanner scanner = new Scanner(System.in);
```



### java.lang.ArrayIndexOutOfBoundsException

> 배열에서 index의 범위가 벗어나면 발생되는 예외(Exception)