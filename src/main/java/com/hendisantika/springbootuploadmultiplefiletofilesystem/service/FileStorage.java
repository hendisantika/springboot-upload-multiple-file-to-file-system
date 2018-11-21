package com.hendisantika.springbootuploadmultiplefiletofilesystem.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-upload-multiple-file-to-file-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 21/11/18
 * Time: 21.21
 */
public interface FileStorage {
    void store(MultipartFile file);

    Resource loadFile(String filename);

    void deleteAll();

    void init();

    Stream<Path> loadFiles();
}
