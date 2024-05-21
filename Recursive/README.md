# 遞迴 (Recursion)

在遞迴中,一個問題被分解為相同的小問題,直到小問題可以直接解決為止。遞迴常用於處理樹形或階層式的資料結構,以及某些數學問題。它透過重複調用自身的方式來解決問題。

## 基本結構

一般來說,遞迴函數會包含以下三個部分:

1. **基線條件 (Base Case)**: 用於停止遞迴的條件,通常是問題的最小實例。
2. **遞迴條件 (Recursive Case)**: 將原問題分解為較小的子問題,並遞迴地解決這些子問題。
3. **遞迴體 (Recursive Body)**: 執行實際的遞迴運算,通常涉及將子問題的解組合成原問題的解。

```java
public void recursiveFunction(/* parameters */) {
    // Base Case
    if (/* base case condition */) {
        // Base case solution
        return;
    }

    // Recursive Case
    // Perform some operations

    // Recursive call(s)
    recursiveFunction(/* updated parameters */);

    // Recursive Body
    // Perform additional operations (optional)
}
```

## Java 程式語法

以下是一些 Java 程式語法和教學:
基本語法

```java
// 單行註解

/*
多行註解
*/

// 變數宣告
int x = 5; // 整數
double y = 3.14; // 浮點數
boolean b = true; // 布林值

// 條件語句
if (x > 0) {
    // 執行語句
} else {
    // 執行其他語句
}

// 迴圈
for (int i = 0; i < 10; i++) {
    // 執行語句
}

while (x > 0) {
    // 執行語句
    x--;
}

// 方法定義
public int add(int a, int b) {
    return a + b;
}
```

## 類別和物件

```java
// 定義類別
public class MyClass {
    // 成員變數
    private int x;

    // 建構子
    public MyClass(int x) {
        this.x = x;
    }

    // 方法
    public int getValue() {
        return x;
    }

    public void setValue(int x) {
        this.x = x;
    }
}

// 建立物件實例
MyClass obj = new MyClass(10);
int value = obj.getValue(); // 10
obj.setValue(20);
value = obj.getValue(); // 20
```

## 陣列與集合

```java
 // 陣列
int[] arr = new int[5]; // 長度為5的整數陣列
arr[0] = 10; // 設定第一個元素為10

// 列表 (ArrayList)
List<Integer> list = new ArrayList<>();
list.add(10); // 添加元素
list.get(0); // 取得第一個元素

// 映射 (HashMap)
Map<String, Integer> map = new HashMap<>();
map.put("apple", 1); // 設定鍵值對
map.get("apple"); // 取得值
```
