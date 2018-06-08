## Overview
> 使用jmeter压测dubbo服务。jmetter版本3.2。

## 使用方法

#### 配置consumer
````apple js
修改spring-config-dubbo-consumer.xml
````

#### 打包
````
mvn clean package -Dmaven.test.skip=true
````

#### jmeter设置
* 将打包后的jar放到[jmeter文件目录]/lib/ext目录下。
* 启动jmeter GUI界面，依次添加线程组，Sample-java请求，如图


## 参考
* [性能测试工具 Jmeter 测试 Dubbo 接口脚本编写](https://testerhome.com/topics/9980)
* [jemter-dubbo-test](https://github.com/kevinleedev/jmeter-dubbo-test-demo)