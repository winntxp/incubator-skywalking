package org.skywalking.apm.collector.core.module;

import java.util.Map;
import org.skywalking.apm.collector.core.cluster.ClusterModuleInstaller;
import org.skywalking.apm.collector.core.framework.DefineException;
import org.skywalking.apm.collector.core.worker.WorkerModuleInstaller;

/**
 * @author pengys5
 */
public class ModuleInstallerAdapter implements ModuleInstaller {

    private ModuleInstaller moduleInstaller;

    public ModuleInstallerAdapter(ModuleGroup moduleGroup) {
        if (ModuleGroup.Cluster.equals(moduleGroup)) {
            moduleInstaller = new ClusterModuleInstaller();
        } else if (ModuleGroup.Worker.equals(moduleGroup)) {
            moduleInstaller = new WorkerModuleInstaller();
        }
    }

    @Override public void install(Map<String, Map> moduleConfig,
        Map<String, ModuleDefine> moduleDefineMap) throws DefineException {
        moduleInstaller.install(moduleConfig, moduleDefineMap);
    }
}
