package com.macos.demo;

import com.macos.framework.annotation.Get;
import com.macos.framework.annotation.MacosXApplication;
import com.macos.framework.annotation.RestAPI;
import com.macos.framework.starter.run.MacosXApplicationRun;


/**
 * Hello world!
 *
 */
@MacosXApplication
@RestAPI
public class Application
{

    public static void main( String[] args )
    {
        MacosXApplicationRun.run(Application.class,args);
    }

    @Get
    public String helloWorld(){
        return "Hello World！";
    }
}
