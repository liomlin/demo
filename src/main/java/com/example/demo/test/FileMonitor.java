package com.example.demo.test;

import java.io.File;

public class FileMonitor extends FileAlterationListenerAdaptor{
    @Override
    public void onFileCreate(final File file) {
        // 文件创建
       // doSomething();
    }

    @Override
    public void onFileDelete(final File file) {
        // 文件删除
       // doSomething();
    }
}
