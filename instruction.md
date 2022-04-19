#### 没有设置main入口类, 默认通过tomcat容器启动。
idea community 配置tomcat简介：
1. Settings -> plugins -> Markets -> Smart Tomcat 安装
2. 下载tomcat压缩包，解压到本地路径
3. Settings 最下面出现 Smart Tomcat 图标， 点击 SmartTomcat -> + ->选择tomcat根目录 
4. 配置项目 Run Configuration -> new -> SmartTomcat -> Deployment Directory -> 选择 webapp路径 -> context path "/"

#### 配置文件设置解读
1. /src/main/webapp/WEB-INF/web.xml
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
