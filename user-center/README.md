##添加到任意的远程仓库

1.修改代码后add，然后commit dicitory

2.git->repository->push-orign选择已有仓库或者新增远程的连接

gitLab添加公钥使其支持SSH

git clone git@192.168.1.17:root/sp-cloud-alibaba.git  #192.168.1.17 为虚拟机的ip

##springboot2.6集成swagger3.0，快速对接口进行测试
1.在pom中引入所需的坐标
<dependency>
  <groupId>io.springfox</groupId>
  <artifactId>springfox-boot-starter</artifactId>
  <version>3.0.0</version>
</dependency>
2.在启动类中添加@EnableOpenApi注解
3.在配置文件中配置
spring:
  mvc:
    pathmatch:
      matching-strategy: ant_path_matcher
