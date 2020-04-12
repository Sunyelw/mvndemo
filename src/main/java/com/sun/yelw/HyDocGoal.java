package com.sun.yelw;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * 包:        com.sun.yelw
 * 类名称:     HyGoal
 * 类描述:     文档方式 自定义 maven 目标， 在文档注释中添加注解 @goal @parameter
 * 创建人:     huangyang
 * 创建时间:   2019/11/4 13:37
 *
 * @goal hy-doc
 */
public class HyDocGoal extends AbstractMojo {

    // 这种写法被废弃了
    // @parameter expression="${name}"
    /**
     * @parameter property="name"
     */
    private String name;

    // @parameter expression="${age}"
    /**
     * @parameter property="age"
     */
    private String age;

    public void execute() throws MojoExecutionException, MojoFailureException{

        getLog().error("++++++++++++++++++++");
        getLog().error("hy-plugin-execute-by-document");
//        getLog().error("name: " + name + ", age: " + age);
        getLog().error("++++++++++++++++++++");

    }
}
