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
      
      
git remote add origin git@192.168.1.17:root/sp-cloud-alibaba.git


git fetch origin master 
From git@192.168.1.17:root/sp-cloud-alibaba.git

git pull git@192.168.1.17:root/sp-cloud-alibaba.git master

git pull origin master 更新代码到本地
##方法重写应当遵循的规则
1.参数列表必须相同
2.返回类型必须相同
3.被子类重写的方法不能拥有比父类方法更加严格的访问权限

##方法的重载
1.定义：所谓方法重载是指在一个类中，多个方法的方法名相同，但是参数列表不同。参数列表不同指的是参数个数、参数类型或者参数的顺序不同
2.特殊说明：方法的重载在实际应用中也会经常用到。不仅是一般的方法，构造方法也可以重载
3.一般约束：在方法重载时，方法之间需要存在一定的联系，因为这样可以提高程序的可读性，一般只重载功能相似的方法
4.直观的定义：重载是指我们可以定义一些名称相同的方法，通过定义不同的参数来区分这些方法，然后再调用时，Java虚拟机就会根据不同的参数列表来选择合适的方法执行。也就是说，当一个重载方法被调用时，Java用参数的类型或个数来决定实际调用的重载方法。因此，每个重载方法的参数的类型或个数必须是不同
5.注意点：
 5.1.在使用重载时只能通过不同的参数列表，必须具有不同的参数列表。
 5.2.不能通过访问权限、返回类型、抛出的异常进行重载。
 5.3.方法的异常类型和数目不会对重载造成影响。
 5.4.可以有不同的返回类型，只要参数列表不同就可以了。
 5.5.可以有不同的访问修饰符。
 5.6.可以抛出不同的异常。
6.重载的规则
 6.1被重载的方法必须改变参数列表；
 6.2被重载的方法可以改变返回类型；
 6.3被重载的方法可以改变访问修饰符；
 6.4被重载的方法可以声明新的或更广的检查异常；
 6.5方法能够在同一个类中或者在一个子类中被重载

