package cc.mrbird.febs.common.selector;

import cc.mrbird.febs.common.config.FebsAuthExceptionConfigure;
import cc.mrbird.febs.common.config.FebsOAuth2FeignConfigure;
import cc.mrbird.febs.common.config.FebsServerProtectConfigure;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class FebsCloudApplicationSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{
                FebsAuthExceptionConfigure.class.getName(),
                FebsOAuth2FeignConfigure.class.getName(),
                FebsServerProtectConfigure.class.getName()
        };
    }
}
