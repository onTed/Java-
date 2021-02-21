## Spring

默认单实例时IoC容器启动时会调用方法创建对象放在IoC容器中，以后每次获取就是直接从容器中拿。

**@Conditional**({WindowsCondition.class})方法或者类中组件统一设置满足当前条件，这个方法或者类中配置的所有bean注册才能生效。

**给Spring容器中注册组件：**

1.包扫描+组件标注注解(@Controller,@Service,@Repository,@Component)

2.@Bean-->导入的第三方包里面的组件

3.@Import-->快速给容器中导入一个组件

​	3.1@Import(要导入到容器中的组件)；容器就会默认注册这个组件，组件的id默认是全类名

​	3.2@ImportSelector返回需要导入的组件的全类名数组

​	3.3@ImportBeanDefinitionRegistrar手动注册bean到容器中

4.使用BeanFactory给容器中添加一个组件


**spring中beanFactory和factoryBean**

beanFactory是创建bean的工厂，它是spring的容器。
factoryBean是工厂bean，是工厂bean，通过getObject()获取它创建的对象，通过&name获取它本身。
