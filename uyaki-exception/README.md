# 使用

## 引入依赖

```xml
<parent>
    <groupId>com.uyaki</groupId>
    <artifactId>spring-uyaki</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <relativePath/> <!-- lookup parent from repository -->
</parent>
```

## 使用示例

```java
@GetMapping("/hello")
public String sayHello() {
    String jj = null;
    ArgumentResponseEnum.VALID_ERROR.assertNotEmpty(jj);
    return "hello";
}
```