---
tags:
  - 注解
---
### JDK内置的三个注解：
- @Override 重写的方法
- @Deprecated 已过时的元素，不代表不能用，该注解主要用于版本更替
- @SuppressWarnings 用来抑制你不想看到的⚠️警告信息

### 注解的也是有源码可以查看的
#### 注解源码内有四种元注解，用来详细定义该注解的适用范围

| 元注解名       | 作用范围                 |
| ---------- | -------------------- |
| Rentention | SOURCE，CLASS，RUNTIME |
| Target     | 如下很多                 |
| Documented | 指定该注解是否会在javadoc体现   |
| Inherited  | 子类会继承注解              |

##### 查看的内容
- @Target 后写了该注解详细的使用范围，哪些位置可以使用该注解，例如@SuppressWarnings 注解的Target为{==TYPE==，==FIELD==, ==METHOD==, ==PARAMETER==, ==CONSTRUCTOR==, ==LOCAL_VARIABLE==, ==MODULE==}分别对应泛型、字段、方法、参数、构造器、局部变量、代码块 前面
- 