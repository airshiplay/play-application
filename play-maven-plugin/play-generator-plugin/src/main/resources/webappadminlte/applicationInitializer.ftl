package  ${modulePackage};

import com.airlenet.integration.core.ApplicationInitializer;
import com.airlenet.play.main.entity.PermissionEntity.PermissionType;
import com.airlenet.play.main.entity.MenuEntity;
import com.airlenet.play.main.InitDataTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ${'${moduleName}'?cap_first}ApplicationInitializer extends ApplicationInitializer {
    @Autowired
    private InitDataTools tools;

    @Override
    public void onRootContextRefreshed() {

        int sortNo=5;
        if (!tools.existMenuCode("${moduleName}_management")) {
            MenuEntity ${moduleName}Management = tools.createMenuByParent("", "${moduleName}_management","fa fa-wpforms", null, null, sortNo++, null);
            <#list entityList as entity>
            tools.createMenuByParent("", "${moduleName}_${'${shortSimpleName}'?lower_case}_list", "fa fa-file-text","page/${moduleName}/${'${shortSimpleName}'?uncap_first}/${'${shortSimpleName}'?uncap_first}List", null, sortNo++, ${moduleName}Management);
            </#list>
        }
    }
}
