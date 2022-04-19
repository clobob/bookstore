#### 没有设置main入口类, 默认通过tomcat容器启动。
idea community 配置tomcat简介：
1. Settings -> plugins -> Markets -> Smart Tomcat 安装
2. 下载tomcat压缩包，解压到本地路径
3. Settings 最下面出现 Smart Tomcat 图标， 点击 SmartTomcat -> + ->选择tomcat根目录 
4. 配置项目 Run Configuration -> new -> SmartTomcat -> Deployment Directory -> 选择 webapp路径 -> context path "/"

#### 配置文件设置解读
1. /src/main/webapp/WEB-INF/web.xml 入口配置
```
<!--配置spring配置文件-->
   <context-param>
        <param-name>contextConfigLocation</param-name>
        <param-value>classpath:/applicationContext_*.xml</param-value>
   </context-param>
   
   <!-- 配置spring mvc前端控制器 -->
    <error-page>
        <error-code>404</error-code>
         <location>/WEB-INF/static/404.html</location>
    </error-page>

  <servlet>
        <servlet-name>springmvc</servlet-name>
        <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
        <init-param>
            <param-name>contextConfigLocation</param-name>
            <param-value>classpath:springmvc_config.xml</param-value>
        </init-param>

    </servlet>

    <servlet-mapping>
        <servlet-name>springmvc</servlet-name>
        <url-pattern>*.do</url-pattern>
    </servlet-mapping>
```
2. spring 配置
   a. applicationContext_service.xml
   ```
   <!-- 负责将net.togogo.empmvc141.service包及子包中，有@Service,@Compoment,@Repository注解的组件加载到spring中 -->
	<context:component-scan base-package="com.laver.bookstore.service"></context:component-scan>
   ```
   b. applicationContext_dao.xml
   ```
   <!-- 读取db.properties中的变量 值，db.properties要放在classpath根目录下 -->
	<context:property-placeholder location="classpath:/db.properties" />
	
	<!-- 描述一个数据源,BasicDataSource,c3p0,阿里巴巴 -->
	<bean id="dataSource" class="org.apache.commons.dbcp.BasicDataSource">
		<property name="driverClassName" value="${jdbc.driverClassName}" />
		<property name="url" value="${jdbc.url}" />
		<property name="username" value="${jdbc.username}" />
		<property name="password" value="${jdbc.password}" />
	</bean>
	

	<!--mybatis  SqlSessionFactory配置-->
	<bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
		<property name="dataSource" ref="dataSource"/>
       	<!--  自动扫描到net/togogo/springmybatisproject/dao的xml文件-->
		<property name="mapperLocations" value="classpath:/mapper/*.xml"/>
		
		<!-- 关联mybatis配置文件 -->
		<property name="configLocation" value="classpath:/SqlMapConfig.xml"></property>
	</bean>
	
	<!-- 自动扫描mybatis定义的mapper类  ，spring扫描到这些mapper类之后，就会向spring容器注册这些mapper类对象-->
	<bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
		<property name="basePackage"  value="com.laver.bookstore.mapper"/>
	</bean>
   ```
   
   c. springmvc_config.xml
   ```
   	<!-- 必须要加上这一行代码，spring会把base-package包下面的类当成控制器来处理 -->
    <context:component-scan base-package="com.laver.bookstore.controller"/>



<!-- 配置视图解析器 -->
	<bean
		class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="prefix" value="/WEB-INF/" />
		<property name="suffix" value=".jsp" />
	</bean>

	<bean class="org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter" >
		<property name="messageConverters">
			<list>
				<bean class = "org.springframework.http.converter.StringHttpMessageConverter">
					<property name = "supportedMediaTypes">
						<list>
							<value>text/html;charset=UTF-8</value>
						</list>
					</property>
				</bean>
			</list>
		</property>
	</bean>
   ```
