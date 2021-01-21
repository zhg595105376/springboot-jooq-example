 jooq使用实例

 相对于mybatis的优势，配置很简单，和spring整合不需要添加额外的配置文件，只需要引入相关jar包就可以了,dao文件也不需要自己写
 直接用generate 生成的即可，如果还不能满足，自己在service引入DSLContext 拼接sql代码即可

 相对于mybatis的劣势，sql语句看起来不太清晰，都是代码，这一点和hibernate有点像

# 官方文档地址 https://www.jooq.org/doc/

#springboot中使用案例（本例使用数据库为mysql）
1.pom.xml引入

<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-jooq</artifactId>
</dependency>

2.pom.xml引入jooq generate code 插件自动生成实体类和Dao类


3.注入DSLContext create到类中即可使用（本例实体类为Book，dao类为BookDao）

a.获取一条记录
Book book = bookDao.findById(id);//通过dao来获取
Book book = create.selectFrom(tableBook).where(tableBook.ID.eq(2L)).fetchAnyInto(Book.class);//通过DSLContext获取
b.获取列表记录
List<Book> list = bookDao.fetchById(ids);//通过dao来获取
List<Book> list = create.selectFrom(tableBook).where(tableBook.NAME.eq("西游记")).fetchInto(Book.class);//通过DSLContext获取

c.获取单个属性
String bookName = create.select(tableBook.NAME).from(tableBook).where(tableBook.ID.eq(2L)).fetchAnyInto(String.class);




