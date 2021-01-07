# jie-repository
阿杰的仓库呀</br>
对activiti工作流实现重新封装，使用springCloud重构</br>
（初次使用springCloud，记录理解）</br>
2020/12/25</br>
1.Eureka：用于注册服务，注册中心，发现服务，注册表记录所有客户端注册得服务地址和端口，多个服务间互相注册时需要做域名映射</br>
2.Eureka Client：负责将这个服务的信息注册到Eureka Server中</br>
  Eureka Server：注册中心，里面有一个注册表，保存了各个服务所在的机器和端口号</br>
3.Feign：为所需接口使用@FeignClient注解定义，其他服务调用时feign会针对此注解得接口创建一个动态得代理，使用feign简化调用代码，调用时本质上就是调用feign所创建得代理</br>
4.Ribbon：针对服务做了集群时feign不知道你所请求得服务需要调用集群中得那一台服务器，使用ribbon解决这个问题，也就是所说得负载均衡，ribbon会把请求均匀得把请求发送到集群得服务器，使用得是Round Robin轮询算法</br>
5.Hystrix：隔离、熔断以及降级的一个框架，建立n多的线程池每个线程池互不干扰，各自请求各自的服务，如果某个服务挂掉了，就对当前线程池进行熔断、降级，反馈给调用的其他服务，根据所需业务告诉它当前服务挂掉了，某些业务处理未成功，未成功的记录下来，等服务重新启动了，就可以根据记录重新手工操作之类。</br>
6.Zuul：如果前端、移动端要调用后端系统，统一从Zuul网关进入，由Zuul网关转发请求给对应的服务</br>
7.springCloudConfig:解决分布式系统的配置管理方案。它包含了Client和Server两个部分，server提供配置文件的存储、以接口的形式将配置文件的内容提供出去，client通过接口获取数据、并依据此数据初始化自己的应用
