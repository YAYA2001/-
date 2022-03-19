# -项目主体用java编写，通过输出输入流到excel之中，再采用matlab进行数据分析

程序\src\main\java           文件夹下面保存java源码，用来生成随机数（使用时注意修改路径）
程序\src\main\resources  文件夹下面保存java源码生成的xls文件
程序\matlab                     文件夹下面保存matlab的m文件，用来读取xls文件，并且作图

编写环境为：
jdk17.0.2（JDK1.8版本以上可以正常使用），
maven插件（必须！）3.6.1，
poi外部库（文件依赖导入，建议采用国内镜像下载源，版本3.0.0，建议不使用最新版本）
导入格式：
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi-ooxml</artifactId>
    <version>5.0.0</version>
</dependency>
源码链接：https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml/5.0.0

运行方法：java端修改路径后，右键运行即可，matlab端，运行即可。
