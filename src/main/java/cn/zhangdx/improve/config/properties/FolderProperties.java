package cn.zhangdx.improve.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author ZDX
 * @date 2025/8/11 16:53
 */
@Component
@ConfigurationProperties("file.upload.folder")
@Data
public class FolderProperties {
    private String userFile;
    private String webFile;
    private String articleFile;
}
