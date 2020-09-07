# Java Algorithm 1 : Array

## 입출력

> 알고리즘 문제 해결의 기본은 입출력이다
>
> 자바에서는 **스트림**을 통해 입출력을 가능케한다.

- System.in : 표준 입력
- System.out : 표준 출력
- System.err

스트림 변경

- System.setOut()
- System.setErr()
- System.setIn()

## java.util.Scanner

> 파일, 입력 스트림 등에서 데이터를 읽어 다양한 타입으로 형변환하여 리턴

- `Scanner(File source)`
- `Scanner(InputStream Source)`
- `Scanner(string source)`
- 손쉽고 편리한 입력처리 가능
- 대량의 데이터 처리시 수행시간이 **비효율**적이다.

#### 자주 쓰는 메소드

- `nextInt()` : int 타입 / 공백을 만나면 종료
- `nextDouble()` : double 타입 / 공백을 만나면 종료
- `next()` : 문자열 반환 / 공백을 만나면 종료
- **`nextLine()`** : 문자열 반환 / 공백이 아닌 줄바꿈을 만나면 종료, 공백 포함 가능



## java.io.BufferedReader

> 필터 스트림 유형 / 줄단위로 문자열을 받는다 (readLine())

- 대량의 데이터 처리시 수행시간이 **효율적**이다.
- 문자 단위의 입력(char)를 받기 때문에 byte인 `System.in` 을 바꿔주는 InputStreamReader가 필요하다.

```java
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
String something = in.readLine();
```



## java.lang.StringBuilder

> 문자열의 조작을 지원하는 클래스

새로운 문자열이 생성되는 것을 방지해줌

- append()
- toString()



# SW 문제 해결

1. 문제 읽기 및 이해
2. 문제의 재정의
3. 계획 수립
4. 계획 검증
5. 프로그램 구현
6. 개선방안 탐색

## 좋은 알고리즘?

1. 정확성 : 얼마나 정확하게 동작하는가
2. 작업량 : 얼마나 적은 연산으로 결과를 얻는가
3. 메모리 사용량 : 얼마나 적은 메모리를 사용하는가
4. 단순성 : 얼마나 단순한가
5. 최적성 : 개선 여지없이 최적화되었는가

## 알고리즘 복잡도

> 입력 크기에 대한 함수로 표기한다.

### 점근적 표기(Asymptotic Notation)

> 여러 개의 항을 가지는 다항식을 단순한 함수로 표기한다.

입력 크기가 무한대로 커질 때의 복잡도를 간단히 표현하기 위한 표기법이다.

#### 빅-오(O) 표기법

- 가장 큰 영향력을 주는 n에 대한 항만 표시



## 배열

> 같은 자료type의 변수를 하나도 묶는 자료구조

- 하나의 선언으로 둘 이상의 변수를 선언할 수 있다.
- 배열을 활용해 다수의 변수로는 힘든 작업을 수행할 수 있다.



## 재귀(Recursion)

> 주어진 문제의 해를 구하기 위해 동일하면서 더 작은 문제의 해를 이용하는 방법
>
> 함수 내부에서 직접 혹은 간접적으로 자기 자신을 호출

- 기본 부분(basis part)와 유도 파트(inductive part)로 이뤄진다.
  - 기본 부분 : 가장 기본, 가장 작은 문제의 해
  - 유도 부분 : 더 큰 문제를 위한 함수
- 반복 구조에 비해 간결하고 이해하기 쉽다.
- 함수 호출은 스택을 사용하기 때문에 메모리 및 속도에서 성능저하가 발생할 수 있다.

```java
int factorial(int n){
    // 기본
    if (n <= 1)
        return 1;
    // 유도
    else
        return n * factorial(n - 1);
}
```



### 반복 vs 재귀

- 재귀는 문제 해결을 위한 알고리즘 설계가 간단하고 자연스럽다.
- 재귀는 메모리와 연산이 많기때문에 입력값이 커질수록 비효율적일 수 있다.



### 메모이제이션(Memoization)

> 이전 계산된 값을 메모리(배열)에 저장해서 매번 다시 계산하지 않고 불러오게만 하는 기술