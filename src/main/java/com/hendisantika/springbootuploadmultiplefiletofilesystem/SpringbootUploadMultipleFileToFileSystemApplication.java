package com.hendisantika.springbootuploadmultiplefiletofilesystem;

import com.hendisantika.springbootuploadmultiplefiletofilesystem.service.FileStorage;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class SpringbootUploadMultipleFileToFileSystemApplication implements CommandLineRunner {

    @Resource
    FileStorage fileStorage;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootUploadMultipleFileToFileSystemApplication.class, args);
    }

    @Override
    public void run(String... args) {
        fileStorage.deleteAll();
        fileStorage.init();
    }
}
