Gson泛型对象解析

```java
String listJson = "[{\"uid\":\"00001\",\"userName\":\"Freeman\"," +
                "\"telNumber\":\"13000000000\"}]";
List receiveAccountList = gson.fromJson(listJson,
                new TypeToken<List<Account>>() {}.getType());
System.out.println("receiveAccountList size = " + receiveAccountList.size());
```



