使用jmeter压测dubbo服务。

## Overview
* git地址: [dubbo-jmeter-test](https://github.com/moxingwang/dubbo-jmeter-test)
* jmetter版本3.2, dubbo版本2.8.5。

## 使用方法

#### 配置consumer
````apple js
修改spring-config-dubbo-consumer.xml
````
> 使用前配置好自己的dubbo服务。

#### 打包
````
mvn clean package -Dmaven.test.skip=true
````

#### jmeter设置
* 将打包后的jar放到[jmeter文件目录]/lib/ext目录下。
* 启动jmeter GUI界面，依次添加线程组，Sampler-java请求，如图
![](https://github.com/moxingwang/dubbo-jmeter-test/blob/87a4a0f10a344c6dd1b9067c361151243b436994/source/%E5%BE%AE%E4%BF%A1%E6%88%AA%E5%9B%BE_20180608101320.png?raw=true)
* 选择类名就可以对不同的方法做压测

## 参考
* [性能测试工具 Jmeter 测试 Dubbo 接口脚本编写](https://testerhome.com/topics/9980)
* [jemter-dubbo-test](https://github.com/kevinleedev/jmeter-dubbo-test-demo)