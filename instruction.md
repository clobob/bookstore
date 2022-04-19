没有设置main入口类, 默认通过tomcat容器启动。
idea community 配置tomcat简介：
1. Settings -> plugins -> Markets -> Smart Tomcat 安装
2. 下载tomcat压缩包，解压到本地路径
3. Settings 最下面出现 Smart Tomcat 图标， 点击 SmartTomcat -> + ->选择tomcat根目录 
4. 配置项目 Run Configuration -> new -> SmartTomcat -> Deployment Directory -> 选择 webapp路径 -> context path "/"
