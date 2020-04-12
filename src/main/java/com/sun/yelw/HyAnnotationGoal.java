package com.sun.yelw;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * 项目名称:   pinkstone
 * 包:        com.sun.yelw
 * 类名称:     HyAnnotationGoal
 * 类描述:     注解方式 自定义 maven 目标，并绑定到 maven 插件
 * 创建人:     huangyang
 * 创建时间:   2019/11/4 14:31
 */
@Mojo(name = "hy-an", defaultPhase = LifecyclePhase.COMPILE)
public class HyAnnotationGoal extends AbstractMojo {

    @Parameter
    private String age;

    @Parameter
    private String name;

    public void execute() throws MojoExecutionException, MojoFailureException{
//        getLog().error("name: " + name);
        getLog().error("++++++++++++++++++++");
        getLog().error("hy-plugin-execute-by-annotation");
        getLog().error("++++++++++++++++++++");
//        getLog().error("age: " + age);
    }
}
