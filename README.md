## springboottest

## 资料
[Spring 文档](https://spring.io/guides)  
[Spring Web](https://spring.io/guides/gs/serving-web-content/)  
[es社区](https://elasticsearch.cn/explore)  
[Github depoly key](https://developer.github.com/v3/guides/managing-deploy-keys/#deploy-keys)  
[Bootstrap](https://v3.bootcss.com/)  
[Github OAuth](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)


## 工具
[Git](https://git-scm.com/downloads)  
[Visual Paradigm](https://www.visual-paradigm.com)  
[OkHttp](https://square.github.io/okhttp/)  
[flyway](https://flywaydb.org/getstarted/firststeps/maven)   


## 脚本  
```sql
create table USER
(
    ID INT default auto_increment,
    ACCOUNT_ID   VARCHAR(100),
    NAME         VARCHAR(50),
    TOKEN        CHAR(36),
    GMT_CREATE   BIGINT,
    GMT_MODIFIED BIGINT,
    constraint USER_PK
        primary key (ID)
);
```
```bash
 mvn flyway:migrate
```