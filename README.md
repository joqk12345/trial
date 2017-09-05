## 庭审管理系统后台服务
*  spring-boot-starter-actuator 组件监控组件健康的使用方法
    * 访问应用的很多信息 /env、/info、/metrics、/health 
    * http://localhost:8080/health 
*   data-jpa 中多表查询
*   javascript 发送数据
*   spring-boot test 测试(ok)
    * 热词管理的测试用例(ok)
    * 多表关联查询测试
* rest数据访问接口（ok)
    * http://localhost:8080/profile
* jquery 匿名函数调用
    * 问题已经解决，匿名函数调用，但是不太熟悉 
* jquery 对json数据的解析{ok}
    * 使用$.each 函数{ok}
* rest-data 配置前缀{ok}
* spring boot 允许跨域{ok}
    * 使用filter进行跨域{ok}
* ie8 ajax 调试
    * 断点调试查看变量的值
    * ie8 jquery ajax 请求
* 模板列表展示
    * 列表分页{ok}
    * 模板添加
    * 模板删除
        * 删除需要逻辑删除
    * 模板修改
    * 模板下载
* 案件列表
    * 展示{ok}
        * 日期格式设置{ok}
        * 查询框中的时间选择{ok}
        * select框中的列表填充
        * 虚拟列的填充 @Transient{ok}
    * 列表
        * 分页{ok}
        * 检索
            * 时间框以及按照时间范围检索
        * 分页
        * 按照native query 方法进行SQL查询
    * 添加
        * 输入时间框 {ok}
    * 删除
        * 删除需要逻辑删除
    * 修改
    * 下载
* 用户登录
    *  登录验证
        * spring data jpa 通过方法创建查询{ok}
           * (https://www.ibm.com/developerworks/cn/opensource/os-cn-spring-jpa/index.html)
        * search方法
            * 所有的搜索都基于search 方法 http://localhost:8080/api/user/search
        * Get
            * 分页 http://localhost:8080/persons?page=1&size=5{&sort}
    * search 查询方法暴露
        * 通过 @RestResource 注解实现
* js校验
* js 事件传播机制
    * 通过jquery动态加载html元素的时候也需要动态给其添加样式或者js事件

* 查询问题的校验
    1. 针对js日期控件的显示问题，由于针对表格选择器是使用的通用选择器没有限定范围导致，日期控件本来就是用表格显示的，现在通用表格就改变了他的样式
    2. #tableList table  解决办法，及采用定位好自己的选择的那部分表格使用css样式
    3. 解决日期格式转换问题
    4. js前端需要控制查询逻辑，而不是把请求参数发到后端处理
* 日志的添加与使用
    1.  Note: further occurrences of Parameter errors will be logged at DEBUG level.
  
  
# spring jpa 
    1. https://spring.io/blog/2011/02/10/getting-started-with-spring-data-jpa/
    2. https://yq.aliyun.com/articles/91891  {jpa查询规范案例，阿里云上面的}
    3. http://www.cnblogs.com/chenpi/p/6357527.html  springdata JPA案例
    4. http://blog.csdn.net/soul_code/article/details/54139709 
        1. @Projection定义的数据格式还可以直接配置到Repository之上，就像下面代码中的这样
    5. http://blog.csdn.net/u010429286/article/details/52724451   {支持查询条件分页}
    6. http://www.cnblogs.com/chenying99/archive/2013/06/19/3143539.html  { jpa的三种查询方法}
    7. https://docs.spring.io/spring-data/jpa/docs/1.10.11.RELEASE/reference/html/#jpa.named-parameters {jpa 官方文档}
    8. https://stackoverflow.com/questions/38349930/spring-data-and-native-query-with-pagination {原生查询加分页实现}
    9. http://blog.csdn.net/tomnic_ylwang/article/details/47340799  {spring-data-jpa  @Query 注解中的 like 模糊查询关键字使用}
# spring data rest 
    1. https://springcloud.cc/spring-data-rest-zhcn.html  （中文版）
    2. https://docs.spring.io/spring-data/rest/docs/current/reference/html/
    3. https://spring.io/guides/gs/accessing-data-rest/  {用例 国外}
    4. https://github.com/spring-projects/spring-data-book/tree/master/rest  {用例}
    
# spring API
    1. https://docs.spring.io/spring-data/rest/docs/current/api/org/springframework/data/rest/core/annotation/RestResource.html
#  Web平台的获取数据的算法和规范
    1.https://fetch.spec.whatwg.org/
# JSON函数在IE8 下执行需要制定好浏览器版本{文档兼容性}
    1. http://www.iitshare.com/ie8-not-use-native-json.html   
    2. https://msdn.microsoft.com/zh-cn/library/cc288325(VS.85).aspx 
        3. 当 Internet Explorer 8 遇到未包含 X-UA-Compatible 标头的网页时，它将使用 <!DOCTYPE> 指令来确定如何显示该网页。 如果该指令丢失或未指定基于标准的文档类型，则 Internet Explorer 8 将以 IE5 模式（Quirks 模式）显示该网页。
    3. https://bestiejs.github.io/json3/   json3 的库的使用
# 前端时间控件-完美兼容IE8
    1. http://www.jq22.com/jquery-info1525   