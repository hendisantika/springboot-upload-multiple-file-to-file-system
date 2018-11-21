package com.hendisantika.springbootuploadmultiplefiletofilesystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-upload-multiple-file-to-file-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 21/11/18
 * Time: 21.20
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FileInfo {
    private String filename;
    private String url;
}
