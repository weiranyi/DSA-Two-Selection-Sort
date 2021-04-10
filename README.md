## 一、选择排序

### 内容 ：
- 泛型的比较用到了Comparable接口<E extends Comparable<E>>

## 二、插入排序
### 内容 ：
- 时间复杂度：
  ```
  - 有序数组：O(n) 可处理银行流水的数据
  - 整体复杂度：O(n^2)
    ```
  
## 三、算法对比
### 方便理解时间复杂度
```
/Library/Java/JavaVirtualMachines/jdk-11.0.10.jdk/Contents/Home/bin/java -ea -Dfile.encoding=UTF-8 -Didea.test.cyclic.buffer.size=1048576 -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=60541:/Applications/IntelliJ IDEA.app/Contents/bin -classpath /Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar:/Users/yiweiran/.m2/repository/org/junit/platform/junit-platform-launcher/1.6.0/junit-platform-launcher-1.6.0.jar:/Applications/IntelliJ IDEA.app/Contents/plugins/junit/lib/junit5-rt.jar:/Applications/IntelliJ IDEA.app/Contents/plugins/junit/lib/junit-rt.jar:/Users/yiweiran/Documents/workplace/java/DSA-Two-Selection-Sort/target/test-classes:/Users/yiweiran/Documents/workplace/java/DSA-Two-Selection-Sort/target/classes:/Users/yiweiran/.m2/repository/org/junit/jupiter/junit-jupiter-api/5.6.0/junit-jupiter-api-5.6.0.jar:/Users/yiweiran/.m2/repository/org/apiguardian/apiguardian-api/1.1.0/apiguardian-api-1.1.0.jar:/Users/yiweiran/.m2/repository/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.jar:/Users/yiweiran/.m2/repository/org/junit/platform/junit-platform-commons/1.6.0/junit-platform-commons-1.6.0.jar:/Users/yiweiran/.m2/repository/org/junit/jupiter/junit-jupiter-engine/5.6.0/junit-jupiter-engine-5.6.0.jar:/Users/yiweiran/.m2/repository/org/junit/platform/junit-platform-engine/1.6.0/junit-platform-engine-1.6.0.jar:/Users/yiweiran/.m2/repository/com/google/code/findbugs/annotations/3.0.1/annotations-3.0.1.jar:/Users/yiweiran/.m2/repository/net/jcip/jcip-annotations/1.0/jcip-annotations-1.0.jar:/Users/yiweiran/.m2/repository/com/google/code/findbugs/jsr305/3.0.1/jsr305-3.0.1.jar com.intellij.rt.junit.JUnitStarter -ideVersion5 -junit5 com.github.weiranyi.SmokeTest,test
随机数组：
SelectionSort , n = 10000 : 0.206706 s
InsertionSortOptimize , n = 10000 : 0.308916 s
有序数组：
SelectionSort , n = 10000 : 0.249316 s
InsertionSortOptimize , n = 10000 : 0.001384 s
随机数组：
SelectionSort , n = 100000 : 14.469708 s
InsertionSortOptimize , n = 100000 : 20.665573 s
有序数组：
SelectionSort , n = 100000 : 11.497184 s
InsertionSortOptimize , n = 100000 : 0.002448 s
Student(name:亦蔚然2,score:90) Student(name:亦蔚然1,score:95) Student(name:亦蔚然3,score:100) 
```


## 收获：
- Comparable接口：实现具体比较的逻辑
- 有序数组可以使用插入排序法
