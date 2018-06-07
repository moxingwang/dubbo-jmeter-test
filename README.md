使用jmeter压测dubbo服务

## 使用方法

#### 配置consumer
````apple js
修改spring-config-dubbo-consumer.xml
````

#### 打包
````
mvn clean package -Dmaven.test.skip=true
````


## 参考
* [性能测试工具 Jmeter 测试 Dubbo 接口脚本编写](https://testerhome.com/topics/9980)
* [jemter-dubbo-test](https://github.com/kevinleedev/jmeter-dubbo-test-demo)