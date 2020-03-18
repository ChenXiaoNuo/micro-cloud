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

最多只能同时较好的满足两个。
CAP理论的核心是：**一个分布式系统不可能同时很好的满足一致性，可用性和分区容错性三个需求**，因此，根据CAP原理将NOSQL数据库分成了满足CA、CP和AP原则三大类。
- CA:单点集群，满足一致性，可用性的系统，通常在可拓展性上不太强大
- CP:满足一致性，分区容错性的系统，通常性能不是特别高
- AP:满足可用性，分区容错性的系统，通常可能对一致性要求低一些
   
