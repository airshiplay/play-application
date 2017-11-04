1、需要安装MySQL数据库
2、数据库配置见min-website/src/main/resources/config.properties
    ```
    jdbc.url=jdbc:mysql://127.0.0.1:3306/mdm?useUnicode=true&characterEncoding=utf-8&useSSL=false
    jdbc.username=root
    jdbc.password=root
    
    ```
3、访问业务,提供了示例
    http://ip:port/
    http://ip:port/api/user/1
    http://ip:port/api/user/list
  