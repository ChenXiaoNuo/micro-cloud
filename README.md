###### 三个注册中心的异同点
组件名 | 语言 | CAP | 服务健康检查 | 对外暴露接口 | Spring Cloud集成
-|-|-|-|-|-
Eureka | Java | AP | 可配支持 | HTTP | 已集成
Zookeeper | Java | CP | 支持 | 客户端 | 已集成
Consul | Go | CP | 支持 | HTTP/DNS | 已集成
###### CAP
- C:Consistency(强一致性)
- A:Availability(可用性)
- P:Partition tolerance(分区容错性)
